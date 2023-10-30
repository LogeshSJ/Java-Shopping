package Java_shopping.view;

import Java_shopping.utils.StringUtil;
import Java_shopping.utils.Utils;

import static Java_shopping.utils.Utils.println;

public class WelcomePage {
    public void welcome() {
        try {
            System.out.println("*************************************");
            println(StringUtil.WELCOME_MESSAGE);
            System.out.println("*************************************");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printAuthMenu() {
        System.out.println("************");
        println(StringUtil.AUTH_MENU);
        System.out.println("************");
    }
    void check(){
        System.out.println();
    }
}
