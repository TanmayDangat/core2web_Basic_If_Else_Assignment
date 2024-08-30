package core2web.Control_Statements.Basic_IfElse_Assignment;

public class Q_4 {
    public static void main(String[] args) {
        char ch = 'a';

        if((ch >= 65) && (ch <= 90)){
            System.out.println("The given character is UPPERCASE character");
        }else if((ch >= 97) && (ch <= 122)){
            System.out.println("The given character is LOWERCASE character");
        }else{
            System.out.println("You have entered wrong number");
        }
    }
}
