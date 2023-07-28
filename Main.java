
/*Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат 
и реализовать перегруженный метод getProduct(int name, int volume, int temperature), 
выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат 
и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/

  import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> newList = new LinkedList<>();
        HotDrinkVendingMachine machine1 = new HotDrinkVendingMachine(newList);
        HotDrink coffee = new HotDrink("Coffee", 80.0, 300, 70, 0);
        HotDrink blackTea = new HotDrink("BlacK Tea", 35.0, 500, 85, 0);

        newList.add(coffee);
        newList.add(blackTea);

        System.out.println(machine1.getProduct("Coffee", 300, 70));
        System.out.println(machine1.getProduct("BlackTea", 500, 85));
    }
}