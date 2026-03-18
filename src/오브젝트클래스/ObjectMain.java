package 오브젝트클래스;
/*
    Object 클래스 : 모든 클래스의 최 상위 부모 클래스

    toString() : 객체의 정보를 문자열로 반환 (클래스명@16진수_hashcode)
                 기본적으로? 해시코드를 반환하지만 딱히 쓸일 없으므로 오버라이드 해서 사용?
    A.equals(B) : A, B 두 객체가 같은지 비교
                  String 클래스에서는 문자열 내용을 비교하도록 오버라이드 되어 있음

    주소값 비교 과정
    실제 주소 -> Hash Function -> 임의의 정수값(HashCode) -> 비교

    hashCode() : 해시코드 값 반환
    getClass() : 클래스 타입 반환, 거의 사용 안함
    finalize() : Garbage Collector 에 의해 제거되기 직전 호출됨, 사실상 사용 안함

    wait(), notify(), notifyAll() : 단독 사용 X, 멀티 스레드 관련해서 사용
*/
public class ObjectMain {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = std1;             // 얕은 복사

        System.out.println(std1.toString());

        if (std1 == std2) System.out.println("참조 객체 주소 같음");
        else System.out.println("참조 객체 주소 다름");

        if (std1.equals(std2)) System.out.println("참조 객체 같음");
        else System.out.println("참조 객체 다름");


        if (std1 == std3) System.out.println("참조 객체 주소 같음");
        else System.out.println("참조 객체 주소 다름");

        if (std1.equals(std3)) System.out.println("참조 객체 같음");
        else System.out.println("참조 객체 다름");

        System.out.println(std1.hashCode());
        System.out.println(std1);
        System.out.println(std2.getClass());
    }
}

class Student {
    String name;
    int age;
    Student() {
        name = "JH";
        age = 30;
    }

//    @Override
//    public String toString() {
//        return "Student [name=" + name + ", age=" + age + "]";
//    }
}