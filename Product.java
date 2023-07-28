public class Product {
  private String name;
  private double price;
  private int count;
  private int volume;

  public Product (String name, double price, int count, int volume) {
    this.name = name;
    this.price = price;
    this.count = count;
    this.volume = volume;
  }

  public String GetName() {
    return name;
  }

  public void SetName(String name) {
    this.name = name;
  }

  public double GetPrice() {
    return price;
  }

  public void SetPrice(double price) {
    this.price = price;
  }

  public int GetCount() {
    return count;
  }

  public void SetCount(int count) {
    this.count = count;
  }

  public int GetVolume() {
    return volume;
  }

  public void SetVolume(int volume) {
    this.volume = volume;
}

  public String toString() {
    return "Product{" + "name = " + name + "" + ", price = " + price + ", count = " + count + ", volume = " + volume + "}";
  }
}
