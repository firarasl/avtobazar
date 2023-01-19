package az.autobazar.controller;

import az.autobazar.domain.Role;
import az.autobazar.domain.User;
import az.autobazar.domain.UserStatus;
import az.autobazar.service.UserService;
import org.apache.log4j.Logger;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;


@Controller()
@RequestMapping(value = "/user")
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class.getName());

    @Autowired
    private UserService userService;



    @GetMapping({"/"})
    public String getUserProfile(){
        return "user/profile";
    }

//    @PostMapping("/login")
//    public ModelAndView login(@RequestParam("email") String email,
//                              @RequestParam("password") String password,
//                              HttpSession session,
//                              RedirectAttributes redirectAttributes) {
//
//
//        ModelAndView mv = new ModelAndView("redirect:/login");
//        String message;
//
//
//        Optional<User> userOpt = userService.getUserByEmail(email);
//
//        if (userOpt.isPresent()) {
//            User user = userOpt.get();
//            List<Role> roleList = userService.getUserRoles(user.getId());
//            user.setRoleList(roleList);
//
//            if (BCrypt.checkpw(password, user.getPassword())) {
//                System.out.println(" hello user");
//                if (user.getUserStatus() == UserStatus.ACTIVE) {
//                    logger.debug("user roles = " + roleList);
//                    session.setAttribute("user", user);
//                    mv.setViewName(user.getRoleList().get(0).getSuccessPage());
//                    //+ user.getName()+user.getSurname()+'/'
//
//                } else if (user.getUserStatus() == UserStatus.PENDING){
//                    message = "profiliniz hele aktiv deyil, zehmet olmazsa aktivleshdirin!";
//                    System.out.println(message);
//                    redirectAttributes.addFlashAttribute("message", message);
//
//                }
//            }
//            else{
//                System.out.println("ife dushmedi");
//            }
//        } else {
//            message = "Email ve ya Parol doğru deyil!";
//            redirectAttributes.addFlashAttribute("message", message);
//        }
//
//        return mv;
//    }

    @GetMapping("/welcome")
    public String welcome() {
        return "user/welcome";
    }

    @GetMapping("/logout")
    public  String logOut(HttpServletRequest request){

        request.getSession().invalidate();

        return "web/index";
    }
    @GetMapping("/addAuto")
    public String addAuto(){
        return "user/addAuto";
    }

    @GetMapping("/reset-password")
    public String resetPassword() {
        return "user/resetPassword";
    }
}
