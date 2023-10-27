package Java_shopping.utils;

public class AppInput {

    public static String enterString(String msg) {
        Utils.print(msg);
        return AppScanner.getScanner().nextLine();
    }

    public static int enterInt(String msg) throws AppException {
        Utils.print(msg);
        int input;
        try {
            input = Integer.parseInt(AppScanner.getScanner().nextLine());
        } catch (Exception ex) {
            throw new AppException(StringUtil.INVALID_CHOICE);
        }
        return input;
    }
}
