package com.esliceu.data.text;

/**
 * Created by xavi on 29/09/17.
 */
public class Date {

    private final String SEPARATOR = "-";

    // "00-00-0000"
    private String date = "00" + SEPARATOR + "00" + SEPARATOR + "0000";

    private enum Part {
        DAY,MONTH,YEAR
    }

    public int getDay() {
        return extractPartOfDate(Part.DAY);
    }

    public void setDay(int day) {

        updatePartOfDate(Part.DAY,day);

    }

    public int getMonth() {
        return extractPartOfDate(Part.MONTH);
    }

    public void setMonth(int month) {
        updatePartOfDate(Part.MONTH,month);
    }

    public int getYear() {
        return extractPartOfDate(Part.YEAR);
    }

    public void setYear(int year) {
        updatePartOfDate(Part.YEAR,year);
    }



    public boolean isLeapYear(){
        //this is no relevant for the example
        return getYear() % 4 ==0;
    }

    private void updatePartOfDate(Part datePart, int value){
        String[] dataParts = date.split(SEPARATOR);
        dataParts[datePart.ordinal()] = String.valueOf(value);
        this.date = convertDatePartsToDate(dataParts);
    }

    private int extractPartOfDate(Part part){
        String[] dateParts = date.split(SEPARATOR);
        String partValue = dateParts[part.ordinal()];
        return Integer.parseInt(partValue);
    }

    private String convertDatePartsToDate(String[] dataParts) {
        return dataParts[Part.DAY.ordinal()] + SEPARATOR +
                dataParts[Part.MONTH.ordinal()] + SEPARATOR +
                dataParts[Part.YEAR.ordinal()];
    }
}