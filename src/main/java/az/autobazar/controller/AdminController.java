package az.autobazar.controller;


import az.autobazar.domain.*;
import az.autobazar.notification.*;
import az.autobazar.service.AutoService;
import az.autobazar.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AutoService autoService;


    @GetMapping("/")
    public String getIndex() {
        return "admin/index";
    }


    @GetMapping("/flexible-list")
    public String viewFlexibleListAdmin() {
        return "/admin/flexible-list";
    }

    @GetMapping("/pendingAutos")
    public String getPending() {
        return "admin/pending-autos";
    }


    @Autowired
    NotificationService notificationService;

    @GetMapping
    public String getAdmin() {
        return "admin/index";
    }


    @GetMapping("users")
    public String getAllUsers() {

        return "admin/users";
    }

    @GetMapping("approvedAutos")
    public String getApproved() {
        return "admin/approved-autos";
    }

    @GetMapping("/pendingAutoDetail")
    public ModelAndView getPendingDetailAuto(@RequestParam long id) {

        ModelAndView mv = new ModelAndView("admin/pending-auto-detail");
        Optional<Auto> detailAuto = autoService.getPendingAutoDetailById(id);

        if (detailAuto.isPresent()) {

            Auto auto = detailAuto.get();
            NotificationDto notification = new NotificationDto();
            notification.setAutoId(id);

            mv.addObject("notification", notification);
            mv.addObject("auto", auto);
        } else {
            System.out.println("db-da id-si: " + id + " olan elanla" + " bagli problem");
        }
        return mv;
    }

    @PostMapping("/sendMessageToUser")
    public ResponseEntity<Boolean> sendMessage(@RequestBody NotificationDto notificationDto) {
        long autoId = notificationDto.getAutoId();
        String message = notificationDto.getMessage();
        Optional<Auto> optionalAuto = autoService.getAutoById(autoId, false);


        if (optionalAuto.isPresent() && message!=null && StringUtils.hasText(message.toString())) {

            Auto auto = optionalAuto.get();
            Notification newNotification = new Notification();
            newNotification.setFrom(WebConstants.FROM);
            newNotification.setTo(auto.getUser().getEmail());
            newNotification.setType(NotificationType.EMAIL);
            newNotification.setSubject(EmailTemplate.Email_AUTO_SUBJECT);
            newNotification.setContent(message);
            newNotification.setNotificationStatus(NotificationStatus.PENDING);
            newNotification.setSource(EmailTemplate.SOURCE_SYSTEM);
            notificationService.add(newNotification);
            return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
        }

        return new ResponseEntity<>(Boolean.FALSE,HttpStatus.BAD_REQUEST);
    }

    @GetMapping("auto-count")
    public ResponseEntity<AutoCount> getAutoCount() {

        AutoCount autoCount = new AutoCount();
        autoCount.setPending(autoService.getCountPendingAutos());
        autoCount.setApproved(autoService.getCountApprovedAutos());
        autoCount.setIstifadeciler(autoService.getCountUsers());

        return new ResponseEntity<>(autoCount, HttpStatus.OK);

    }


    @GetMapping("userInformation")
    public ModelAndView getInformation(@RequestParam(name = "id") long id) {
        ModelAndView mnv = new ModelAndView("admin/user-information");
        Optional<User> optionalUser = autoService.getUserInformationById(id);
        List<Auto> autoList = autoService.getAutosByUserId(id);


        if (optionalUser.isPresent()) {
            mnv.addObject("optionalUser", optionalUser.get());
            System.out.println("istifadecinin idsi!!!!!!!!!!! =" + id);
        }

        mnv.addObject("autoList", autoList);
        System.out.println("autos of this user: " + autoList + "autolistsize" + autoList.size());
        return mnv;
    }

    @GetMapping("/insert")
    public String getInsertPage() {
        return "admin/insert-brand-model-series";
    }


    @GetMapping("/insertBrand")
    public ModelAndView insertBrand(@RequestParam(name = "brand") String valueName, @RequestParam(name = "status") int status) {
        ModelAndView mav = new ModelAndView("admin/insert-brand-model-serie");

        autoService.insertBrand(valueName, status);

        return mav;
    }

}
