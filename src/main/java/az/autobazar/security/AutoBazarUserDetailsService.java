package az.autobazar.security;

import az.autobazar.domain.User;
import az.autobazar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutoBazarUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserPrincipal userPrincipal = null;
        Optional<User> optionalUser = userService.getUserByEmail(username);

        if(optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setRoleList(userService.getUserRoles(user.getId()));
            System.out.println("user = " + user);
            userPrincipal = new UserPrincipal(user);
        } else {
            throw new UsernameNotFoundException("User " + username + " not found!");
        }

        return userPrincipal;
    }
}
