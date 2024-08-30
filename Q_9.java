package core2web.Control_Statements.Basic_IfElse_Assignment;

public class Q_9 {
    public static void main(String[] args) {
        int num = 3;
        
        switch(num){
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thursday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;

            default:
            System.out.println("Day number must be between 1 to 7");
        }
    }
}
