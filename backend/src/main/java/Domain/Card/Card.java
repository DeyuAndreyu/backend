package Domain.Card;

import Domain.Address.Address;
import Domain.Bank.Bank;
import Domain.User.User;

/*
- Card (numele posesorului:Persoana, sold:double, numar card:String,
cod de securitate:int, adresa:Adresa, banca:enum, tipul de card:String)
 */
public class Card {
    public User name;
    public double sold;
    public String cardNumber;
    public int securityCode;
    public Address address;
    public Bank bank;
    public String cardType;
}
