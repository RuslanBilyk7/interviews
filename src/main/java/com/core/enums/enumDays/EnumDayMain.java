package main.java.com.core.enums.enumDays;

public class EnumDayMain {
    public static void main(String[] args) {

        EnumDay current = EnumDay.MONDAY;
        System.out.println(current);
        System.out.println();

//        EnumDay alldays[] = EnumDay.values();
//        for (EnumDay s : alldays
        for (EnumDay s : EnumDay.values()) {
            System.out.println(s);
        }
        System.out.println();

        switch (EnumDay.SATURDAY) {
            case FRIDAY:
                System.out.println("This is not Saturday");
                break;
            case SUNDAY:
                System.out.println("This is not Saturday");
                break;
            case SATURDAY:
                System.out.println("This is Saturday!!!");
                break;
        }
        System.out.println();
        System.out.println(EnumDay.valueOf("MONDAY"));
    }
}
