package ExceptionBasic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSample {
    public static void main(String[] args) throws IOException {
        // FileNotFoundException
        //BufferedReader br = new BufferedReader(new FileReader("없는 파일"));
        //br.readLine();
        //br.close();

        // ArithmeticException
        int c;
        try{
            c = 4/0; // 여기가 에러 나는 곳
        }catch (ArithmeticException e){
            c = -1;
        } finally {
            // Exception에 상관없이 반드시 수행함
            System.out.println("~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~");
        }

        System.out.println(c);

        //ArrayIndexOutOfBoundsException
        //int[] a = {1,2,3};
        //System.out.println(a[3]);

    }
}
