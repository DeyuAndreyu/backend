package Domain.User;

import java.util.ArrayList;
import java.util.List;
import Domain.Card.Card;

/*
- Persoana (email:String, parola:String, nume:String,
functie:String, createDate:int, sold:double, lista de carduri:List<Card>, adresa:String)
 */
public class User {
    public String email;
    public String password;
    public String name;
    public String function;
    public String createDate;
    public double sold;
    public List<Card> cards = new ArrayList<>();
    public String address;
}
