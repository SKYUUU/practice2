package otherClass05;

import java.text.DecimalFormat;

public class DecimalFormatEx {
    public static void main(String[] args) {

        double number = 11223344.55;

        // 0은 자릿수 다 차지를 하고, # 은 표현은 하되 없는 자릿수 표현은 하지 않음
        DecimalFormat dFormat = new DecimalFormat("0");
        System.out.println(dFormat.format(number));

        dFormat = new DecimalFormat("0.0");
        System.out.println(dFormat.format(number));

        dFormat = new DecimalFormat("00000000000.00000");
        System.out.println(dFormat.format(number));

        dFormat = new DecimalFormat("#");
        System.out.println(dFormat.format(number));

        dFormat = new DecimalFormat("#.#");
        System.out.println(dFormat.format(number));

        dFormat = new DecimalFormat("#############.#######");
        System.out.println(dFormat.format(number));

        dFormat = new DecimalFormat("#,###.00");
        System.out.println(dFormat.format(number));
    }
}
