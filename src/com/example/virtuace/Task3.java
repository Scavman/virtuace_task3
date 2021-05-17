package com.example.virtuace;

public class Task3 {
    public static void main(String[] args) {
        showStopLightColor(3F);
    }

    //shows the stoplight's expected color after an hour + input minutes
    public static void showStopLightColor(float inputMinutes) {
        String green = "green"; // 3 min
        String yellow = "yellow"; // 1 min
        String red = "red"; // 1 min

        float minutes = inputMinutes;

        if(minutes > 5)
            minutes = inputMinutes % 5;

        if(minutes < 3 || minutes == 5)
            System.out.println(green);
        else if (minutes < 4)
            System.out.println(yellow);
        else
            System.out.println(red);
    }
}
