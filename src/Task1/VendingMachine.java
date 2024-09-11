package Task1;

import java.util.ArrayList;
import java.util.List;

public interface  VendingMachine {
    Product getProduct(String name);

    Product getProduct(String name,int price, int volume, int temperature);
}



