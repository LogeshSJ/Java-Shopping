package Java_shopping.utils;

import static Java_shopping.utils.AppScanner.getScanner;
import static Java_shopping.utils.Utils.print;

public class Appinput {
    public  static String enterString(String msg){
        print(msg);
        return getScanner().nextLine();
    }
    public static int enterInt(String msg) throws AppException {
        print(msg);
        int input;
        try {
            input= Integer.parseInt(getScanner().nextLine());
        }catch (Exception ex){
            throw new AppException("Invaild Input!!! please enter a valid input");
        }
        return input;
    }
}