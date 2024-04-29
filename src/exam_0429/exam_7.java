package exam_0429;

/**
 *
 * 7. 다음의 요구 사항을 충족시키는 Java 프로그램을 작성하세요.
 * 7-1. Calculator 클래스를 만드세요. 이 클래스에는 정수형 데이터를 입력받아 두 수를 더하는 add() 메서드를 작성하세요.
 * 7-2. Main 클래스에서 Calculator 객체를 생성하고, add() 메서드를 사용하여 두 수를 더한 결과를 출력하세요.
 *
 * */

// Calculator 클래스
class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class exam_7 {
    public static void main(String[] args) {
        System.out.println("7번 문제 답");
        Calculator calculator = new Calculator();
        int result = calculator.add(150, 75);
        System.out.println("합계 : " + result);
    }

}
