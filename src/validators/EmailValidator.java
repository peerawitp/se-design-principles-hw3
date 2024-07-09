package validators;

import interfaces.Validator;
import models.User;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class EmailValidator implements Validator {
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final List<String> notAllowDomains = Arrays.asList("dom1.cc", "dom2.cc", "dom3.cc");

    @Override
    public void validate(User user) {
        if (user.getEmail() == null || user.getEmail().trim().equals("")) {
            throw new IllegalArgumentException("Email should not empty");
        }

        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if (!validEmailPattern.matcher(user.getEmail()).matches()) {
            throw new IllegalArgumentException("Email is wrong format");
        }

        if (notAllowDomains.contains(user.getEmail().split("@")[1])) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }
    }
}
