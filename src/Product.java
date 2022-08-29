import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  Product {
    public int price;
    public int quantity;
   public double discount;

    public Product(int price, int quantity, double discount) {
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }



}

class Solution {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>( Arrays.asList(
                new Product(142, 1,7),
                new Product(112, 1,7),
                new Product(120, 1,7)));
        System.out.println(getFinealPrice(products));
    }

    public static  double getFinealPrice(List<Product> products) {
        double sum = 0;
        for(Product prises : products) {
            double a = prises.discount/100; // 0.07
            double b = prises.price * a; // 00.7 * 142 = 9
            sum += (prises.price - b) * prises.quantity;
        }
        return sum;
    }

}

