public class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model) {
        super(license,driver); //Llamo al metodo contrusctor de Can ya que es una Herencia de el
        this.brand = brand;
        this.model = model;

    }
}
