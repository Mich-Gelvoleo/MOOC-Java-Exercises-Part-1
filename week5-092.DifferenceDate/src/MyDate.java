public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
        int first = ((this.year - 1)*360) + ((this.month - 1) * 30) + (this.day);
        int second = ((comparedDate.year - 1)*360) + ((comparedDate.month - 1) * 30) + (comparedDate.day);
        
        int result = Math.abs(first - second);
        
        int year = 0;
        
        while(result >= 360){
            year++;
            result -= 360;
        }
        
        return year;
    }

}
