package com.nowcoder.community;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        // wkhtmltoimage https://www.nowcoder.com e:/tmp/wk-images/1.pmg
        // wkhtmltoimage --quality 75 https://www.nowcoder.com e:/tmp/wk-images/2.png

        String cmd = "D:/Program Files/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com e:/tmp/wk-images/2.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
