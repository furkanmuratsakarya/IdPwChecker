import java.util.Scanner;

public class IdPwCheck{
    public static void main(String[] args){
        String id, pw;
        Scanner sc = new Scanner(System.in);

        System.out.print("Username:\t");
        id = sc.nextLine();
        System.out.print("Password:\t");
        pw = sc.nextLine();

        if(id.equals("patika") && pw.equals("java123"))
            System.out.println("Login Successful!");
        else System.out.println("Username or password incorrect!");
    }
}