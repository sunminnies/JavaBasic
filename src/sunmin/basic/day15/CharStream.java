package sunmin.basic.day15;

import java.io.*;

public class CharStream {
    public static void main(String[] args) {
        // 스트림stream
        // 데이터를 비트 등의 단위로 조각을 내어 일련의 연속서을 갖도록 만든 데이터의 열
        // 이러한 조각들이 하나의 줄기를 이루어 순서대로 물흐르듯이 전송되게 함

        // 스트림은 데이터를 쓰고 읽기 위한 공통적인 방법을 제공함
        // 자바에서의 스트림 처리방식은 모든 데이터를 바이트로 보는 바이트 단위 스트림과
        // 문자 데이터를 위한 문자 단위 스트림이 있음

        // 문자 단위 스트림 - 스트림을 문자로만 처리함
        // 유니코드로 된 문자를 입출력하는 스트림
        // 문자로 표현되지 않는 데이터는 다루지 않음

        // 문자스트림을 다루는 클래스 : java.io 패키지에 포함
        // Reader/Writer => FileReader/FileWriter

        // 문자 기반으로 스트림을 읽거나 씀 : 유니코드 기반(1~3byte)
        // 주로 텍스트 기반 데이터를 처리할 때 사용
        // 사람이 읽고 쓸 수 있는 데이터를 대상으로 함

        // 자신의 이름, 몸무게, 키를 파일에 저장하기
        String name = "태희";
        int weight = 55;
        double height = 173.5;

        // 파일에 쓰기
        String fpath = "c:/Java/info.txt"; // 저장위치 & 파일명

        // FileWriter 객체 초기화 - 반드시 try/catch 처리 해야함
        FileWriter fw = null;

        try {
            fw = new FileWriter(fpath);

            fw.write(name + "\n"); // write 메서드로 파일에 내용 기록
            fw.write(weight + "\n");
            fw.write(height + "\n");

            fw.close(); // 파일쓰기 종료 (클로즈 하지 않으면 내용 기록되지 않음)
        } catch (IOException e) {
            System.out.println("파일쓰기 오류!");
            e.printStackTrace();
        }

        // 파일 읽기 1 : 파일로부터 문자 하나씩 읽어 화면에 출력
        FileReader fr = null;

        try {
            fr = new FileReader(fpath);

            int ch = 0;  // 읽어온 문자를 저장할 변수 선언

            // fr.read() : 지정한 파일 객체로부터 문자코드 하나를 읽어옴
            // ch = fr.read() : 읽어온 문자 코드를 ch 변수에 저장
            // (ch = fr.read()) != -1 : ch 변수에 저장된 코드값이 -1 아니라면,
            // 즉, 읽어온 코드가 유효하지 않다면(더이상 읽어올 문자가 없다면) 중단한다
            while ((ch = fr.read()) != -1) {
                System.out.print((char)ch);
                // 읽어온 코드값을 문자로 변환함(char)
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 파일 읽기 2 : 라인단위로 읽어 화면에 출력
        // BufferedReader 클래스를 사용함으로써 입력속도를 높임
        BufferedReader br = null;
        try {
            fr = new FileReader(fpath);
            br = new BufferedReader(fr); // 버퍼기능이 있는 Reader 선언

            while(br.ready()) { // 해당 라인에 읽어올 stream(문자열 집합)이 있는지 없는지 확인
                System.out.println(br.readLine()); // text를 라인으로 읽어옴 (\n이 있을때까지)
            }

            br.close(); // LIFO 형식으로 객체를 닫음 (Last In First Out)
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
