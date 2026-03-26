package OOP_매개변수의다형성_택배배송시스템;

public class DeliveryA {
    String company; // 배송회사 이름 - 생성자로 입력(객체 생성시 입력, 공장초기화) or Setter(생성 후 임의입력)로 입력

    // 생성자는 클래스 이름과 동일, 반환 타입 없음, 객체 생성 시 호출, 오버로딩 가능
    // 동일 패키지 내에선 접근제한자 생략 가능 (default)
    // - 접근제한자 public이 없으면, 다른 패키지에 있는 클래스는 생성 할 수 없음
    public DeliveryA(String company) {
        this.company = company;
    }

    public void deliverA() {
        System.out.println("배송을 시작합니다.");
    }

    public String getCompanyA() {
        return company;
    }
}

// DeliveryA 를 상속받아 ParcelDeliveryA 클래스 생성
// extends 상속은 단일 상속만 가능
class ParcelDeliveryA extends DeliveryA {
    public ParcelDeliveryA(String company) {
        super(company);
    }

    @Override   // 오버라이딩 관계가 성립하는지 문법적으로 체크, 없어도 되지만 불편함
    public void deliverA() {
        System.out.println("택배 배송을 시작합니다.\n2 ~ 3일 정도 소요됩니다.");
    }
}

class QuickDeliveryA extends DeliveryA {
    public QuickDeliveryA(String company) {
        super(company);
    }

    @Override
    public void deliverA() {
        System.out.println("퀵 배송을 시작합니다.\n당일 도착 예정입니다.");
    }
}

class ExpressDeliveryA extends DeliveryA {
    public ExpressDeliveryA(String company) {
        super(company);
    }

    @Override
    public void deliverA() {
        System.out.println("항공 배송을 시작합니다.\n해외로 출발합니다.");
    }
}