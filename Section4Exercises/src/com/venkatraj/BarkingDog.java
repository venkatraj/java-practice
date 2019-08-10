package com.venkatraj;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && ((hourOfDay > 22 && hourOfDay <= 23)
                || (hourOfDay < 8 && hourOfDay >= 0))) {
            return true;
        } else {
            return false;
        }
    }
}
