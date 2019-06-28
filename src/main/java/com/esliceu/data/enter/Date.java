package com.esliceu.data.enter;

/**
 * Created by xavi on 29/09/17.
 */
public class Date {

    private int day;
    private int month;
    private int year;

    // "00-00-0000"

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear(){
        //this is no relevant for the example

        return getYear() % 4 ==0;
    }
}