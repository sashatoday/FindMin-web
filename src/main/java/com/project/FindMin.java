package com.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sasha on 10.12.17.
 */
public class FindMin {

    public static Integer doit(String array) {

        ArrayList<Integer> integers = parse_input(array);

        Integer min = integers.get(0);
        for (int i : integers) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static ArrayList<Integer> parse_input(String app_args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] parts = app_args.split(" ");
        for (String part : parts) {
            Integer a = Integer.parseInt(part.trim());
            list.add(a);
        }
        return list;
    }
}
