package com.company;

public class Fecha1 {
    private int day;
    private int month;
    private int year;

    public Fecha1(int d, int m, int y) {
        if (d < 1 || d > 31 || m < 1 || m > 12)
            throw new RuntimeException("Los valores no son válidos");
        day = d;
        month = m;
        year = y;
    }
}
