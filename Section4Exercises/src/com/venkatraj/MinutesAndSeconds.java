package com.venkatraj;

public class MinutesAndSeconds {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid value";
        }
        String output = "";
        int hours = minutes / 60;
        if (hours < 9) {
            output += "0" + hours + "h ";
        } else {
            output += hours + "h ";
        }
        int remainingMinutes = minutes % 60;
        if (remainingMinutes < 9) {
            output += "0" + remainingMinutes + "m ";
        } else {
            output += remainingMinutes + "m ";
        }
        return output + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSecs = seconds % 60;
        return getDurationString(minutes, remainingSecs);
    }
}
