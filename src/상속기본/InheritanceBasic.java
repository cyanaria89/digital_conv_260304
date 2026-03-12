package 상속기본;

// 상속 : 부모 클래스의 유산(필드, 메서드)을 자식 클래스에게 물려주는 것
// - 재사용성을 위해 주로 사용, 상속 받은 기능을 변경하면 오버라이딩(다형성)
// - extends 키워드 사용(상속 받을 때)
// - 자식 클래스는 부모 클래스의 모든 내용을 포함. 즉, 자식 클래스 기능의 범위가 부모 클래스 보다 같거나 크다
// - 자식 클래스는 부모 클래스가 가지고 있는 메서드를 재정의 해도 되고 안해도 됨
// * 동적 다형성

// 자바에서는 다중 상속 불가
// interface 설계 명세 같은 키워드? 내용 X(상속 받는 쪽에서 구현), 이름만 물려 받음, 추상화

public class InheritanceBasic {
    public static void main(String[] args) {
        HouseDog dog = new HouseDog();    // Dog 객체 생성
        dog.setName("cat");
        System.out.println(dog.getName());
        dog.sleep();
    }
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}

// Animal class로 부터 상속 받음
class Dog extends Animal {
    void sleep() {
        System.out.println(name + "이(가) 잠을 잡니다.");
    }
}

// Overriding - 부모가 가진 메서드를 재정의 (이름, 매개변수, 반환타입이 동일), 동적 다형성
// OverLoading - 동일 이름의 매개변수 개수나 반환타입이 다른 함수를 여러개 정의해 두고 입력 값에 따라 적용, 정적 다형성

class HouseDog extends Dog {
    @Override   // Overriding 관계 성립 여부 확인하는 어노테이션 (안붙여도 되지만 확인을 위해 붙여주는게 좋음)
    void sleep() {
        System.out.println(name + "이(가) 집에서 잠을 잡니다.");
    }
    // Overloading
    void sleep(int hour) {
        System.out.println(name + "이(가) 집에서 " + hour + "시간 동안 잠을 잡니다.");
    }
}