package 제네릭_프린터;

public class Fiber extends Material {
    @Override
    public void doPrinting() {
        System.out.println("Fiber 재료 출력");
    }

    @Override
    public String toString() {
        return "재료는 Fiber";
    }
}
