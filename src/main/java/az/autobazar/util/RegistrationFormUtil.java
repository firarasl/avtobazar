package az.autobazar.util;

import az.autobazar.domain.RegistrationForm;
import az.autobazar.domain.User;

public class RegistrationFormUtil {

    public static User convert(RegistrationForm form) {
        User user = new User();
        user.setName(form.getName());
        user.setSurname(form.getSurname());
        user.setEmail(form.getEmail());
        user.setPassword(form.getPassword());
        user.setMobile1(form.getPhone());
        return user;
    }
}