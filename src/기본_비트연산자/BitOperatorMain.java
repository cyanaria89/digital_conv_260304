package 기본_비트연산자;

// 비트 연산자 : 정보의 최소 단위인 비트끼리 연산을 수행
// 하드웨어 제어, 네트워킹, 데이터 압축 등 에서 사용
// 2진법에 대한 이해가 필요
// 10(10) = 00001010(2) = 012(8) = 0A(16)
// 12(10) = 00001100(2) = 014(8) = 0C(16)

public class BitOperatorMain {
    public static void main(String[] args) {
        int x = 10, y = 12;
        System.out.println(x + " : " + Integer.toBinaryString(x) + ", " + y +" : " + Integer.toBinaryString(y));
        System.out.println((x & y) + " : " + Integer.toBinaryString(x & y)); // 비트 and : 두개의 bit 모두 1이면 1, 8
        System.out.println((x | y) + " : " + Integer.toBinaryString(x | y)); // 비트 or : 두개의 bit 중 하나만 1이어도 1, 14
        System.out.println((x ^ y) + " : " + Integer.toBinaryString(x ^ y)); // 비트 xor : 두개의 bit 값이 다른 경우에 1, 6
        System.out.println((~x) + " : " + Integer.toBinaryString(~x)); // 비트 not : 각 bit 값을 반대로 (1의 보수), -11
        System.out.println("(int는 4byte = 32bit)");
        // 최상위비트 = 부호비트
        // 0은 양수 취급 (음수에는 0이 없음)
        // 정확하게 계산 하려면 1의 보수에 + 1 -> 2의 보수
        System.out.println((x << 1) + " : " + Integer.toBinaryString(x << 1)); // 비트 shift : 왼쪽으로 이동 * 2 효과, 20
        System.out.println((x >> 1) + " : " + Integer.toBinaryString(x >> 1)); // 비트 shift : 오른쪽으로 이동 / 2 효과, 5

    }
}
