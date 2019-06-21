package edu.oca.java.se8.certification._1Z0_808.chapter2;

/*
A switch statement has a target variable that is not evaluated until runtime. 

Prior to Java 5.0, this variable could only be int values or those values that could
be promoted to int, specifi cally byte, short, char, or int. 

When enum was added in Java 5.0, support was added to switch statements to 
support enum values. 

In Java 7, switch statements were further updated to allow matching on String 
values. 
Finally, the switch statement also supports any of the primitive numeric wrapper 
classes, such as Byte, Short, Character, or Integer.

Data types supported by switch statements include the following:
■ int and Integer
■ byte and Byte
■ short and Short
■ char and Character
■ int and Integer
■ String
■ enum values
 */
public class Switch {

    public static void main(String[] args) {
        Switch s = new Switch();

        s.dayOfWeek(0); // 3 outputs
    }

    public void dayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;

        }
    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;
            /*
            case middleName: // DOES NOT COMPILE
                id = 5;
                break;
            */
            case suffix:
                id = 0;
                break;
            /*
            case lastName: // DOES NOT COMPILE
                id = 8;
                break;
            case 5: // DOES NOT COMPILE
                id = 7;
                break;
            case 'J': // DOES NOT COMPILE
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
                id = 15;
                break;
            */
        }
        return id;
    }
}
