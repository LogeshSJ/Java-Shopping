package Java_shopping.view;

import Java_shopping.utils.StringUtil;
import Java_shopping.utils.Utils;

public class RegisterPage {

    public void printRegistrationSuccessful() {
        try {
            Utils.println("#---------------------#");
            Utils.println(StringUtil.REGISTRATION_SUCCESSFUL);
            Utils.println("#---------------------#");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void passwordMisMatch() {
        try {
            Utils.println("#---------------------#");
            Utils.println(StringUtil.PASSWORD_MISMATCH);
            Utils.println("#---------------------#");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
