package sunmin.basic.day11;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class TextFormat {
    public static void main(String[] args) {
        // MessageFormat
        // 다양한 형식의 데이터를 같은 양식을 출력할 때 사용
        // 템플릿 문자열을 쉽게 작성할 수 있도록 해줌
        // printf나 String.format보다 세련된 기능 제공
        String name = "혜교";
        int kor = 98;
        int eng = 99;
        int mat = 74;

        String fmt = "이름 : {0}, 국어 : {1}, 영어 : {2}, 수학 : {3}";
        String result = MessageFormat.format(fmt, name, kor, eng, mat);
        System.out.println(result);
        // 변수의 바인딩을 임의로 설정 가능

        Object[] sj = {"지현",78,65,12,580,53.2,'미'};
        result = MessageFormat.format(fmt, sj);
        System.out.println(result);
        // 변수를 배열로 정의하면 바인딩을 수월하게 할 수 있음

        // DecimalFormat
        // 정수, 실수를 포함한 다양한 종류의 수를 과학적 표기, 퍼센트 표시, 화폐 표시 등으로 출력할 때 사용
        double num = 12345.6789;

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(num));
        // 정수로만 반올림해서 출력

        df = new DecimalFormat("0.0");
        System.out.println(df.format(num));
        // 소수점 첫째자리까지 반올림해서 출력

        df = new DecimalFormat("0.00");
        System.out.println(df.format(num));
        // 소수점 둘째자리까지 반올림해서 출력

        df = new DecimalFormat("000000");
        System.out.println(df.format(num));
        // 전체 자리수는 6자리로 지정
        // 숫자가 모자랄 경우 그 자리에는 0으로 채움

        df = new DecimalFormat("######");
        System.out.println(df.format(num));
        // 전체 자리수는 6자리로 지정
        // 숫자가 모자랄 경우 그 자리에는 공백으로 채움

        num = 123456789;
        df = new DecimalFormat("###,###,###");
        System.out.println(df.format(num));
        // 천 단위마다 , 를 출력

        num = 0.125;
        df = new DecimalFormat("##%");
        System.out.println(df.format(num));
        // 실수 데이터를 %로 변환

        // Q14
        // 하루는 86400초이다. 입력값이 1234567890일 경우 며칠인지 계산하여라
        // 한 시간은 3600초이다. 입력값이 98765일 경우 몇 시간인지 계산하여라
        // 일 분은 60초이다. 입력값이 12345일 경우 몇 분인지 계산하여라.
        Calendar c = Calendar.getInstance();
        double day = 1234567890 / 86400;
        System.out.println(Math.round(day));
        double hour = 98765 / 3600;


        // Q25
        // 가. 사용자로부터 복권 숫자 3자리를 입력 받으세요 (yourkey)
        // 나. 변수에 임의의 복권 숫자 3자리를 초기화합니다 (lottokey)
        // 다. 사용자가 입력한 복권 숫자가 모두 일치 : 상금 1백만 지급
        // 라. 일치하지 않는 경우 : “아쉽지만, 다음 기회를!” 라고 출력



    }
}
