package core2web.Control_Statements.Basic_IfElse_Assignment;

public class Q_6 {
    public static void main(String[] args) {
        int a = 21;

        if((a % 3 == 0) && (a % 7 == 0)){
            System.out.println("Divisible by both 3 and 7");
        }else if(a % 3 == 0){
            System.out.println("Divisible by 3");
        }else if(a % 7 == 0){
            System.out.println("Divisible by 7");
        }else{
            System.out.println("Not divisible by any of them");
        }
    }
}
