package stringClass01;

import java.io.IOException;

public class KeyBoardToString {
    public static void main(String[] args) {

        byte[] bytes = new byte[100];

        System.out.print("입력 : ");
        int readBytesNo = 0;

        try {
            // 키보드(표준입력)으로부터 입력을 받고 그 내용을 bytes 에 저장하고
            // 입력받은 바이트수를 리턴함
            readBytesNo = System.in.read(bytes);
            // 문자셋 EUC-KR로 디코딩
            String str = new String(bytes, 0, readBytesNo-2,"UTF-8");
            System.out.println(str);
            System.out.println("입력받은 바이트 수 : " + readBytesNo);

            byte[] b = str.getBytes("UTF-8");
            System.out.println(b.length);

            // 맥에서의 한글입력 문제인지? EUC-KR 한글깨짐
            byte[] b2 = "안녕하세요".getBytes();
            String str1 = new String(b2, 0, b2.length, "UTF-8");
            System.out.println(str1);
            System.out.println(b2.length);
        } catch (IOException e) {}
    }
}
