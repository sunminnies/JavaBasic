package sunmin.basic.day16;

import sunmin.basic.sungjuk.SungJukServiceV3;
import sunmin.basic.sungjuk.SungJukServiceV3Impl;

import java.util.Scanner;

public class SungJukV7cMain {

    // 성적처리 프로그램 V7c - ArrayList + 텍스트기반 스트림
    // 입력한 성적데이터를 json 직렬화를 통해 텍스트 기반 파일에 저장
    // json직렬화 : 각 데이터 항목을 반정형 형식으로 파일에 저장하는 방식
    // { "항목명1":항목값1, "항목명2":항목값2...}
    // sunmin_ 항목값이 문자일 경우 "", 숫자일 경우 그냥 사용
    // 따라서 프로그램 종료시 입력했던 데이터는 그대로 유지됨
    // SungJukServiceV3
    // initSungJuk3, saveSungJuk3 (파일처리/json직렬화 추가)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukServiceV3 sjsrv = SungJukServiceV3Impl.getInstance();

        String menu = "";
        sjsrv.initSungJuk3();

        while(true) {
            sjsrv.displayMenu();
            menu = sc.next();

            switch(menu) {
                case "1" : sjsrv.newSungJuk(); break;
                case "2" : sjsrv.showSungJuk(); break;
                case "3" : sjsrv.showOneSungJuk(); break;
                case "4" : sjsrv.modifySungJuk(); break;
                case "5" : sjsrv.removeSungJuk(); break;
                case "0" : sjsrv.saveSungJuk3();
                           System.exit(0); break;
                default:
                    System.out.println("잘못 입력하셨습니다!");
            }
        }


    }
}
