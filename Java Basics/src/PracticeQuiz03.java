// This Quiz is from Conditional Statements learned about If-else , Switch statements and Ternary Operators

import java.util.Scanner;
import java.lang.String;
public class PracticeQuiz03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//    If else conditions
        int UserAge = scanner.nextInt();
        if(UserAge > 18){
            System.out.println("He is adult and can make decision by himself");
        } else if (UserAge > 11) {
            System.out.println(" I am teenage");

        } else {
            System.out.println("Ask parents assistance while making decision");
        }


//  Switch Cases
        String TrafficLight = scanner.nextLine();
        switch (TrafficLight){
            case "red":
                System.out.println("Shut down Engine and Stop");
                break;
            case "Yellow":
                System.out.println("Start your Engine");
                break;
            case "Green":
                System.out.println("Move your vehicle");
                break;
            default:
                System.out.println("System is not working,Move your vehicle");
        }

//  Ternary Operators
        boolean UserTrafficVilation = true;
        String Challan = (UserTrafficVilation)?"Challan is 500$":"Go to your way";
        System.out.println(Challan);
    }
}
