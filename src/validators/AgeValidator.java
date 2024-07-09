package validators;

import interfaces.Validator;
import models.User;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class AgeValidator implements Validator {
    @Override
    public void validate(User user) {
        if (user.getAge() < 20) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }
    }
}
