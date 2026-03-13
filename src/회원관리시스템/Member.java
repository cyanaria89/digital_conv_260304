package 회원관리시스템;

public class Member {
    private static int totalCount;
    private final int id;
    private String name;
    private final String userId;
    private String password;
    private int age;

    public Member(String name, String userId, String password, int age) {
        totalCount++;
        this.id = totalCount + 10000;
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.age = age;
    }

    // 전체 회원 수 반환
    public static int getTotalCount() {
        return totalCount;
    }

    // 회원 탈퇴 시 총 회원수 감소
    public static void userExit() {
        totalCount--;
    }

    // 아이디 반환 - 회원 탐색에 사용
    public String getUserId() {
        return userId;
    }

    // 아이디, 비밀번호 일치 여부 반환
    public boolean login(String userId, String password) {
//        if (this.userId.equals(userId)) {
            if (this.password.equals(password)) {
                System.out.println(userId + " 님 환영합니다.");
                return true;
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
//        } else {
//            System.out.println("존재하지 않는 아이디입니다.");
//        }
        return false;
    }

    // 기존 비밀번호 확인 후 변경
    public void changePassword(String oldPw, String newPw) {
        if (password.equals(oldPw)) {
            this.password = newPw;
            System.out.println("비밀번호를 변경하였습니다.");
        } else {
            System.out.println("기존 비밀번호가 틀렸습니다.");
        }
    }

    // 이름, 나이 수정
    public void updateInfo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("정보가 수정되었습니다.");
    }

    // 회원 정보 출력 (비밀번호 제외)
    public void printInfo() {
        System.out.println("회원번호\t : " + id);
        System.out.println("이름\t\t : " + name);
        System.out.println("아이디\t : " + userId);
        System.out.println("나이\t\t : " + age);
        System.out.println("-".repeat(20));
    }
}
