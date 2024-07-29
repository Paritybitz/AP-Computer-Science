package COW2;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Calendar
{
    public static boolean isSchoolOpen(boolean isWeekDay, boolean isHoliday, boolean timeForVacation){
        return (isWeekDay && !isHoliday && !timeForVacation);
    }

    public static int getNumberOfMonth(String month){
        Month mnth = Month.valueOf(month.toUpperCase());
        return(mnth.ordinal() + 1);
    }

    public static boolean isLate(String monthSubmitted, int daySubmitted, String monthDue, int dayDue){
        return false;
    }

    public static String whatSeason(String month, int day) {

        if ((month == "March" && day >= 19 && day <= 31)
         || (month == "April" && day >= 1 && day <= 30)
         || (month == "May" && day >= 1 && day <= 31)
         || (month == "June" && day >= 1 && day <= 19))
            return ("spring");
        else if ((month == "June" && day >= 20 && day <= 30)
                || (month == "July" && day >= 1 && day <= 31)
                || (month == "August" && day >= 1 && day <= 30)
                || (month == "September" && day >= 1 && day <= 21))
            return ("summer");
        else if ((month == "September" && day >= 22 && day <= 30)
                || (month == "October" && day >= 1 && day <= 31)
                || (month == "November" && day >= 1 && day <= 30)
                || (month == "December" && day >= 1 && day <= 20))
            return ("fall");
        else
            return ("winter");

/*        LocalDate springDate = LocalDate.parse("2022-03-19");
        LocalDate summerDate = LocalDate.parse("2022-06-20");
        LocalDate fallDate = LocalDate.parse("2022-09-22");
        LocalDate winterDate = LocalDate.parse("2022-12-21");

        LocalDate givenDate = LocalDate.parse("2022-04-01");

        String string_format="4/1/2021";
        Date date_format = new SimpleDateFormat("dd/MM/yyyy").parse(string_format);


        if (givenDate.compareTo(springDate) > 0 && givenDate.compareTo(summerDate) < 0)
            return("spring");
        else if (givenDate.compareTo(springDate) > 0 && givenDate.compareTo(summerDate) < 0)
            return("summer");
        else if (givenDate.compareTo(summerDate) > 0 && givenDate.compareTo(fallDate) < 0)
            return("fall");
        else if (givenDate.compareTo(fallDate) > 0 && givenDate.compareTo(winterDate) < 0)
            return("winter");

        return("");*/
    }

    public static String whatZodiacSign(String month, int day){
        //String dateString = month + " " + String.valueOf(day) + ", 2022";    //manual approach
        String dateString = String.format("%s %d, 2022", month, day);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        //get date in date object for later comparison
        LocalDate birthDate = LocalDate.parse(dateString, formatter);

        //https://www.tutorialspoint.com/how-to-compare-two-dates-in-java
        if (((birthDate.compareTo(LocalDate.parse("2022-01-20")) > 0) && (birthDate.compareTo(LocalDate.parse("2022-02-18")) < 0))
                || (birthDate.compareTo(LocalDate.parse("2022-01-20")) == 0) || (birthDate.compareTo(LocalDate.parse("2022-02-18")) == 0))
            return ("Aquarius");
        else if (((birthDate.compareTo(LocalDate.parse("2022-02-19")) > 0) && (birthDate.compareTo(LocalDate.parse("2022-03-20")) < 0))
                || (birthDate.compareTo(LocalDate.parse("2022-02-19")) == 0) || (birthDate.compareTo(LocalDate.parse("2022-03-20")) == 0))
            return ("Pisces");
        else if (((birthDate.compareTo(LocalDate.parse("2022-03-21")) > 0) && (birthDate.compareTo(LocalDate.parse("2022-04-19")) < 0))
                || (birthDate.compareTo(LocalDate.parse("2022-03-21")) == 0) || (birthDate.compareTo(LocalDate.parse("2022-04-19")) == 0))
            return ("Aries");
        else if (((birthDate.compareTo(LocalDate.parse("2022-04-20")) > 0) && (birthDate.compareTo(LocalDate.parse("2022-05-20")) < 0))
                || (birthDate.compareTo(LocalDate.parse("2022-04-20")) == 0) || (birthDate.compareTo(LocalDate.parse("2022-05-20")) == 0))
            return ("Taurus");
        else if (((birthDate.compareTo(LocalDate.parse("2022-05-21")) > 0) && (birthDate.compareTo(LocalDate.parse("2022-06-20")) < 0))
                || (birthDate.compareTo(LocalDate.parse("2022-05-21")) == 0) || (birthDate.compareTo(LocalDate.parse("2022-06-20")) == 0))
            return ("Gemini");
        else if (((birthDate.compareTo(LocalDate.parse("2022-06-21")) > 0) && (birthDate.compareTo(LocalDate.parse("2022-07-22")) < 0))
                || (birthDate.compareTo(LocalDate.parse("2022-06-21")) == 0) || (birthDate.compareTo(LocalDate.parse("2022-07-22")) == 0))
            return ("Cancer");
        else if (((birthDate.compareTo(LocalDate.parse("2022-07-23")) > 0) && (birthDate.compareTo(LocalDate.parse("2022-08-22")) < 0))
                || (birthDate.compareTo(LocalDate.parse("2022-07-23")) == 0) || (birthDate.compareTo(LocalDate.parse("2022-08-22")) == 0))
            return ("Leo");
        else if (((birthDate.compareTo(LocalDate.parse("2022-08-23")) > 0) && (birthDate.compareTo(LocalDate.parse("2022-09-22")) < 0))
                || (birthDate.compareTo(LocalDate.parse("2022-08-23")) == 0) || (birthDate.compareTo(LocalDate.parse("2022-09-22")) == 0))
            return ("Virgo");
        else if (((birthDate.compareTo(LocalDate.parse("2022-09-23")) > 0) && (birthDate.compareTo(LocalDate.parse("2022-10-22")) < 0))
                || (birthDate.compareTo(LocalDate.parse("2022-09-23")) == 0) || (birthDate.compareTo(LocalDate.parse("2022-10-22")) == 0))
            return ("Libra");
        else if (((birthDate.compareTo(LocalDate.parse("2022-10-23")) > 0) && (birthDate.compareTo(LocalDate.parse("2022-11-21")) < 0))
                || (birthDate.compareTo(LocalDate.parse("2022-10-23")) == 0) || (birthDate.compareTo(LocalDate.parse("2022-11-21")) == 0))
            return ("Scorpio");
        else if (((birthDate.compareTo(LocalDate.parse("2022-11-22")) > 0) && (birthDate.compareTo(LocalDate.parse("2022-12-21")) < 0))
                || (birthDate.compareTo(LocalDate.parse("2022-11-22")) == 0) || (birthDate.compareTo(LocalDate.parse("2022-12-21")) == 0))
            return ("Sagittarius");
        else
            return ("Capricorn");
    }

    public static boolean isALeapYear(int year){
        LocalDate date = LocalDate.parse(String.valueOf(year) + "-01-01");
        return (date.isLeapYear());
    }
}

