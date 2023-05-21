import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductService();

        // hey service, add the products..

        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

//        List<Product> products = service.getAllProducts();
//        for(Product p : products){
//            System.out.println(p);
//        }
//        System.out.println("==============================================");
//
//        System.out.println("a Particular product");
//
//        Product p = service.getProduct("Logi Mouse");
//        System.out.println(p);

        System.out.println("==============================================");
        System.out.println("a Particular text");

        List<Product> prods = service.getProductWithText("black");
        for(Product product : prods){
            System.out.println(product);
        }

        System.out.println("==============================================");
        System.out.println("Give the place");
        String place = sc.nextLine();

        List<Product> product = service.getPlace(place);

        System.out.println("==============================================");
        System.out.println("List of Product at this place "+place+" \n");
        for(Product prod : product){
            System.out.println(prod);
        }

        List<Product> outOfWarrentyProduct = service.getOutOfWarrentyProduct();
        
        System.out.println("==============================================");
        System.out.println("Product List of Out Of Warranty \n");
        for(Product prod : outOfWarrentyProduct){
            System.out.println(prod);
        }

        
    }
}
