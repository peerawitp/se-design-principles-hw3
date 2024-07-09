package services;

import interfaces.Validator;
import models.User;
import validators.*;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class UserService {
    public boolean register(User user) {
        Validator[] validators = {
                new NameValidator(),
                new EmailValidator(),
                new AgeValidator()
        };
        for (Validator validator : validators) {
            validator.validate(user);
        }
        return true;
    }
}
