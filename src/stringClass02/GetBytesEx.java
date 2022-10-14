package stringClass02;

import java.io.UnsupportedEncodingException;

public class GetBytesEx {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String str = "안녕하세요";

        // 인코딩
        byte[] bytes1 = str.getBytes("UTF-8");
        System.out.println("byte1(UTF-8)의 길이 : " + bytes1.length);

        byte[] bytes2 = str.getBytes("EUC-KR");
        System.out.println("byte1(EUC-KR)의 길이 : " + bytes2.length);

        // 디코딩
        String str1 = new String(bytes1, "UTF-8");
        System.out.println("UTF-8로 디코딩한 문자열 : " + str1);

        String str2 = new String(bytes1, "EUC-KR");
        System.out.println("EUC-KR로 디코딩한 문자열 : " + str2);   // 맥에서 안되는건지 인텔리제에에서 안되는건지 확인
    }


}
