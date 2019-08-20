package com.venkatraj;

public class NumericConversions {
    public void showConversions() {
        double d = 2.4;
        float f = 3.5f;
        long l = 25L;
        int i = 10;
        short s = 5;
        // Double + Integer => Double
        System.out.println(((Object)(d+i)).getClass().getName());

        // Double + Float => Double
        System.out.println(((Object)(d+f)).getClass().getName());

        // Float + Integer => Float
        System.out.println(((Object)(f+i)).getClass().getName());

        // Long + Integer => Long
        System.out.println(((Object)(l+i)).getClass().getName());

        // Short + Integer => Integer
        System.out.println(((Object)(s+i)).getClass().getName());
    }
}
