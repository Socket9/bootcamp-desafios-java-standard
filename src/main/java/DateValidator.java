public class DateValidator {

    private DateClass date;

    public DateValidator(DateClass date) {
        this.date = date;
    }

    public boolean dateIsValid(){
        if(dayIsValid() && monthIsValid() && yearIsValid()){
            return true;
        }
        return false;
    }
    private boolean dayIsValid() {
        int day = date.getDay();
        return day >= 1 && day <= getNumberOfDaysOfTheMonth();
    }
    private boolean monthIsValid(){
        int month = date.getMonth();
        return month >= 1 && month <= 12;
    }
    private boolean yearIsValid(){
        int year = date.getYear();
        return year >= 1900 && year <= 2099;
    }
    private int getNumberOfDaysOfTheMonth(){
        int month = date.getMonth();
        int year = date.getYear();

        return switch (month) {
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }
    private boolean isLeapYear(int year){
        return year % 4 == 0;
    }
}
