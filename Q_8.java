package core2web.Control_Statements.Basic_IfElse_Assignment;

public class Q_8 {
    public static void main(String[] args) {
        int a = 20;

        if((a % 2 == 0) && (a % 5 == 0) && (a % 10 == 0)){
            System.out.println("Divisible by 2, 5 and 10");
        }else if(a % 2 == 0){
            System.out.println("Divisible by 2");
        }else if(a % 5 == 0){
            System.out.println("Divisible by 5");
        }else if(a % 10 == 0){
            System.out.println("Divisible by 10");
        }else{
            System.out.println("Not divisible by 2, 5, and 10");
        }
    }
}
