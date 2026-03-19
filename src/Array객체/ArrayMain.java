package Array객체;

import java.util.ArrayList;
import java.util.List;

public class ArrayMain {
    public static void main(String[] args) {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("Americano", 2000, "Coffee", "Basic"));
        menuList.add(new Menu("Latte", 4200, "Coffee", "Espresso + Milk"));
        menuList.add(new Menu("Moca", 4700, "Coffee", "Latte + Choco?"));
        menuList.add(new Menu("Strawberry Latte", 5500, "Non-Coffee", "Strawberry + Milk"));
        menuList.add(new Menu("GreenTea Latte", 5200, "Non-Coffee", "GreenTea + Milk"));

        for (Menu m : menuList) {
            System.out.println(m);
        }
    }
}

class Menu {
    String name;
    int price;
    String category;
    String description;

    public Menu(String name, int price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n가격 : " + price + "\n분류 : " + category + "\n설명 : " + description + "\n";
    }
}