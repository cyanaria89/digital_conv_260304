package 객체지향_기본;

import java.util.Scanner;

/*
    객체지향프로그램 : 사물을 소프트웨어 속 객체로 추상화하여, 이들의 상태와 행동, 상호작용을 통해 프로그램을 구성하는 방식
    클래스 : 객체를 생성하기 위한 설계도, 속성(필드)과 동작(메서드)
    객체 : 클래스를 기반으로 생성된 실제 데이터, 메모리에 할당된 인스턴스
*/
/*
    객체지향 프로그래밍의 4가지 특징
    1. 상속 : 기존 클래스의 필드와 메서드를 그대로 물려 받는 것, 코드의 재사용성이 목적, 필연적으로 다형성과 연결됨.
    2. 다형성 : 오버로딩, 오버라이딩. 상속이후 메서드를 재정의 하는 방식
            - 오버로딩 : 동일한 이름의 메서드를 매개변수의 개수와 타입으로 구분
            - 오버라이딩 : 상속받은 메서드를 재정의
    3. 캡슐화 : 필드와 메서드를 하나로 묶어 지정된 메서드를 통해서만 필드에 접근하도록 허용
    4. 추상화 : 복잡한 내부는 숨기고 필요한 정보만 노출. 객체화 될 수 없는 클래스나 인터페이스로 부터 상속 받는 것
*/
public class OOPBasic {
    public static void main(String[] args) {
        // TVRemoteController 클래스로 리모콘 객체 5개 생성
        TVRemoteController tv1 = new TVRemoteController();
        TVRemoteController tv2 = new TVRemoteController();
        TVRemoteController tv3 = new TVRemoteController();
        TVRemoteController tv4 = new TVRemoteController();
        TVRemoteController tv5 = new TVRemoteController();
        Scanner sc = new Scanner(System.in);

        // 메뉴 만들기 : 생성된 객체 중 아무거나 1개 객체 선정
        // 1. 전원 켜기
        // 2. 볼륨 조절
        // 3. 채널 전환
        // 4. 현재 리모콘 상태값 보기
        // 5. 종료
        while (true) {
            System.out.println("=".repeat(20));
            System.out.println("\t1. 전원 켜기\n\t2. 볼륨 조절\n\t3. 채널 변경\n\t4. 상태값 보기\n\t5. 전원 끄기");
            System.out.println("=".repeat(20));
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt(); sc.nextLine();

            switch (menu) {
                case 1:
                    tv1.setPower(true);
                    break;
                case 2:
                    System.out.print("볼륨값 입력 : ");
                    int vol = sc.nextInt(); sc.nextLine();
                    tv1.setVolume(vol);
                    break;
                case 3:
                    System.out.print("채널 번호 : ");
                    int ch = sc.nextInt(); sc.nextLine();
                    tv1.setChannel(ch);
                    break;
                case 4:
                    tv1.printRemoteController();
                    break;
                case 5:
                    tv1.setPower(false);
                    System.out.println("TV를 종료합니다.");
                    return;     // 결과를 반환하면서 정상적으로 종료
                    // exit(0); - 운영체제가 프로그램을 강제 종료 = System Shutdown
                default:
                    System.out.println("해당 번호는 없는 메뉴 입니다.");
            }
        }
    }
}
