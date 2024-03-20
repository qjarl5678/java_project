public class Variables_type {
    public static void main(String[] args) {
        /*주석은 출력되지 않아요!
          이 형태는  한 줄 이상의 주석에 사용됩니다. */

        boolean sign = true; // 논리형
        int number = 2003;
        long tel = 2147483647;
        tel = 2147483648L;
        float radius = 3.14F;
        double radius_2 = 3.14159265;
        String name = "최범규";

        System.out.println("boolean:"+sign);
        System.out.println("int:"+number);
        System.out.println ("long:"+tel);
        System.out.println("float:"+radius);
        System.out.println("double:"+radius_2);
        System.out.println("String:"+name);

    }
}
