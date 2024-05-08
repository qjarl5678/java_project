package InputOutput;

import java.util.Scanner;

public class Scanner_Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("일반 출력");
        System.err.println("에러메시지 출력");

        while (true){
            System.out.println(sc.next());
        }

    }
}
