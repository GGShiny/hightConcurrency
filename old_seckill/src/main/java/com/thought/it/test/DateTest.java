package com.thought.it.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2019/10/18.
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2019-10-10";
        System.out.println(dateFormat.parse(date));
    }
}
