package az.autobazar.validator;

import az.autobazar.domain.RegistrationForm;
import az.autobazar.service.CommonService;
import org.apache.commons.validator.GenericValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import static az.autobazar.validator.ValidationConstants.*;

@Component
public class RegistrationFormValidator implements Validator {

    @Autowired
    private CommonService commonService;


    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(RegistrationForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // todo implement validation rules
        RegistrationForm form = (RegistrationForm) target;
        String regexAzName="^[a-zA-ZöüƏəşŞçÇĞğÖÜ]+$";

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "registrationForm.name.required");

        if(!errors.hasFieldErrors("name")) {
            if(!GenericValidator.isInRange(form.getName().length(), NAME_MIN_LENGTH, NAME_MAX_LENGTH)) {
                errors.rejectValue("name", "registrationForm.name.length");
            }

            if(!GenericValidator.matchRegexp(form.getName(), regexAzName)) {
                errors.rejectValue("name", "registrationForm.name.invalid");
            }
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "surname", "registrationForm.surname.required");
        if(!errors.hasFieldErrors("surname")) {
            if(!GenericValidator.isInRange(form.getSurname().length(), SURNAME_MIN_LENGTH, SURNAME_MAX_LENGTH)) {
                errors.rejectValue("surname", "registrationForm.surname.length");
            }

            if(!GenericValidator.matchRegexp(form.getSurname(), regexAzName)) {
                errors.rejectValue("surname", "registrationForm.surname.invalid");
            }
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "registrationForm.email.required");
        if(!errors.hasFieldErrors("email")) {

            if(!GenericValidator.isEmail(form.getEmail())) {
                errors.rejectValue("email", "registrationForm.email.invalid");
            } else if(!GenericValidator.isInRange(form.getEmail().length(), EMAIL_MIN_LENGTH, EMAIL_MAX_LENGTH)) {
                errors.rejectValue("email", "registrationForm.email.length");
            } else {
                if(commonService.checkEmail(form.getEmail())) {
                    errors.rejectValue("email", "registrationForm.email.dublicate");
                }
            }


        }
    }
}
