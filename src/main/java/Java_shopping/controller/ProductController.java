package Java_shopping.controller;

import Java_shopping.controller.impl.IHomeController;
import Java_shopping.controller.impl.IProductController;
import Java_shopping.models.Category;
import Java_shopping.models.Product;
import Java_shopping.utils.FileUtil;
import Java_shopping.utils.StringUtil;
import Java_shopping.utils.Utils;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//public class ProductController implements IHomeController {
//
//    public ProductController(HomeController homeController) {
//    }
//
//    public Product loadproduct(){
//        try {
//            Scanner scanner = new Scanner(FileUtil.getProductFile());
//            while (scanner.hasNext()) {
//                String product = scanner.next().trim();
//                if (!product.startsWith("id")) {
//                    String[] userArray = product.split(",");
//                    Utils.println(userArray[0] +". " +userArray[1] + " $" + userArray[2] + " " + userArray[3]);
//                }
//            }
//        }catch (Exception e){
//
//        }
//        return null;
//    }
//
//    @Override
//    public void printMenu() {
//        try {
//            loadproduct();
//            selectProductAndAddToCart();
//        } catch (Exception e) {
//            e.printStackTrace();;
//        }
//
//    }
//
//    void selectProductAndAddToCart() {
//        try {
//            Scanner inputScanner = new Scanner(System.in);
//
//            Utils.print("Enter the ID of the product to add to the cart (or enter 0 to go back to the main menu): ");
//            int selectedProductId = inputScanner.nextInt();
//
//            if (selectedProductId == 0) {
//                return;
//            }
//
//            Scanner scanner = new Scanner(FileUtil.getProductFile());
//            while (scanner.hasNext()) {
//                String productString = scanner.next().trim();
//                if (!productString.startsWith("id")) {
//                    String[] productArray = productString.split(",");
//
//                    System.out.println("Product Array in CSV: " + Arrays.toString(productArray));
//
//                    if (!productArray[0].matches("\\d+")) {
//                        System.err.println("Invalid product ID: " + productArray[0]);
//                    }
//
//                    int productId = Integer.parseInt(productArray[0]);
//                    String title = productArray[1];
//                    double price = Double.parseDouble(productArray[2]);
//                    int stocks = Integer.parseInt(productArray[3]);
//                    String category = productArray[4];
//
//                    if (productId == selectedProductId) {
//                        Product selectedProduct = new Product(
//                                productId,
//                                title,
//                                "", // You may want to add a description field to your CSV
//                                price,
//                                stocks,
//                                new Category(category)
//                        );
//
//                        // Add the selected product to the cart
//                        cartController.addToCart(selectedProduct);
//
//                        // Print a confirmation message
//                        Utils.println("Product added to the cart: " + selectedProduct.getTitle());
//                        break;
//                    }
//                }
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}


public class ProductController implements IHomeController {

    private HomeController cartController;

    public ProductController(HomeController cartController) {
        this.cartController = cartController;
    }

    @Override
    public void printMenu() {

    }


    private void invalidChoice(Exception e) {
        e.printStackTrace();
    }

    public void loadproduct() {
        try {
            Scanner scanner = new Scanner(FileUtil.getProductFile());
            while (scanner.hasNext()) {
                String product = scanner.next().trim();
                if (!product.startsWith("id")) {
                    String[] productArray = product.split(",");
                    Utils.println(productArray[0] + ". " + productArray[1] + " $" + productArray[2] + " " + productArray[3]);

                }
            }
            Utils.println(StringUtil.CHOICE_CART);
        } catch (Exception e) {
            invalidChoice(e);
        }
    }
}