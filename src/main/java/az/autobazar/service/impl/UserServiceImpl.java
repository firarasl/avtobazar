package az.autobazar.service.impl;

import az.autobazar.domain.Role;
import az.autobazar.domain.User;
import az.autobazar.repository.UserRepository;
import az.autobazar.service.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        String password = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(password);
        userRepository.addUser(user);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

    @Override
    public List<Role> getUserRoles(long userId) {
        return userRepository.getUserRoles(userId);
    }
}
