package Java_shopping.controller;

import Java_shopping.controller.impl.IAppController;
import Java_shopping.view.WelcomePage;

public class AppController implements IAppController {

    private final WelcomePage welcomePage;
    private final AuthController authController;

    public AppController() {
        welcomePage = new WelcomePage();
        authController = new AuthController(this);
    }

    @Override
    public void init() {
        welcomePage.welcome();
        authController.authMenu();
    }

    public void printAuthMenu() {
        welcomePage.printAuthMenu();
    }
}
