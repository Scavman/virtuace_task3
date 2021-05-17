package com.example.virtuace;

public class Task3 {
    public static void main(String[] args) {
        showStopLightColor(5.0001F * 12);
    }

    //shows the stoplight's expected color after an hour + input minutes
    public static void showStopLightColor(float minutes) {
        String green = "green"; // 3 min
        String yellow = "yellow"; // 1 min
        String red = "red"; // 1 min

        if(minutes % 3 >= 0 && minutes % 4 >= 0 && minutes % 4 < 3 && minutes % 4 >= minutes % 5) {
            System.out.println(green);
        } else if (minutes % 3 >= 0 && minutes % 2 >= 1){
            System.out.println(yellow);
        } else {
            System.out.println(red);
        }
    }
}
