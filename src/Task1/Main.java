package Task1;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите имя напитка который хотите получить: ");
        List<Product> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrinks("Кофе", 100, 90,100));
        hotDrinks.add(new HotDrinks("Чай", 120, 80,90));
        hotDrinks.add(new HotDrinks("Кокао", 80, 70,90));
        VendingMachine vendingMachine = new HotDrinksMachine(hotDrinks);
        Product foundProduct = vendingMachine.getProduct("Чай");


        if (foundProduct != null){
            System.out.println(foundProduct);
        }
        else {
            System.out.println("Горячий Напиток не найден ");
        }
    }
}

