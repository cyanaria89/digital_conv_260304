package Collection_큐_명령어이력조회;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
    Queue : First In First Out - 선입선출
    - LinkedList를 상속받아 구현되었음
*/
public class HistoryEx {
    static Queue<String> queue = new LinkedList<>();
    final static int MAX_SIZE = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.print("$ ");
            String cmd = sc.nextLine().trim();  // 좌우 공백 제거
            if (cmd.equalsIgnoreCase("q")) {
                System.exit(0);         // 프로그램 강제 종료
            } else if (cmd.equalsIgnoreCase("help")) {
                save(cmd);
                System.out.println("help - 도움말을 보여줍니다.");
                System.out.println("q / Q - 프로그램 종료");
                System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 출력");
            } else if (cmd.equalsIgnoreCase("history")) {
                save(cmd);
                int cnt = 0;
                for (String s : queue) {
                    System.out.println(++cnt + " : " + s);
                }
            } else {
                save(cmd);
                System.out.println(cmd);
            }
        }
    }
    static void save(String cmd) {
        queue.offer(cmd);           // 객체를 Queue의 맨 뒤에 추가
        if (queue.size() > MAX_SIZE) {
            queue.remove();         // Queue의 맨 앞의 요소를 제거
        }
    }
}
