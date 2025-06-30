// This quiz is from reading input and handling output from the input
// and quick practice of Scanner class and its method used to take inputs

import java.util.Scanner;
import java.lang.String;
public class PracticeQuiz02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String UserEmail = scanner.nextLine();
        String UserPassword = scanner.nextLine();
        boolean ForgetPassword = scanner.hasNextBoolean();
        System.out.println(UserEmail.endsWith("m"));
        if(ForgetPassword){
            System.out.println("Password for "+ UserEmail + " is " + UserPassword);
        }
    }
}




