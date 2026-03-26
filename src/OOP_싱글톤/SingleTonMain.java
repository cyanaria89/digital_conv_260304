package OOP_싱글톤;

// 싱글톤(SingleTon) : 단 하나의 객체만 생성하는 기법, 메모리 절약과 정보 공유를 위해서 사용

public class SingleTonMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setInfo("J", 101);
        s2.printInfo();
    }
}
