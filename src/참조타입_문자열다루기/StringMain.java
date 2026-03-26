package 참조타입_문자열다루기;
/*
    StringBuffer : 문자열을 추가하거나 변경할 때 사용, 멀티스레드 환경에서 안전, 기존 영역을 확장
    StringBuilder : 문자열을 추가하거나 변경할 때 사용, 멀티스레드 고려하지 않음, 기존 영역을 확장
    String : 매번 새로운 영역을 잡음
*/
public class StringMain {
    public static void main(String[] args) {
        String rst = "Hello";
        rst += " ";
        rst += "Java";
        rst += " ";
        rst += "Programming";
        System.out.println(rst);

        StringBuilder sBuild = new StringBuilder();
        sBuild.append("Hello");
        sBuild.append(" ");
        sBuild.append("jAvA");
        sBuild.append(" ");
        sBuild.append("Programming");
        System.out.println(sBuild);

        StringBuffer sBuffer = new StringBuffer();
    }
}
