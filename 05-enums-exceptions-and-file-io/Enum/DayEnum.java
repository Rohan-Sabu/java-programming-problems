package Enum;

public enum DayEnum {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekDay;

    DayEnum(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    String getType(){
        return isWeekDay ? "Weekday" : "Weekend";
    }
   
}
