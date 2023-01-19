package az.autobazar.security;


import az.autobazar.domain.Role;
import az.autobazar.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static az.autobazar.domain.Role.*;


//@Component
public class AutoBazarSecurityInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean success = false;
        User user = (User)request.getSession().getAttribute("user");
        System.out.println("interceptor " + request.getRequestURI());

         if (user!=null) {
            if (request.getRequestURI().startsWith("/user/") && hasRole(user, AUTOBAZAR_USER)) {
                success = true;
            } else if (request.getRequestURI().startsWith("/admin/") &&
                    hasRole(user, AUTOBAZAR_ADMIN) || hasRole(user, AUTOBAZAR_MODERATOR)) {
                success = true;
            } else if (request.getRequestURI().startsWith("/autoshop/") &&
                    hasRole(user, AUTOSHOP_ADMIN) || hasRole(user, AUTOSHOP_MODERATOR)){
                success = true;
            } else {
                response.sendRedirect(request.getContextPath() + "/access-denied.jsp");
                success = false;
            }
        } else {
             response.sendRedirect(request.getContextPath() + "/login");
             success = false;
         }

        return success;
    }

    private boolean hasRole(User user,Role role){
        return user.getRoleList().contains(role);
    }
}
