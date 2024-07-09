import models.User;
import services.UserService;

/**
 * @author 6510405741 Peerawit Pharkdeepinyo
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Peerawit Pharkdeepinyo", "peerawit.pha@ku.th", 20);
        UserService userService = new UserService();

        if (userService.register(user))
            System.out.println("✅ Successfully registered!");
        else
            System.out.println("❌ Failed to register!");
    }
}