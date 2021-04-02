package sunmin.basic.day14;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        // Vector
        // ArrayList와 동일한 내부구조를 가지고 있음
        // => 동적배열, 저장순서중요, 중복데이터 허용
        // 멀티스레드 환경에서 안전하게 객체를 추가하고 삭제할 수 있음 => 동기화 기능 지원
        // 따라서 ArrayList는 동기화 옵션이 빠져 있기 때문에 벡터에 비해 속도가 빠름

        // 중요 메서드
        // add(추가), get(출력), set(수정), remove(삭제)

        // 벡터 정의 및 데이터 추가
        Vector<String> names = new Vector<>();
        // List<String> names = new Vector<>();
        names.add("혜교");
        names.add("지현");
        names.add("수지");
        names.add(1, "아이유");

        Vector<Integer> nums = new Vector<>(Arrays.asList(1,2,3,4,5));
        // List<Integer> nums = new Vector<>(Arrays.asList(1,2,3,4,5));
        // 배열을 이용해서 동적배열을 초기화함

        // 벡터 내 데이터 출력
        for(String name : names) {
            System.out.print(name + " ");
        }
        System.out.println("");

        for(Integer num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");

        // 벡터 크기 및 용량
        System.out.println(names.size() + "/" + names.capacity());
        // sunmin_ 벡터의 기본 capacity는 10
        System.out.println(nums.size() + "/" + nums.capacity());

        // 벡터 특정 요소 출력
        System.out.println(names.get(1));

        // 벡터 요소 삭제
        names.remove(1);    // 두번째 요소 삭제
        names.clear();  // 모든 요소 삭제

        // 벡터 특정 요소 값 수정
        nums.add(3, 10);
        nums.set(0, 100);   // 첫번째 요소의 값을 100으로 수정 (수정할 위치 인덱스 값, 수정할 값)
        System.out.println(nums.get(0) + "/" + nums.get(3));

    }

}
