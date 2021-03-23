package sunmin.basic.day06;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        // Q12 생년월일
        // computeBirth
        computeBirth();

        // Q16 잔돈계산
        // computeChange
        computeChange();

    }  // main

    // 생년월일을 이용해서 나이를 계산하는 메서드
    public static void computeBirth() {
        int birthday;
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.print("생년월일을 입력하세요: ");
        birthday = sc.nextInt();

        age = (2021 - birthday) + 1;
        System.out.println("나이는 " + age + "살 입니다");
    }

    // 잔돈을 계산하는 메서드
    public static void computeChange() {
        int[] change = {50000, 10000, 5000, 1000, 500, 100, 10};

        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하세요: ");
        int money = sc.nextInt();

        for (int i = 0; i < change.length; ++i) {
            System.out.println(change[i] + "원" + money / change[i]);
            money %= change[i];
        }
    }

} // class
