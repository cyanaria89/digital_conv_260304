package Stream_응용;

import java.util.ArrayList;
import java.util.List;

public class StreamEx {
    public static void main(String[] args) {
        List<TravelCustomer> customers = new ArrayList<>();
        TravelCustomer customer1 = new TravelCustomer("HJH", 37, 1520000);
        TravelCustomer customer2 = new TravelCustomer("KTY", 28, 3000000);
        TravelCustomer customer3 = new TravelCustomer("YD", 32, 2760000);
        TravelCustomer customer4 = new TravelCustomer("KPJ", 34, 1920000);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        // 이름순으로 명단 출력 - filter : 조건, map : 특정 요소 추출?
        customers.stream()
                .map(e -> e.getName())
                .sorted()
                .forEach(e -> System.out.println(e));
        // 메서드 참조
        customers.stream()
                .map(TravelCustomer::getName)
                .sorted()
                .forEach(System.out::println);

        // 전체 여행 경비 합산 - sum : 집계함수, 종단연산, 이후 추가 연산 불가
        int total = customers.stream()
                .mapToInt(e -> e.getPrice())
                .sum();
        System.out.println("총 비용 : " + total);

        // 30세 이상 명단
        customers.stream()
                .filter(e -> e.getAge() >= 30)
                .map(e -> e.getName())
                .sorted()
                .forEach(e -> System.out.println(e));
    }
}

class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getPrice() { return price; }
}