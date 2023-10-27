package Java_shopping.view;

import Java_shopping.utils.Utils;

public class LoginPage {
    public void printInvalidCredentials() {
        try {
            Utils.println("#---------------------#");
            Utils.println("Invalid Credentials!!!");
            Utils.println("#---------------------#");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
