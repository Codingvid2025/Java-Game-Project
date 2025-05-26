package rectangle;
class Date {
    private int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void print() {
        System.out.println("Date: " + year + "-" + month + "-" + day);
    }

    public void addDays(int n) {
        day += n;
        while (day > 30) { // Simplified month handling
            day -= 30;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public int compare(Date other) {
        int totalDays1 = year * 365 + month * 30 + day;
        int totalDays2 = other.year * 365 + other.month * 30 + other.day;
        return Math.abs(totalDays1 - totalDays2);
    }
}


