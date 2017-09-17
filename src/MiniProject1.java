import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 미니 과제 1. 어떤 데이터를 쓰는 게 좋을까요?

 과제 개요

 아래와 같은 세 가지의 데이터가 있습니다.
 1) 북미 나라: 미국, 캐나다
 2) 한국 음식: 양념 치킨, 간장 게장, 부대찌개
 3) 과일 별 특징: 바나나 - 흡수가 빠르다, 망고 - 달고 칼로리가 높다, 수박 - 수분이 많다.
 각각의 데이터는 앞에서 배운 데이터 중 어떤 데이터를 사용하는 것이 좋을까요?
 어울리는 데이터 종류와 그 이유를 알려주세요.
 필수 과제는 아닙니다.
 다 하신 분은 채팅방에 결과 공유해주세요 :)
 */
public class MiniProject1 {
    // 추가 될 개체들이 한정 되어있고 중복은 빠져야하므로 hashset
    public void NorthAmerica() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("미국");
        hashSet.add("캐나다");
        hashSet.add("미국");
        System.out.println("북미 나라 " + hashSet);
    }

    // 추가 될 개체들이 다소 많으므로 배열의 크기를 그때 그때 늘릴수 있는 arrayList
    public void KoreanFood() {
        ArrayList<String> arrayList = new ArrayList<>(2);

        arrayList.add("양념 치킨");
        arrayList.add("간장 게장");
        arrayList.add("부대 찌개");

        System.out.println("한국 음식: ");
        for (int i=0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
//            System.out.println(arrayList.get(1));
//            System.out.println(arrayList.get(2));
        }
    }

    // key 에 따른 값이 매칭 되야 하므로 hashMap
    public void FruitSpec() {
        HashMap<String, String > hashMap = new HashMap<>();
        hashMap.put("바나나", "흡수 빠르다");
        hashMap.put("망고", "달다");
        hashMap.put("망고", "고칼로리"); // 망고라는 키에 해당되는 값을 여러개 넣고 싶을때 어떻게 해야 할까요?
        hashMap.put("수박", "수분이 많다");

        System.out.println("바나나 특성:");
        System.out.println(hashMap.get("바나나"));
    }

}
