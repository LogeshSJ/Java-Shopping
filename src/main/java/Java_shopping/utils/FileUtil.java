package Java_shopping.utils;

import java.io.File;

public class FileUtil {

    private static File credentailsFile;
    private static File productFile;

    public static File getCredentialsFile() {
        if (credentailsFile == null)
            credentailsFile = new File("src/main/java/Java_shopping/assests/credentials.csv");
        return credentailsFile;
    }
    private static File getProductFile(){
        if(productFile==null)
            productFile=new File("src/main/java/Java_shopping/assests/Product.csv");
        return productFile;
    }
}
