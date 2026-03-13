package 회원관리시스템;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=========== 회원 관리 시스템 ===========");
            System.out.println("[1]회원가입\t[2]로그인\t[3]전체회원조회\n[4]회원삭제\t[5]총 회원수\t[6]종료");
            System.out.println("=".repeat(38));
            System.out.print("메뉴를 선택해주세요. : ");
            int menu = sc.nextInt(); sc.nextLine();

            switch (menu) {
                case 1:
                    boolean duplicatedId = false;
                    System.out.println("------ 회원가입 ------");
                    System.out.print("아이디 : ");
                    String userId = sc.nextLine();
                    for (Member m : members) {
                        if (m.getUserId().equals(userId)) {
                            System.out.println("이미 사용 중인 아이디입니다.");
                            duplicatedId = true;
                        }
                    }
                    if (duplicatedId) break;
                    System.out.print("이름 : ");
                    String name = sc.nextLine();
                    System.out.print("비밀번호 : ");
                    String password = sc.nextLine();
                    System.out.print("나이 : ");
                    int age = sc.nextInt(); sc.nextLine();
                    members.add(new Member(name, userId, password, age));
                    System.out.println("가입이 완료되었습니다.");
                    break;
                case 2:
                    System.out.println("------- 로그인 -------");
                    System.out.print("아이디 : ");
                    String logInId = sc.nextLine();
                    System.out.print("패스워드 : ");
                    String logInPw = sc.nextLine();

                    boolean existentId = false;
                    Member member = null;
                    for (Member m : members) {
                        if (m.getUserId().equals(logInId)) {
                            member = m;
                            existentId = true;
                        }
                    }
                    if (!existentId) {
                        System.out.println("존재하지 않는 아이디입니다.");
                        break;
                    }
                    if (member.login(logInId, logInPw)) {
                        while (true) {
                            System.out.print("[1]내 정보보기\t[2]정보수정\n[3]비밀번호 변경\t[4]로그아웃\n메뉴를 선택해주세요. : ");
                            int subMenu = sc.nextInt();
                            sc.nextLine();
                            switch (subMenu) {
                                case 1:
                                    member.printInfo();
                                    break;
                                case 2:
                                    System.out.println("이름과 나이만 수정할 수 있습니다.");
                                    System.out.print("수정할 이름 : ");
                                    String updateName = sc.nextLine();
                                    System.out.print("수정할 나이 : ");
                                    int updateAge = sc.nextInt();
                                    sc.nextLine();
                                    member.updateInfo(updateName, updateAge);
                                    break;
                                case 3:
                                    System.out.print("현재 비밀번호를 입력해주세요. : ");
                                    String oldPw = sc.nextLine();
                                    System.out.print("변경할 비밀번호를 입력해주세요. : ");
                                    String newPw = sc.nextLine();
                                    member.changePassword(oldPw, newPw);
                                    break;
                                case 4:
                                    System.out.println("이용해주셔서 감사합니다.");
                                    break;
                                default:
                            }
                            if (subMenu == 4) break;
                        }
                    }
                    break;
                case 3:
                    for (Member m : members) {
                        m.printInfo();
                    }
                    break;
                case 4:
                    System.out.print("삭제할 아이디를 입력해주세요. : ");
                    String delId = sc.nextLine();
                    int index = -1;
                    for (Member m : members) {
                        if (m.getUserId().equals(delId)) {
                            System.out.print("정말 삭제하시겠습니까? [y/n] : ");
                            char agree = sc.next().toLowerCase().charAt(0);
                            while (true) {
                                if (agree == 'y') {
                                    index = members.indexOf(m);
                                } else if (agree == 'n') {
                                    System.out.println("삭제를 취소합니다.");
                                } else {
                                    System.out.println("잘못 입력하셨습니다.");
                                }
                                if (agree == 'y' || agree == 'n') break;
                            }
                        }
                    }
                    if (index >= 0) {
                        members.remove(index);
                        Member.userExit();
                        System.out.println("삭제 완료 되었습니다.");
                    } else {
                        System.out.println("존재하지 않는 아이디입니다.");
                    }
                    break;
                case 5:
                    System.out.println("총 회원 수는 " + Member.getTotalCount() + "명 입니다.");
                    break;
                case 6:
                    System.out.println("회원 관리 시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("존재하지 않는 메뉴입니다.");
            }
        }
    }
}
