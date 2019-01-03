package main.java.com.core.enums.enumApples;

// Use an enum constructor, instance variable, and method.
public class EnumAppleMain {
    public static void main(String args[]) {

        // Display price of Winesap.
        System.out.println("Winesap costs " + EnumApple.Winesap.getPrice() + " cents.\n");

        // Display all apples and prices.
        System.out.println("All apple prices:");
        for (EnumApple a : EnumApple.values())
            System.out.println(a + " costs " + a.getPrice() + " cents." + " № " + a.ordinal());

        // Demonstrate ordinal(), compareTo(), and equals().
        EnumApple ap, ap2, ap3;
        ap = EnumApple.RedDel;
        ap2 = EnumApple.GoldenDel;
        ap3 = EnumApple.RedDel;

        System.out.println();

        // Demonstrate compareTo()
        //final int compareTo()( тип _ перечисления е)
        /*Если порядковое значение вызывающей константы меньше, чем
у константы е, то метод compareTo ( ) возвращает отрицательное значение. Если
же порядковые значения обеих констант одинаковы, возвращается нуль. А если
порядковое значение вызывающей константы больше, чем у константы е , то возвращается
положительное значение.*/
        // для проверки работы
//        int a=ap.compareTo(ap2);
//        System.out.println(a);
        int a=ap2.compareTo(ap);
        System.out.println(a);

        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " comes before " + ap2);

        if (ap.compareTo(ap2) > 0) //true
            System.out.println(ap2 + " comes before " + ap);

        if (ap.compareTo(ap3) == 0) //true
            System.out.println(ap + " equals " + ap3);

        System.out.println();
        // Demonstrate  equals()
        if (ap.equals(ap2))
            System.out.println("Error!");

        if (ap.equals(ap3)) //true
            System.out.println(ap + " equals " + ap3);

        if (ap == ap3) //true
            System.out.println(ap + " == " + ap3);

    }
}




