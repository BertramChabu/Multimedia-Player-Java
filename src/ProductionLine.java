import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Step 14 and 15: Sorting and Printing Methods
public class ProductionLine {
    private List<Product> products;

    public ProductionLine() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void sortByName() {
        Collections.sort(products, (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
    }

    public void printProducts() {
        for (Product product : products) {
            System.out.println(product);
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        ProductionLine productionLine = new ProductionLine();
        productionLine.addProduct(new AudioPlayer("MP3 Player", "MP3"));
        productionLine.addProduct(new MoviePlayer("DVD Player", new Screen("1920x1080", 60, 5), MonitorType.LCD));

        // Sort products by name
        productionLine.sortByName();

        // Print all products
        productionLine.printProducts();
    }
}
