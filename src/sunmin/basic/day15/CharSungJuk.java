package sunmin.basic.day15;

import java.io.*;
import java.util.Scanner;

public class CharSungJuk {
    // 이름, 국어, 영어, 수학을 키보드로 입력받아 sungjuk.dat에 저장하는 코드를 작성하세요
    // 단, 파일에 저장하는 문자열 형식은 다음과 같이 합니다
    // 입력 데이터 : 혜교 97 98 95
    // 출력 형식 : 혜교,97,98,95
    public static void main(String[] args) {

        // 성적 데이터 입력받기
        Scanner sc = new Scanner(System.in);

        String name = "";
        int kor = 0;
        int eng = 0;
        int mat = 0;

//        System.out.print("이름은?");
//        String name = sc.next();
//        System.out.print("국어는?");
//        int kor = sc.nextInt();
//        System.out.print("영어는?");
//        int eng = sc.nextInt();
//        System.out.print("수학은?");
//        int mat = sc.nextInt();

        System.out.println("성적은? ('이름 국어 영어 수학' 순서로)");
        name = sc.next();
        kor = sc.nextInt();
        eng = sc.nextInt();
        mat = sc.nextInt();

        // 입력받은 성적데이터를 파일에 저장
        String fpath = "c:Java/sungjuk.dat";

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(fpath, true);
            // 파일에 데이터 누적 옵션 설정
            bw = new BufferedWriter(fw);

            // bw.write(name + "," + kor + "," + eng + "," + mat + "\n");
            String fmt = "%s,%d,%d,%d\n";
            String data = String.format(fmt, name,kor,eng,mat);
            bw.write(data);

            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println("파일쓰기 오류!");
            e.printStackTrace();
        }

        // 저장한 성적데이터를 화면에 출력
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(fpath);
            br = new BufferedReader(fr);

            while (br.ready()) {
                System.out.println(br.readLine());
            }

            br.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
