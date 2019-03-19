package com.example.yannamreddy.onewaybinding;

import android.databinding.InverseMethod;

public class Converter {
    @InverseMethod("toInt")
    public static String toString(int value) {
        return "" + value;
    }

    public static int toInt(String value) {
        return Integer.parseInt(value);
    }
}
