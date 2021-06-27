package enums;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SATURDAY);
        today.daysInfo();
    }
}

enum WeekDays{
    MONDAY,TUESDAY,WEDNSDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}

class Today {
    WeekDays weekDay;
    public  Today(WeekDays weekDay){
        this.weekDay = weekDay;
    }

    void daysInfo(){
        switch (weekDay){
            case MONDAY:
            case TUESDAY:
            case WEDNSDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("You must go work!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Can weekend");
                break;
        }
    }
}
