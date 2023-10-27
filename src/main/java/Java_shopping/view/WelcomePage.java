package Java_shopping.view;

import Java_shopping.utils.StringUtil;
import Java_shopping.utils.Utils;

public class WelcomePage {
    public void welcome() {
        try {
            Utils.println(StringUtil.WELCOME_MESSAGE);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printAuthMenu() {
        Utils.println(StringUtil.AUTH_MENU);
    }
    void check(){
        System.out.println();
    }
}
