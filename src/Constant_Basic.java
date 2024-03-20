public class Constant_Basic {
    public static void main(String[] args) {
        String name = "김범기";
        final String constant_name;

        name = "kimbumki";
        constant_name = "kimbumki";

        System.out.println("내 이름 변수: " + name);
        System.out.println("내 이름 상수(정상수 아님): " + constant_name);

        /**
         *
        * [Literal - 리터럴 이란 무엇인가?]
        * constant_value =  상수이다.
        * 3 = 리터럴 이다.
        * */
        final int constant_value = 3;

        /**
        * 상수와 리터럴의 공통점은 변하지 않는다는 것이고.
         * 차이점은 상수는 변하지 않는 "변수"지만
         * 리터럴은 변하지 않는 "값" or "데이터"다.
        * */

    }
}

