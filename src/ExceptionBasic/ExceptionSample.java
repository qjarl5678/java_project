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
        //int c = 4/0;

        //ArrayIndexOutOfBoundsException
        int[] a = {1,2,3};
        System.out.println(a[3]);

    }
}
