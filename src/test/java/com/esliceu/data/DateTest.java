package com.esliceu.data;


import com.esliceu.data.enter.Date;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class DateTest {

    private Date initDate(){
        // If we'll change the impl. the test is not necessary to change
        return new Date();
    }

    @Test
    void getDay() {
        Date date = initDate();

        date.setDay(23);
        assertEquals(23,date.getDay());
    }

    @Test
    void getMonth() {
        Date date = initDate();

        date.setMonth(8);
        assertEquals(8,date.getMonth());
    }

    @Test
    void getYear() {
        Date date = initDate();

        date.setYear(1983);
        assertEquals(1983,date.getYear());

    }

    @Test
    void isLeapYear() {
        Date date = initDate();

        date.setDay(23);
        date.setMonth(8);
        date.setYear(1983);

        assertFalse(date.isLeapYear());
    }
}
