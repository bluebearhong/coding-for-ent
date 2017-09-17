/**
 * 미니 과제 2. 메소드랑 친해지기

 과제 개요

 아직은 낯선 메소드와 친해져봅시다.
 FavoriteFood 라는 클래스를 만듭니다.
 그 클래스 안에 좋아하는 음식 이름을 출력하는 메소드를 4가지 경우의 수로 표현하세요.
 예를 들어, "나는 치킨을 좋아합니다."라는 문구를 출력해주세요.
 단, 파라미터가 있는 경우에는 음식 이름을 변경 할 수 있도록 합시다.
 필수 과제는 아닙니다.
 다 하신 분은 채팅방에 결과 공유해주세요 :)
 */

public class FavoriteFood {
    public void method1() {
        System.out.println("나는 치킨을 좋아합니다");
    }

    public void method2(String food) {
        System.out.println("나는 " + food  + "을 좋아합니다");
    }

    public String method3() {
        return "나는 치킨을 좋아합니다";
//        System.out.println("나는 치킨을 좋아합니다");
    }

    public String method4(String food) {
        return "나는 " + food  + "을 좋아합니다";
    }

}
