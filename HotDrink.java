

public class HotDrink extends Product {
  private int temperature;

  public HotDrink (String name, double price, int count, int temperature, int volume) {
    super(name, price, count, volume);
    this.temperature = temperature;
  }

  public double getTemperature() {
    return temperature;
  }

  public void SetTemperature(int temperature) {
    this.temperature = temperature;
  }

  public String toString() {
    return "HotDrink {" + super.GetName() + "" + ", price = " + super.GetPrice() + ", count = " + super. GetCount() + 
    ", temperature = " + temperature + ", volume = " + super.GetVolume() + "}";
  }
}

