public class Date {
    private int month;
    private int day;
    private int year;

    private static final int [] daysPerMonth = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public Date(int theMonth, int theDay, int theYear)
    {
        month = checkMonth(theMonth);
        year = theYear;
        day = checkDay(theDay);
    }
    public int checkMonth(int testMonth)
    {
        if(testMonth > 0 && testMonth <= 12)
        {
            return testMonth;
        }
        else
            throw new IllegalArgumentException("Month value must be in range 0f 1 - 12");
    }
    public int checkDay(int testDay)
    {
        if(testDay > 0 && testDay <= daysPerMonth[month])
        {
            return testDay;
        }

        if(month == 2 && day == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
        {
            return testDay;
        }
        else
            throw new IllegalArgumentException("Day is not valid for this Month & Year");
    }
    public String toString()
    {
        return String.format("%d/%d/%d ", month, day, year);
    }
}
