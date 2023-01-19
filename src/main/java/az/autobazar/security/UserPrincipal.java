package az.autobazar.security;

import az.autobazar.domain.Role;
import az.autobazar.domain.User;
import az.autobazar.domain.UserStatus;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserPrincipal implements UserDetails, Serializable {

    private static final long serialVersionUID = 4721130490860532734L;
    private User user;

    public UserPrincipal(User user) {
        this.user = user;
    }


    public User getUser() {
        return user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();

        List<Role> roleList = user.getRoleList();

        roleList.forEach(role -> {
            // spring security role ve permissionlari ayirmaq ucun ROLE_ prefix teleb edir
            GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + role.name());
            authorities.add(authority);
        });
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return user.getUserStatus() != UserStatus.DELETED;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getUserStatus() == UserStatus.ACTIVE;
    }
}
