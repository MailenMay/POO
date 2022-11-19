import java.util.ArrayList;
import java.util.map;

public class UberBlack extends Car {
    map<String, ArrayList<String,Integer>> typeCarAccepted;
    ArrayList<String, Integer> seatsMaterial;

    public UberBlack(String license, Account driver,
    map<String, ArrayList<String,Integer>> typeCarAccepted,
    ArrayList<String, Integer> seatsMaterial) {
        super(license,driver); //Llamo al metodo contrusctor de Can ya que es una Herencia de el
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}