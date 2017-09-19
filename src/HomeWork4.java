import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 과제 4. 로또 번호 생성기 만들기

 구현 내용

 1부터 25까지 숫자 중에서 6개를 고르는 로또를 만들어봅시다.
 자바 랜덤 공식 : 최소값 + (int)(Math.random() * ((최소값 - 최대값) + 1))
 (int) (Math.random() * ((24) + 1)) 는 0에서 24까지의 자연수 중 임의의 숫자를 꺼내줍니다.
 힌트

 중복을 제거하기 위해서는 자료형 중 HashSet을 이용할 수 있습니다.
 HashSet은 toArray() 메소드를 통해서 Array로 만들 수 있습니다.
 마감시간

 선택사항 입니다.
 */

public class HomeWork4 {
    public void lotto(){
        HashSet<Integer> lottonum = new HashSet<>();
        int i=0;
        for(i=0 ; ; i++){
            lottonum.add((int) (Math.random() * ((24) + 1)));
            System.out.println(i);
            if(lottonum.size()==6){
                break;
            }
        }
//        int[] convertarray = new int[6];
        lottonum.toArray(); // toArray 사용방법을 잘 모르겠습니다..
        System.out.println(lottonum);  // HashSet 배열인 lottonum 의 n 번째 값만 출력하려면 어떻게 하나요? [1] 이나 (1) 을 넣어봐도 오류가 뜨네요
    }

}
