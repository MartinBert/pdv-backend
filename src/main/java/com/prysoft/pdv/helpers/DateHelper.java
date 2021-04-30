package com.prysoft.pdv.helpers;

import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DateHelper implements Serializable {
    public String getMonthName(String month) {
        String monthName;

        switch (month) {
            case "01":
                monthName = "Enero";
                break;
            case "02":
                monthName = "Febrero";
                break;
            case "03":
                monthName = "Marzo";
                break;
            case "04":
                monthName = "Abril";
                break;
            case "05":
                monthName = "Mayo";
                break;
            case "06":
                monthName = "Junio";
                break;
            case "07":
                monthName = "Julio";
                break;
            case "08":
                monthName = "Agosto";
                break;
            case "09":
                monthName = "Septiembre";
                break;
            case "10":
                monthName = "Octubre";
                break;
            case "11":
                monthName = "Noviembre";
                break;
            default:
                monthName = "Diciembre";
                break;
        }

        return monthName;
    }

    public Double stringDateToDoubleConvertion(String date) {
        Double convertDate = Double.valueOf(0);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date stringToDateConvertion = format.parse(date);
            convertDate = Double.parseDouble(String.valueOf(stringToDateConvertion.getTime()));
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido");
        }

        return convertDate;
    }

    public String dateToStringConvertion(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            String converDate = format.format(date);
            return converDate;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
