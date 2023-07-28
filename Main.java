
/*Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат 
и реализовать перегруженный метод getProduct(int name, int volume, int temperature), 
выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат 
и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/

class Product {
  private String name;
  private double price;
  private int count;

  public Product (String name, double price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
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

  public String toString() {
    return "Product{" + "name =" + name + "" + ", price = " + price + ", count =" + count + "}";
  }

  class HotDrink extends Product {
    private int temperature;

    public HotDrink (String name, double price, int count, int temperature) {
      super(name, price, count);
      this.temperature = temperature;
    }

    public String toString() {
      return "HotDrink{" +  "name =" + super.GetName() + "" + ", price = " + super.GetPrice() + ", count =" + super. GetCount() + 
      ", temperature =" + temperature+ "}";
    }
  }

  public class Main{
  public static void main (String[] args) {
    HotDrink coffee = new HotDrink ("Coffee", 50.00, 10, 80);
    HotDrink tea = new HotDrink ("Tea", 45.00, 15, 70);
    HotDrink hotChocolate = new HotDrink ("Hot Chocolate", 60.00, 8, 85);

    System.out.println(coffee.toString());
    System.out.println(tea.toString());
    System.out.println(hotChocolate.toString());
    }
  }
}