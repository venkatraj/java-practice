package com.venkatraj;

public class Casts {
    public void castExamples() {
        double d = 9.9999;

        // Discards fraction part
        int i = (int) d;
        System.out.println(String.format("Integer i = %d", i));

        // round off to nearest integer
        i = (int) Math.round(d);
        System.out.println(String.format("Integer i = %d", i));

        // If you cast to less capacity, value truncated
        i = 300;
        byte b = (byte) i;
        System.out.println("Byte b = " + b);
        System.out.println("Byte Max " + Byte.MAX_VALUE);
        System.out.println("Byte Min " + Byte.MIN_VALUE);

        // Can not cast boolean values to numeric values
        boolean bl = true;
        // i = (int) bl;
        i = bl ? 1 : 0;
        System.out.println("Now Integer i is " + i + ", Because bl is true");
        System.out.println("㟬⌛☃♨".length());
        String s = "㟬⌛☃♨";
        System.out.println(s.charAt(0));
        System.out.println(s.codePointCount(0, s.length()));
    }
}
