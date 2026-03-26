package 참조타입_배열실습문제;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
//        ArrayEx1();
        ArrayEx2();
    }

    /*
    문제 1 핸드폰 요금
    * 영식 요금제 : 30초마다 10원 (1 ~ 29 : 10원)
    * 민식 요금제 : 60초마다 15원 (1 ~ 59 : 15원)
    - 시간이 주어질 때 어느 요금제가 더 저렴한가?
    통화 수 : N (<= 20), 통화 시간 : M (<= 10000)
    요금제 이름 ?원 / 같으면 영식(Y) - 민식(M) 순서
    */

    static void ArrayEx1() {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("이용한 통화 수 : ");
        num = sc.nextInt(); sc.nextLine();

        int[] callTime = new int[num];
        int[] yCost = new int[num]; // = ((total / 30) + 1) * 10;
        int[] mCost = new int[num]; // = ((total / 60) + 1) * 15;

        System.out.print("통화 시간 입력 : ");
        for (int i = 0; i < num; i++) {
            callTime[i] = sc.nextInt();
            yCost[i] = (((callTime[i] / 30) + 1) * 10);
            mCost[i] = (((callTime[i] / 60) + 1) * 15);
        }
        int yCostTotal = 0, mCostTotal = 0;
        for (int e : yCost) yCostTotal += e;
        for (int e : mCost) mCostTotal += e;

        if (yCostTotal > mCostTotal) System.out.println("M / " + mCostTotal + "원");
        else if (yCostTotal == mCostTotal) System.out.print("Y / " + yCostTotal + "원\nM / " + mCostTotal + "원");
        else System.out.println("Y / " + yCostTotal + "원");
    }

    /*
    black   :   0,  1
    brown   :   1,  10
    red     :   2,  100
    orange  :   3,  1000
    yellow  :   4,  10000
    green   :   5,  100000
    blue    :   6,  1000000
    violet  :   7,  10000000
    gray    :   8,  100000000
    white   :   9,  1000000000

    ex) yellow violet red   =   4700
        orange red blue     =   32000000
        white white white   =   99000000000
    */

    static void ArrayEx2() {
        Scanner sc = new Scanner(System.in);

        String[] colors = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white" };
        String[] reg = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        int[] cost = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 };
        Regist[] regi = new Regist[10];
        String color1, color2, color3;

        for (int i = 0; i < regi.length; i++) { regi[i] = new Regist(colors[i], reg[i], cost[i]); }

        System.out.print("Color1 : "); color1 = sc.nextLine();
        System.out.print("Color2 : "); color2 = sc.nextLine();
        System.out.print("Color3 : "); color3 = sc.nextLine();

        int temp1 = 0, temp2 = 0;
        int temp3 = 0;
        for (int i = 0; i < regi.length; i++) {
            if (regi[i].color.equals(color1)) temp1 = Integer.parseInt(regi[i].reg);
            if (regi[i].color.equals(color2)) temp2 = Integer.parseInt(regi[i].reg);
            if (regi[i].color.equals(color3)) temp3 = regi[i].cost;
        }
        long rst = (long) ((temp1 * 10) + temp2) * temp3;
        System.out.println("결과 값 : " + rst);
    }
}