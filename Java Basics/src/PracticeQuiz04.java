import java.util.Scanner;
import java.lang.String;
public class PracticeQuiz04 {
    public static void main(String[] args) {
        for (int i=1 ;i<=10 ; i++){
            System.out.println(i);
        }
        int optainedMarks = 44;
        while (optainedMarks > 35){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name!");
            String StudentName = scanner.nextLine();
            System.out.println("Which Degree program you want?");
            String Course = scanner.nextLine();
            System.out.println("Mr. "+StudentName + "Your Admission is Confirmed in "+ Course);

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Marks");
        int Marks = scanner.nextInt();
        do {
            System.out.println("Enter your name!");
            String StudentName = scanner.nextLine();
            System.out.println("Which Degree program you want?");
            String Course = scanner.nextLine();
            System.out.println("Mr. "+StudentName + "Your Admission is Confirmed in "+ Course);
        }while (Marks > 35);

    }
}
