package com.zking.zf.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {
    public static void main(String[] args) {
        String path = "i18n";
        ResourceBundle bundle = ResourceBundle.getBundle(path, Locale.US);
        String bt = bundle.getString("bt.label");
        System.out.println(bt);

        String message = bundle.getString("message");
        message=java.text.MessageFormat.format(message, "小明", "小红");
        System.out.println(message);
    }
}
