package Task1;

import Task1.Product;
import Task1.VendingMachine;

import java.util.List;

public class HotDrinksMachine implements VendingMachine {
    private final List<Product> productList;

    public HotDrinksMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null; // Возвращаем null, если продукт не найден
    }

    @Override
    public Product getProduct(String name,int price, int volume, int temperature) {
        for (Product product : productList){
            if(product instanceof HotDrinks hotDrink){
                if  (hotDrink.getName().equals(name) && hotDrink.getPrice() == price && hotDrink.getTemperature() == temperature && hotDrink.getVolume() == volume){
                     return hotDrink;
                 }
            }
        }
        return null;
    }
}
