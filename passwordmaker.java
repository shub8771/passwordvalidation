import pwd.password;

public class passwordmaker {
    public static void main(String[] args) {

        password Password = new password();
        boolean s = false;
        while (!s) {
            Password.takingInput();
            // s=Password.patternmatching();
            s = Password.passwordchecker();
        }

    }
}