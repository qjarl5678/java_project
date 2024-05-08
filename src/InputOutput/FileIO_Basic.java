package InputOutput;

import java.io.*;

public class FileIO_Basic {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("/Users/bk/workspace/ch12-java/out.txt");
        FileWriter fileWriter = new FileWriter("/Users/bk/workspace/ch12-java/out.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i = 1; i <51; i ++){
            String data = "선배 마라탕 "+i+"개 사주세요~.";

            printWriter.println(data);
            // fileWriter.write(data);
            // outputStream.write(data.getBytes());
        }

        // 두번째 함수 인자는 추가 모드를 뜻합니다.
        FileWriter fileWriter2 = new FileWriter("/Users/bk/workspace/ch12-java/out.txt", true);
        for (int i = 1; i < 11; i++){
            String data = "꽁꽁 얼어붙은 한강 위로 고양이 " + i + "마리가 걸어다닙니다. \r\n";
            fileWriter2.write(data);
        }

        // outputStream.close();
        // fileWriter.close();
        printWriter.close();
        fileWriter2.close();
    }
}
