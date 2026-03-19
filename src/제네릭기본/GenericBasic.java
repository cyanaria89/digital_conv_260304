package 제네릭기본;

import java.util.ArrayList;
import java.util.List;

/*
    제네릭 : 데이터의 타입을 일반화하여, 다양한 타입의 데이터를 하나의 코드로 처리 할 수 있도록 해주는 자바의 기능
    - 데이터의 타입을 일반화 -> 참조타입으로 통일
    -> Collections Framework
    - 컴파일 시 타입을 지정하여 타입 안정성 확보
    - 불필요한 형 변환 제거
    - 코드 재사용성 증가
*/
public class GenericBasic {
    public static void main(String[] args) {
        // 제네릭으로 만들어져 있으며 생성 시 <타입변수>지정해 타입 안정성 확보
        List<String> list = new ArrayList<>();
//        List list = new ArrayList<>();
        list.add("Demon's Souls");
        list.add("Dark's Souls 1");
        list.add("Dark's Souls 2");
        list.add("Blood Borne");
        list.add("Dark's Souls 3");
        list.add("Sekiro");
        list.add("Elden Ring");
        // 타입변수 지정이 안되어 있으면 list.add(10249); 이런 경우도 입력이 되어버림
        // 이 경우 컴파일 과정에서 에러 발생함 + 사용시 형변환이 추가로 필요하게됨

        for (String title : list) {
            System.out.println(title);
        }
//        for (Object title : list) {
//            String str = (String) title;
//            System.out.println(str);
//        }

        Person<String> p1 = new Person<>("Cyan");
        System.out.print(p1.getInfo());
        Person<Integer> p2 = new Person<>(1024829);
        System.out.print(p2.getInfo());
    }
}

// 타입변수 T는 예약어 X, 관례상 대문자 T로 많이 사용
class Person<T> {
    private T info;
    public Person(T info) {
        this.info = info;
    }
    public T getInfo() {
        return info;
    }
}