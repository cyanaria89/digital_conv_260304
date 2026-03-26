package 제네릭_프린터;

public class Plastic extends Material {
    @Override
    public void doPrinting() {
        System.out.println("Plastic 재료 출력");
    }

    @Override
    public String toString() {
        return "재료는 Plastic";
    }
}
