package 매개변수의다형성_택배배송시스템;

// 배송 관리자 클래스
public class ManagerA {
    String name;

    public ManagerA(String name) {
        this.name = name;
    }

    public void send(DeliveryA deliveryA) {
        System.out.println(name + " 매니저가 " + deliveryA.getCompanyA() + " 회사의 배송을 지시합니다.");
        deliveryA.deliverA();
    }
}
