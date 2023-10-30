package Java_shopping.controller;

import Java_shopping.controller.impl.IHomeController;
import Java_shopping.models.Product;
import Java_shopping.utils.AppException;
import Java_shopping.utils.StringUtil;
import Java_shopping.view.HomePage;

import static Java_shopping.utils.Appinput.enterInt;
import static Java_shopping.utils.Appinput.enterInt;
import static Java_shopping.utils.UserUtils.setLoggedInUser;
import static Java_shopping.utils.Utils.println;

public class HomeController implements IHomeController {

    private final HomePage homePage;
    private final AuthController authController;
    private final ProductController productController;
    private final CartController cartController;
    private final OrderController orderController;
    private final CategoryController categoryController;

    public HomeController(AuthController authController) {
        homePage = new HomePage();
        this.authController = authController;
        productController = new ProductController(this);
        cartController = new CartController(this);
        orderController = new OrderController(this);
        categoryController=new CategoryController(this);
    }

    @Override
    public void printMenu() {
        homePage.printMenu();
        try {
            int choice = enterInt(StringUtil.ENTER_CHOICE);
            switch (choice) {
                case 1:
                    displayCategories();
                    break;
                case 2:
                    productController.loadproduct();
                    break;
                case 3:
                    // cartController.printCart();
                    break;
                case 4:
                    // orderController.viewOrders();
                    break;
                case 5:
                    setLoggedInUser(null);
                    authController.authMenu();
                    break;
                default:
                    invalidChoice(new AppException(StringUtil.INVALID_CHOICE));
            }
        } catch (AppException appException) {
            invalidChoice(appException);
        }
    }

    private void displayCategories() {
        println("1. Phone");
        println("2. Accessories");
        categoryController.chooseCategory();
    }

//    private void chooseCategory() {
//        try {
//            int categoryChoice = enterInt("Enter category choice: ");
//            switch (categoryChoice) {
//                case 1:
//                case 2:
//                    productController.loadproduct();
//                    break;
//                default:
//                    invalidChoice(new AppExecption("Invalid category choice."));
//            }
//        } catch (AppExecption appException) {
//            invalidChoice(appException);
//        }
//    }

    private void invalidChoice(AppException appException) {
        println(appException.getMessage());
        printMenu();
    }

    public void loadProducts(String category) {

    }

    public void addToCart(Product selectedProduct) {

    }
}