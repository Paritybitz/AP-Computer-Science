package COW7;

public class MyDate
{
    private int day, month, year;
    
    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay(){
        return day;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getYear(){
        return year;
    }
    
    public String toString(){
        return month + "\\" + day + "\\" + year;
    }
    
    public boolean equals(MyDate otherDate){
        if(day == otherDate.getDay() && month == otherDate.getMonth() && year == otherDate.getYear()){
            return true;
        }else{
            return false;
        }
    }
    
    public int compareTo(MyDate otherDate){
        if(year != otherDate.getYear()){
            return year - otherDate.getYear();
        }else if(month != otherDate.getMonth()){
            return month - otherDate.getMonth();
        }else{
            return day - otherDate.getDay();
        }
    }
}
