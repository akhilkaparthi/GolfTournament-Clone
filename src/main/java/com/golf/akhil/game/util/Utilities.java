package com.golf.akhil.game.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
    final static String DATE_FORMAT = "dd/MM/yy";

    /**
     * This method is used to validate the given date
     * @param date
     * @return
     */
    public static boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * This method is to convert simple date to system date
     * @param systemDate
     * @return
     * @throws ParseException
     */
    public static Date convertSimpleDatetoSystemDate(String systemDate) throws ParseException {
        Date date = null;
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            date = df.parse(systemDate);
        } catch (ParseException ex) {
            ex.getStackTrace();
        }

        return date;
    }

    /**
     * This method is to convert epoch date to system date
     * @param epochDate
     * @return
     */
//    public static Date convertEpochToDate(String epochDate) {
//        Date date = null;
//        try {
//            DateFormat df = new SimpleDateFormat("");
//            date = df.parse(epochDate);
//        } catch (ParseException ex) {
//            ex.getStackTrace();
//        }
//        return date;
//    }
    public static Date convertEpochToDate(String epochDate) {
        Date date = null;
        try {
            SimpleDateFormat newFormatter = new SimpleDateFormat("dd-MMM-yyyy");
            date = new Date(Long.parseLong(epochDate));
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return date;

//        SimpleDateFormat newFormatter = new SimpleDateFormat("dd-MMM-yyyy");
//
//        Date date1 = new Date(Long.parseLong(d));
//        Date date2 = new Date(Long.parseLong(epochDate));
//        System.out.println(newFormatter.format(date1)); //Will print out as 07-Nov-1986
//        System.out.println(newFormatter.format(date2)); //Will print out as 07-Nov-1986
//        return date1;
    }
}
