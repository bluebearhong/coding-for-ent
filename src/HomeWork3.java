/**
 * 과제 3. 다이아몬드 그리기!

 구현 내용

 컴퓨터 공학과 학생들은 이런 걸 합니다.
 아래 도형을 구현 합니다.
 00100
 01110
 11111
 01110
 00100
 도형을 설명하면 5x5 좌표에, 다이아몬드를 그리고 있습니다.
 힌트

 반복문(for-loop)을 사용해야 합니다.
 마감시간

 선택 과제 입니다.
 */
public class HomeWork3 {
    public int n;
    public void Cordinate(int n) {
        this.n=n;
    }

    public void explainArray(){
        int[] intArray = new int[5];
//         double[] doubleArray = new double[5];

        intArray[0] = 010;

        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);
    }

}
