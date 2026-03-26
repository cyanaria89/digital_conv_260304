package OOP_싱글톤;

// 직접 생성하는 경우는 거의 없음.
// Spring Boot에서 제공?

public class SingleTon {
    String name;
    int id;

    // static 키워드로 객체가 프로그램 종료 시 까지 소멸되지 않도록 함
    private static SingleTon singleTon = new SingleTon();

    // private 키워드로 외부에서 생성 방지
    private SingleTon() {
        name = "JH";
        id = 999;
    }

    // 클래스 메서드로 해당 메서드 호출 시 싱글톤 주소를 반환
    static SingleTon getInstance() {
        return singleTon;
    }
}
