public class Method_Basic {
    // 객체 변수 a 선언
    int a;

    // 두 숫자를 입력 받아서 평균을 구해주는 메서드
    public static int avg(int a, int b){
        int avgValue = (a + b) / 2;
        return avgValue;
    }

    int sum(int a, int b) {
        return a+b;
    }

    static String say() {
        return "Hello world!";
    }

    static void sayNick(String nick) {
        if ("바보".equals(nick)) {
            return;
        }

        System.out.println("나의 별명은 " + nick + " 입니다.");
    }

    static void varTest(Method_Basic methodBasic){
        methodBasic.a++;
    }

    public static void main(String[] args) {

        // 객체 만듬
        Method_Basic methodBasic =  new Method_Basic();
        methodBasic.a = 1;
        methodBasic.varTest(methodBasic);
        System.out.println(methodBasic.a);


//        int a = 1;
//        varTest(a);
//        System.out.println(a);


        sayNick("구자헌");

        int test1 = avg(100, 90);
        System.out.println(test1);
        System.out.println(avg(80,90));


    }
}
