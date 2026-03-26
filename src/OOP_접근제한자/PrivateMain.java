package OOP_접근제한자;
/*
    접근제한자 : 데이터 은닉을 위해서 사용 (내부의 필드 값이 잘못 변경되는 것을 방지하기 위함)
    Getter, Setter Method : 데이터 은닉된 필드 값을 읽고(Getter) 쓰기(Setter) 위해서 사용
    public : 접근 제한이 없음 (클래스, 필드, 생성자, 메서드)
    protected : 같은 패키지거나 상속 관계가 존재하면 접근 가능 (필드, 생성자, 메서드)
    (default) : 같은 패키지 내에서만 접근 가능, 키워드가 적혀있지 않다면 default (클래스, 필드, 생성자, 메서드)
    private : 같은 클래스 내에서만 접근 가능 (필드, 생성자, 메서드)
*/
public class PrivateMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getName());
        System.out.println(child.getAddress());
        System.out.println(child.getMoney());
    }
}

class Child extends Parent {
}