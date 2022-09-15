package com.company;

public class Fecha2 {
    private int day;
    private int month;
    private int year;

    public Fecha2(int d, int m, int y)  throws Exception{
        if (d < 1 || d > 31 || m < 1 || m > 12)
            throw new Exception("Los valores no son válidos");
        day = d;
        month = m;
        year = y;
    }
}
