package sunmin.basic.day14;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        // QXX
        // 두 수를 입력받아 두 사이의 모든 값의 총합을 구하는 코드를 작성
        // ex) 10, 3 => 3,4,5,6,7,8,9,10에 대한 총합
        // ex) 3, 10 => 3,4,5,6,7,8,9,10에 대한 총합
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자는? ");
        int a = sc.nextInt();
        System.out.print("두번째 숫자는? ");
        int b = sc.nextInt();

        int sum = 0;

        // a < b 인 경우
//        for(int i = a; i <= b; ++i)
//            sum+=i;

        // a > b 인 경우
//        for(int i = b; i <= a; ++i)
//            sum+=i;

        int begin = a;
        int end = b;
        if (a > b) {
            begin = b; end = a;
        }
        for(int i = begin; i <= end; ++i)
            sum += i;
        System.out.println("");

        String fmt = "%d와 %d 사이의 합은 %d";
        System.out.printf(fmt, a, b, sum);
        System.out.println("");

        // 가우스 덧셈을 이용하면 간단히 계산 가능
        // (i + j) x (j - i + 1) / 2 ==> i < j 일때
        // sunmin_ Math.abs 절대값으로 바꿔줌
        sum = (a + b) * (Math.abs(b - a) + 1) / 2;
        System.out.println(sum);



//        sunmin_ 연습
//        if (a > b) for (int i = b; i <=a; ++i ) {
//            sum+=i;
//        }
//        else if (a < b) for (int i = a; i <=b; ++i) {
//            sum+=i;
//        }
//        System.out.println(sum);

    }
}
