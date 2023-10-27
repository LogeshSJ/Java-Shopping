package Java_shopping.controller;

import Java_shopping.controller.impl.IHomeController;
import Java_shopping.utils.AppException;
import Java_shopping.utils.StringUtil;
import Java_shopping.view.HomePage;

import static Java_shopping.utils.AppInput.enterInt;
import static Java_shopping.utils.Utils.println;

public class HomeController implements IHomeController {
    private final HomePage homePage;
    private final AuthController authController;
    private final CategoryContoller categoryContoller;

    public HomeController(AuthController authController) {
        homePage = new HomePage();
        this.authController = authController;
        categoryContoller = new CategoryContoller(this);
    }

    @Override
    public void printMenu() {
        homePage.printMenu();
        try {
            int choice = enterInt(StringUtil.ENTER_CHOICE);
            if (choice == 1) {

            } else if (choice == 2) {

            } else if (choice == 3) {

            } else if (choice == 4) {

            } else if (choice == 5) {

            } else {
                invalidChoice(new AppException(StringUtil.INVALID_CHOICE));
            }

        } catch (AppException appException) {
            invalidChoice(appException);
        }
    }

    private void invalidChoice(AppException appException) {
        println(appException.getMessage());
        printMenu();
    }
}
