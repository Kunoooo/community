package com.nowcoder.community;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        String cmd = "/usr/local/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com /Users/jiangkun/java/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            Thread.sleep(3000);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
