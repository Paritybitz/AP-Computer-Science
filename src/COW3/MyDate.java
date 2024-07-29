package COW3;

public class MyDate {
    //class level variable
    private int _day;
    private int _month;
    private int _year;

    //constructor
    public MyDate(int day, int month, int year)
    {
        _day = day;
        _month = month;
        _year = year;
    }

    public int getDay()
    {
        return(_day);
    }

    public int getMonth()
    {
        return(_month);
    }

    public int getYear()
    {
        return(_year);
    }

    public String toString() {
        String date = String.format("%1$s\\%2$s\\%3$s", _month, _day, _year);
        return(date);
    }

    public boolean equals(MyDate otherDate)
    {
        return(this._day == otherDate.getDay() && this._month == otherDate.getMonth() && this._year == otherDate.getYear());
    }

    public int compareTo(MyDate otherDate) {
        if(this.equals(otherDate))
            return(0);
        else if(this._year > otherDate.getYear())
            return(1);
        else if(this._year < otherDate.getYear())
            return(-1);
        else {
            if (this._month > otherDate.getMonth())
                return(1);
            else if (this._month < otherDate.getMonth())
                return(-1);
            else if (this._day > otherDate.getDay())
                return(1);
            else
                return(-1);
        }
    }
}
