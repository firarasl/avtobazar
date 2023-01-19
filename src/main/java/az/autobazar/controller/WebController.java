package az.autobazar.controller;

import az.autobazar.domain.Auto;
import az.autobazar.domain.RegistrationForm;
import az.autobazar.domain.User;
import az.autobazar.service.AutoService;
import az.autobazar.service.UserService;
import az.autobazar.util.RegistrationFormUtil;
import az.autobazar.validator.RegistrationFormValidator;
import az.autobazar.view.AutoListExcelView;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/")
public class WebController {

    private static final Logger logger = Logger.getLogger(WebController.class.getName());


    @Autowired
    private AutoService autoService;

    @Autowired
    private UserService userService;

    @Autowired
    private RegistrationFormValidator registrationFormValidator;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        if(dataBinder.getTarget().getClass() == RegistrationForm.class) {
            dataBinder.setValidator(registrationFormValidator);
        }
    }

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("web/index");
        List<Auto> autoList = autoService.getAutoList();
        logger.debug("auto list = " + autoList);
        mav.addObject("autoList", autoList);
        return mav;
    }

    @GetMapping("/autoList")
    public ResponseEntity<List<Auto>> getBrand(){
        List<Auto> autoList = autoService.getAutoList();
        return ResponseEntity.ok(autoList);
    }

    @GetMapping("/auto")
    public ModelAndView viewAuto(@RequestParam(name = "id") long id) {
        ModelAndView mav = new ModelAndView("/web/auto");

        Optional<Auto> optionalAuto = autoService.getAutoById(id,false);
        optionalAuto.ifPresent(auto -> mav.addObject("auto", auto));

        return mav;
    }


    @GetMapping("/register")
    public ModelAndView registerIndexPage() {
        ModelAndView mav = new ModelAndView("/web/register");

        RegistrationForm form = new RegistrationForm();
        mav.addObject("registrationForm", form);
        return mav;
    }

    @PostMapping("/register")
    public ModelAndView register(Model model,
                                 @ModelAttribute(name = "registrationForm") @Validated RegistrationForm form,
                                 BindingResult bindingResult
    ) {
        ModelAndView mav = new ModelAndView("/web/register-success");

        System.out.println("reg form = " + form);

        if(bindingResult.hasErrors()) {
            logger.warn("Registration form is invalid");
            mav.setViewName("/web/register");
        } else {
            logger.info("Registration form is valid");

            try {
                // todo implement registration
                User user = RegistrationFormUtil.convert(form);
                userService.addUser(user);
            } catch (Exception e) {
                logger.error("Error user registration " + e.getMessage(), e);
                mav.setViewName("/web/register-error");
            }
        }

        return mav;
    }

    @GetMapping("/activate")
    public ModelAndView activate(@RequestParam(name = "token") String token) {
        ModelAndView mav = new ModelAndView();

        // todo get user by token
        // if token is valid and not expired
        // activate user profile
        // else error token is expired
        // or invalid token
        return mav;
    }

    @GetMapping("/autoshop/{autoShopId}/auto/{autoId}")
    public String viewAuto(
            @PathVariable long autoShopId,
            @PathVariable long autoId,
            @RequestHeader(name = "itcity", required = false, defaultValue = "en") String lang,
            @CookieValue(name = "lastVisit", required = false) String lastVisit,
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        System.out.println("autoShopId = " + autoShopId);
        System.out.println("autoId = " + autoId);

//        String lang = request.getHeader("accept-language");
        System.out.println("accept lang = " + lang);

        System.out.println("last visit cookie with spring = " + lastVisit);

        System.out.println("-----------------client cookies -----------------");
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println("cookie name = " + cookie.getName());
                System.out.println("cookie value = " + cookie.getValue());
                System.out.println("cookie domain = " + cookie.getDomain());
                System.out.println("cookie path = " + cookie.getPath());
                System.out.println("cookie version = " + cookie.getVersion());
                System.out.println("cookie comment = " + cookie.getComment());
                System.out.println("cookie secure = " + cookie.getSecure());
                System.out.println("cookie age = " + cookie.getMaxAge());
                System.out.println("------------------------");
            }
        }
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
        Cookie lastVisitCookie = new Cookie("lastVisit", formatter.format(now));
        lastVisitCookie.setHttpOnly(true);
//        lastVisitCookie.setSecure(true);
        response.addCookie(lastVisitCookie);

        return "/web/test";
    }


    @GetMapping("/excel")
    public ModelAndView exportToExcel() {
        ModelAndView modelAndView = new ModelAndView(new AutoListExcelView());

        List<Auto> autoList = autoService.getAutoList();
        modelAndView.addObject("autoList", autoList);

        return modelAndView;
    }

    @GetMapping("login")
    public String logIn() {
        return "web/login";
    }

    @GetMapping("/activation-error")
    public String activationError() {
        return "web/activation-error";
    }

    @GetMapping("/account-locked")
    public String accountLocked() {
        return "web/account-locked";
    }

}
