package az.autobazar.security;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.security.auth.login.AccountLockedException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AutoBazarAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        System.out.println("login ugursuz oldu, sebeb = " + exception.getMessage() + " " + exception.getClass());

        if(exception instanceof BadCredentialsException) {
            response.sendRedirect(request.getContextPath() + "/login?error");
        } else if(exception instanceof DisabledException) {
            response.sendRedirect(request.getContextPath() + "/activation-error");
        } else if(exception instanceof LockedException) {
            response.sendRedirect(request.getContextPath() + "/account-locked");
        } else {
            response.sendRedirect(request.getContextPath() + "/login?error");
        }
    }
}
