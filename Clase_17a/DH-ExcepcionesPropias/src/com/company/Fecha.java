package com.company;

import com.company.FechaException;

public class Fecha {
    int day;
    int month;
    int year;

    public Fecha(int d, int m, int y) throws  FechaException
    {
        if (d<1||d>31)
            throw new FechaException("Error en el día");
        day=d;
        if (d<1||d>31)
            throw new FechaException("Error en el mes");
        month=m;
        year=y;
    }


}
