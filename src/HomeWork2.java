/**
 *    과제 2. 클래스 가지고 놀기

 구현 내용

 계산기 클래스를 만들어 봅시다.
 계산기 클래스는 생성 시에 숫자 2개(Double)를 받습니다.
 계산기는 더하기, 빼기, 곱하기, 나누기 메소드를 가집니다.
 반환값도 소수점 이하까지(Double) 표기합니다.
 마감시간

 이번 주 일요일 18:00

 */

public class HomeWork2 {
    public double a;
    public double b;

    public HomeWork2(double a, double b){
        this.a=a;
        this.b=b;
    }

    public double sum()
    {
        return a + b;
    }
    public double minus()
    {
        return a - b;
    }
    public double multi()
    {
        return a * b;
    }
    public double divide() {
        return a / b;
    }
}
