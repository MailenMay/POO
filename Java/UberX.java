public class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model) {
        super(license,driver); //Llamo al metodo contrusctor de Can ya que es una Herencia de el
        this.brand = brand;
        this.model = model;

    }
}
