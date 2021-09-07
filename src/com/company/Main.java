package com.company;

public class Main {

    public static void main(String[] args) {
	    // Time 1
        int hour = 21;
        int minute = 45;
        int second = 35;

        // Time 2
        int hour2 = 23;
        int minute2 = 55;
        int second2 = 20;

        // Variables
        double totalDay = 24 * 3600;
        double totalSec = (hour * 3600 ) + (minute * 60 + second);
        double percentDayPassed = (totalSec / totalDay) * 100;
        double remainToday = totalDay - totalSec;
        int deltaTime = ((hour2 - hour) * 3600) + ((minute2 - minute) * 60) + (second2 - second);


        System.out.println("Seconds passed since midnight: " + totalSec);
        System.out.println("Seconds remaining today: " + remainToday);
        System.out.printf("Percent of the day passed: %.2f\n", percentDayPassed);
        System.out.println("Time since work began: " + deltaTime + " seconds");

        if (minute > minute2){
            hour2 = hour2 - 1;
            minute2 = minute2 + 60;
            if (second > second2){
                minute2 = minute2 - 1;
                second2 = second2 + 60;
            }
        } else {
            if (second > second2){
                minute2 = minute2 - 1;
                second2 = second2 + 60;
            }
        }
        System.out.println(hour2 - hour + " Hours, " + (minute2 - minute) + " Minutes, " + (second2 - second) + " Seconds has passed");
    }
}
