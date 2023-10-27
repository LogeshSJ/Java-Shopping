package Java_shopping.view;

import Java_shopping.utils.StringUtil;
import Java_shopping.utils.Utils;

public class HomePage {
    public void printMenu() {
        try {
            Utils.println("#---------------------#");
            Utils.println(StringUtil.HOME_MENU);
            Utils.println("#---------------------#");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
