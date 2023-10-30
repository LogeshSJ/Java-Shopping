package Java_shopping.controller;

import Java_shopping.controller.impl.ICartController;
import Java_shopping.models.Product;
import Java_shopping.utils.FileUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CartController implements ICartController {

        private List<Product> cart;

        public CartController(HomeController homeController) {
            this.cart = new ArrayList<>();
        }


        public void addToCart(Product product) {
            cart.add(product);
            System.out.println("Product added to the cart: " + product.getTitle());
        }

        public void viewCart() {
            if (cart.isEmpty()) {
                System.out.println("Your cart is empty.");
            } else {
                System.out.println("Your cart:");
                for (int i = 0; i < cart.size(); i++) {
                    System.out.println((i + 1) + ". " + cart.get(i).getTitle() +
                            " $" + cart.get(i).getPrice() +
                            " " + cart.get(i).getDescription());
                }
            }
        }

        public void clearCart() {
            cart.clear();
            System.out.println("Cart cleared.");
        }

        public void saveCartToCSV() {
            try (FileWriter writer = new FileWriter(FileUtil.CartFile())) {
                writer.write("id,title,description,price,stocks,category\n");

                for (Product product : cart) {
                    writer.write(product.getId() + "," +
                            product.getTitle() + "," +
                            product.getDescription() + "," +
                            product.getPrice() + "," +
                            product.getStocks() + "," +
                            product.getCategory().getName() + "\n");
                }

                System.out.println("Cart saved to CSV file.");
            } catch (IOException e) {
                System.out.println("Error saving cart to CSV file: " + e.getMessage());
            }
        }
        @Override
    public void addToCart(int productId){
            Product product=null;
            cart.add(product);
            System.out.println("Product added to cart:"+product.getTitle());
        }
        @Override
    public void printcart(){

        }
    }
