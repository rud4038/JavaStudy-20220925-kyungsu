package j15_컬렉션.리스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        //값 추가
        list.add("신경수");
        list.add("신경수2");
        list.add("신경수3");
        list.add("신경수4");
        list.add("신경수5");

        System.out.println(list);

        list.add(3,"신경수6");

        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<String>();

        System.out.println(list2);

        list2.addAll(list);

        System.out.println(list2);

        //값 조회
        String str1 = list.get(0);

        System.out.println("<<<<<<< 일반 반복 >>>>>>>" );
        // 반복을 사용한 값 조회
        // 1. 일반 반복문
        for(int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("<<<<<<< foreach >>>>>>>" );
        // 2. foreach
        for(String str : list){
            System.out.println(str);
        }

        System.out.println("<<<<<<< foreach 메서드 >>>>>>>" );
        // 3. foreach 메서드
        list.forEach(str -> {
            System.out.println(str);
        });

        System.out.println("<<<<<<< iterator 반복자 >>>>>>>" );
        // 4. iterate 반복자
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // 값 수정
        list.set(0,"신경수7");
        System.out.println(list);

        // 값 삭제
        list.remove("신경수2");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        System.out.println("<<<<<<<< removeAll(list2 - list) >>>>>>>>>");
        System.out.println(list2);
        list2.removeAll(list);
        System.out.println(list2);

        System.out.println("<<<<<<<< removeIf(칠 or 사) >>>>>>>>>");
        System.out.println(list);
        list.removeIf((str) -> {
            return str.contains("7") || str.contains("4");
        });
        System.out.println(list);

        // 포함하고 있는지 확인
        System.out.println(list.contains("신경수5") ? "신경수5 포함하고 있음" : "포함하고 있지 않음");

        // 리스트 비우기
        list.clear();
        System.out.println(list);

        //배열을 리스트로 변환
        String[] names = new String[]{"신경수", "신경수2", "신경수3", "신경수3", "신경수4", "신경수5"};
        list.addAll(Arrays.asList(names));

        System.out.println(list);

        // 리스트에 포함된 값의 위치(indexOf(왼쪽부터 탐색) , lastIndexOf(오른쪽부터 탐색))
        int index = list.lastIndexOf("신경수3");
        System.out.println("index: " + index);

    }
}
