package 컴페어레이터;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
    Comparator : 두 개의 객체를 받아 비교해주는 인터페이스
*/
public class CompMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", 1000));
        fruits.add(new Fruit("Banana", 800));
        fruits.add(new Fruit("Orange", 900));
        fruits.add(new Fruit("Grape", 600));
        fruits.add(new Fruit("Strawberry", 400));
        fruits.add(new Fruit("WaterMelon", 2000));
        fruits.add(new Fruit("Melon", 1800));

        fruits.sort(new FruitComparator());

        for (Fruit f : fruits) {
            System.out.println(f);
        }
    }
}

class FruitComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o2.getPrice() - o1.getPrice();   // 양수면 정렬 조건
    }
}

class Fruit {
    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    @Override
    public String toString() { return name + " : " + price; }
}