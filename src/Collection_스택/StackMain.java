package Collection_스택;

import java.util.Stack;

/*
    Stack : Last In First Out - 후입선출
    - Vector 클래스를 상속받아 만들어짐
    - 메서드가 너무 많다는 문제가 있음 - 원래라면 제한이 있어야 함
*/
public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());       // 맨 위의 값 확인
        System.out.println(stack.pop());        // 맨 위의 값 꺼내기
        System.out.println(stack.empty());      // 비어있는지 확인
        System.out.println(stack.size());       // 스택의 크기 확인
        System.out.println(stack.contains(20)); // 20이 포함되어 있는지 확인

        for (Integer e : stack) {
            System.out.printf("%3d", e);
        }
    }
}
