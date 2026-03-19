package 제네릭프린터;

public class GenericPrinter<T extends Material> {
    private T material;     // T 자료형으로 선언한 변수. T가 타입변수 이므로 참조변수면 모두 들어갈 수 있다.

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
