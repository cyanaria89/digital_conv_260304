package BMI계산기;

// BMI 계산기
// BMI = 몸무게(kg) / 키(m)^2
// 25 이상 : 비만, 23 이상 : 과체중, 18.5 이상 : 정상, 18.5 미만 : 저체중

import java.util.Scanner;

public class BMIMain {
    public static void main(String[] args) {
        // 키(cm)와 몸무게(kg) 입력받기
        double height, weight, bmi, h_meter;
        String rst;
        Scanner sc = new Scanner(System.in);

        System.out.print("키(cm)를 입력하세요 : ");
        height = sc.nextDouble();
        sc.nextLine();
        System.out.print("몸무게(kg)를 입력하세요 : ");
        weight = sc.nextDouble();
        sc.nextLine();

        // 키 단위 변환 cm -> m
        h_meter = height / 100;

        // BMI 계산
        bmi = weight / (h_meter * h_meter);

        // 체형 분류 및 결과 출력
        if (bmi >= 25) rst = "비만";
        else if (bmi >= 23) rst = "과체중";
        else if (bmi >= 18.5) rst = "정상";
        else rst = "저체중";

        System.out.printf("\n%s\t\t\t : %.2f\n%s\t\t : %.2f\n%s\t : %.2f\n%s\t\t\t : %s\n","키", height, "몸무게", weight, "체질량지수", bmi, "결과", rst);
    }
}
