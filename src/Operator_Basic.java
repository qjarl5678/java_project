public class Operator_Basic {
    public static void main(String[] args) {
        int test1 = 0;
        int test2 = 0;
        int test3 = 0;
        int test4 = 0;

        // 연산식: ++ 피연산자
        // ++test1;
        System.out.printf("TEST 1 : %d \n", ++test1);
        // 연산식:  -- 피연산자
        // --test2;
        System.out.printf("TEST 2 : %d \n" , --test2);
        // 연산식: 피연산자 ++
        // test3++;
        System.out.printf("TEST 3 : %d \n" , test3++);
        System.out.printf("TEST 3 AFTER: %d \n" , test3);
        // 연산식: 피연산자 --
        // test4--;
        System.out.printf("TEST 4 : %d \n" , test4--);
        System.out.printf("TEST 4 AFTER: %d \n" , test4);

        /***************************************************************/

        // 논리 부정 연산자
        System.out.println(!false);
        System.out.println(!true);

        // 산술 연산자
        System.out.println(33/6); // "/" = 항상 몫을 출력함
        System.out.println(33%6); // "%" = 항상 나머지를 출력함
        // (X) % 2 == 0
        // 해당 값은 짝수 아니라면 홀수
        System.out.println(123123123%2);

        // 비교 연산자
        System.out.println(1>2);    // false
        System.out.println(1>=2);   // false
        System.out.println(1<2);    // true
        System.out.println(1<=2);   // true
        System.out.println(1 == 2); // false
        System.out.println(1 != 2); // true
        System.out.println(!(1 == 2)); // true

        // 논리 연산자
        System.out.println(true && false); // AND = 둘 다 true면 true, 나머지는 다 false
        System.out.println(true || false); // OR = 둘 중 하나만 ture면 true, 둘 다 false면 false

        // 2진수로 계산하면 됩니다.
        System.out.println(10&3);
        System.out.println(10|3);
        System.out.println(10^3);

        // 삼항 연산자
        System.out.println(false ? 1 : 2 );
        System.out.println(true ? 1 : 2 );

        int test = 0;
        System.out.println(test++ != --test && false ^ true || test++ > --test);
    }
}
