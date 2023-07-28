
/*Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат 
и реализовать перегруженный метод getProduct(int name, int volume, int temperature), 
выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат 
и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/


  class HotDrink extends Product {
    private int temperature;

    public HotDrink (String name, double price, int count, int temperature, int volume) {
      super(name, price, count, volume);
      this.temperature = temperature;
    }

    public String toString() {
      return "HotDrink {" + super.GetName() + "" + ", price = " + super.GetPrice() + ", count = " + super. GetCount() + 
      ", temperature = " + temperature + "}";
    }

    public int GetTemperature() {
      return 0;
    }
  }

  public class Main{
  public static void main (String[] args) {
    HotDrink coffee = new HotDrink ("Coffee", 50.00, 15, 80);
    HotDrink tea = new HotDrink ("Tea", 45.00, 15, 70);
    HotDrink hotChocolate = new HotDrink ("Hot Chocolate", 60.00, 8, 85);

    System.out.println(coffee.toString());
    System.out.println(tea.toString());
    System.out.println(hotChocolate.toString());
    }
  }
