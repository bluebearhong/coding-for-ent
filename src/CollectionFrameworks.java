import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Array
 * ArrayList
 * HashSet
 * HashMap
 */


public class CollectionFrameworks {
    public void explainArray(){
        int[] intArray = new int[5];
//         double[] doubleArray = new double[5];

        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);
    }

    public void explainArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // <  > ? 제네릭, 리스트안에 드간 값은 인티져만 허용하겠다.
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        System.out.println(arrayList.size());
    }

    public void explainHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("hello");
        hashSet.add("hello");
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("hello"));
        System.out.println(hashSet.contains("blue"));

        ArrayList<String> arrayList = new ArrayList<String>(hashSet);
        System.out.println(arrayList.get(0));
    }

    public void explainHashMap() {
        HashMap<String, String > hashMap = new HashMap<>();
        hashMap.put("name", "blue");
        System.out.println(hashMap.get("name"));
    }
}


/**
 질문사항. 클래스이름의 대소문자 구분하는 의미, 자바 자체 함수?명령어? 구분하는 법?
 미니 과제1.
 아래와 같은 세 가지의 데이터가 있습니다.
 1) 북미 나라: 미국, 캐나다
 2) 한국 음식: 양념 치킨, 간장 게장, 부대찌개
 3) 과일 별 특징: 바나나 - 흡수가 빠르다, 망고 - 달고 칼로리가 높다, 수박 - 수분이 많다.
 각각의 데이터는 앞에서 배운 데이터 중 어떤 데이터를 사용하는 것이 좋을까요?
 어울리는 데이터 종류와 그 이유를 알려주세요.
 필수 과제는 아닙니다.
 다 하신 분은 채팅방에 결과 공유해주세요 :)
*/