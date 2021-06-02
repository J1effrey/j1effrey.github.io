package com.msb.test08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {

        // 2. define date format
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        while (true) {
            // 1. get current date
            Date d = new Date();
            // 3. transform date into string according to the format above
            System.out.println(df.format(d));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
