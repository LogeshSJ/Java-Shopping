package Java_shopping.controller;

import Java_shopping.controller.impl.ICategoryController;
import Java_shopping.utils.AppException;
import Java_shopping.utils.StringUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Java_shopping.utils.Appinput.enterInt;
import static Java_shopping.utils.Appinput.enterInt;
import static Java_shopping.utils.Utils.println;

public class CategoryController {
    private final HomeController homeController;

    public CategoryController(HomeController homeController) {
        this.homeController = homeController;
    }

    public void displayCategories() {
        println("1. Phone");
        println("2. Accessories");

    }

    public void chooseCategory() {

        try {
            int categoryChoice = 0;
            categoryChoice = enterInt(StringUtil.ENTER_CHOICE);
            switch (categoryChoice) {
                case 1:
                    displayProductsByCategory("phone");
                    break;
                case 2:
                    displayProductsByCategory("accessories");
                    break;
                case 88:
                    checkout();
                    break;
                case 99:
                    homeController.printMenu();
                    break;
                default:
                    invalidChoice(new AppException("Invalid category choice."));
            }
        } catch (AppException appException) {
            invalidChoice(appException);
        }

    }

    private void displayProductsByCategory(String category) {
        println("Products in " + category + ":");

        List<String[]> products = readProductsFromFile();

        for (String[] product : products) {
            if (product.length >= 5 && product[4].equalsIgnoreCase(category)) {
                println(product[0] + ". " + product[1] + " Price: $" + product[2] + " " + product[3]);
            }
        }
    }

    private List<String[]> readProductsFromFile() {
        List<String[]> products = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/Java_shopping/assests/Product.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] productArray = line.split(",");
                products.add(productArray);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }

    private void checkout() {

    }

    private void invalidChoice(AppException e) {
        println(e.getMessage());
    }

}
