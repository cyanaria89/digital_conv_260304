package 스위치문;
// switch : 조건 값으로 분기
// 분기된 조건을 실행 후 break문을 통해서 switch문을 벗어남

import java.util.Scanner;

public class SwitchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("좋아하는 계절을 영어로 입력하세요 : ");
        String season = sc.next().toUpperCase(); // 문자열을 전부 대문자로 변경하여 대입
        switch (season) {
            case "SPRING": // 여기서 종료가 아니기 때문에 ';' 이 아닌 ':' 사용
                System.out.println("Flower!");
                break;
            case "SUMMER":
                System.out.println("Vacation!");
                break;
            case "FALL":
            case "AUTUMN": // break가 없으므로 FALL 이나 AUTUMN 둘 다 OK - OR 와 동일 결과
                System.out.println("??? 선선해서 좋긴 해~");
                break;
            case "WINTER":
                System.out.println("S! N! O! W!");
                break;
            default:
                System.out.println("입력이 잘못됬다네요~");
                break;
        }
    }
}
