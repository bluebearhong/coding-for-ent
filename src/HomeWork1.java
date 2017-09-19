/**
 *  과제 1. 성적 나누기

 구현 내용

 가장 상단에 변수를 하나 선언하고, 0~100의 숫자를 하나를 부여합니다.
 점수를 A, B, C, F 구간 별로 나누고, print 함수를 통해 결과를 출력합니다.
 힌트

 if를 사용합니다.
 마감시간

 이번 주 일요일 18:00
 깃허브에 업로드하고 공지 채팅방에 깃허브 링크 공유해주세요
 */

public class HomeWork1 {

//    public int a;

    public void Grade(int a) {

       if(100>=a && a>=80){
            System.out.println("Grade is A");
        }
        else if(80>a && a >= 60){
            System.out.println("Grade is B");
        }
        else if(60>a && a >= 40){
            System.out.println("Grade is C");
        }
        else if(40 > a && a > 0){
            System.out.println("Grade is F");
        }
        else
        {
            System.out.println("점수가 잘못 되었습니다");
        }
    }
}
