package Java_shopping.utils;

import java.io.File;

public class FileUtil {

    private static File credentailsFile;
    private static File productFile;
    private static File CartFile;

    public static File getCredentialsFile() {
        if (credentailsFile == null)
            credentailsFile = new File("src/main/java/Java_shopping/assests/credentials.csv");
        return credentailsFile;
    }
    public static File getProductFile(){
        if(productFile==null)
            productFile=new File("src/main/java/Java_shopping/assests/Product.csv");
        return productFile;
    }


    public static String CartFile() {
        if(CartFile==null)
            CartFile=new File("src/main/java/Java_shopping/assests/cart.csv");
        return CartFile();
    }
}
