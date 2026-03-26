package Collection_컴페어러블;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Comparable 과 Comparator 는 자바에서 객체를 정렬하는 데 사용하는 인터페이스
    Comparable : 나와 다른 객체를 비교
    Comparator : 다른 두 객체를 비교
*/
public class CompMain {
    public static void main(String[] args) {
        // 1.TreeSet 이용
//        TreeSet<Car> cars = new TreeSet<>();

        // 2. ArrayList 이용
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 2020, "Red"));
        cars.add(new Car("Mercedes", 2015, "Blue"));
        cars.add(new Car("Audi", 2017, "White"));
        cars.add(new Car("Toyota", 2009, "Gray"));
        cars.add(new Car("Honda", 2004, "Black"));
        cars.add(new Car("Genesis", 2020, "Silver"));
        cars.add(new Car("Sparks", 2018, "Mint"));
        cars.add(new Car("Grand Starex", 2018, "Yellow"));
        cars.add(new Car("Grand Starex", 2018, "Emerald"));

        // 2-1. ArrayList 이용시 아래 compareTo가 자동 적용이 안되므로 코드 한 줄 추가해줘야함
        Collections.sort(cars);

        for (Car car : cars) {
            System.out.printf("연식 : %d / 이름 : %s\t/ 색상 : %s\n", car.year, car.name, car.color);
            System.out.println("-".repeat(40));
        }
    }
}

class Car implements Comparable<Car> {
    String name;
    int year;
    String color;

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    @Override
    public int compareTo(Car o) {   // 정렬 규칙 지정
        /*
        // 연식 : 내림차순 - 이름 : 오름차순
        if (this.year != o.year) return o.year - this.year;
        // return 양수 : 정렬, 음수 : 유지, 0 : 같음

        return this.name.compareTo(o.name);
        // 사전 순 정렬
        */
        // 1. 연식기준
        if (this.year != o.year) return o.year - this.year;

        // 2. 이름순 정렬
        if (!this.name.equals(o.name)) return this.name.compareTo(o.name);

        // 3. 색상 정렬
        return this.color.compareTo(o.color);
    }
}