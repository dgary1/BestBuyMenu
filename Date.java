// Date class

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int m, int d, int y) {
        day = d;
        month = m;
        year = y;
    }
    public void setMonth(int m) {
        month = m;
    }
    public void setDay(int d) {
        day = d;
    }
    public void setYear(int y) {
        year = y;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
}
