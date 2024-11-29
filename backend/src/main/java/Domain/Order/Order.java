package Domain.Order;
//Comanda (numarul comenzii:int, nume:List<Produs>, sursa comenzii:Sursa)

import java.util.ArrayList;
import java.util.List;
import Domain.Product;

public class Order {
    public int OrderID;
    public List<Product>  products = new ArrayList<>();
}
