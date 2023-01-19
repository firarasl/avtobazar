package az.autobazar.service;

import az.autobazar.domain.Role;
import az.autobazar.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void addUser(User user);

    Optional<User> getUserByEmail(String email);

    List<Role> getUserRoles(long userId);
}
