package 참조타입_배열실습문제;

public class Regist {
    // 인스턴스 필드
    String color;
    String reg;
    int cost;

    // 생성자 : 클래스 이름과 동일, 반환타입 없음, 인스턴스 필드 초기화, 클래스가 객체로 만들어 질 때 호출
    Regist(String color, String reg, int cost) {
        this.color = color;
        this.reg = reg;
        this.cost = cost;
    }

}
