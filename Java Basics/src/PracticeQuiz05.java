public class PracticeQuiz05 {
    public static void main(String[] args) {
        int n = 4;
        int m =3;
        for (int i=1 ;i<=n; i++ ){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            };
            for (int j=1; j<=n; j++){
                System.out.print("*");
            };

            System.out.println();
        }
         for (int i = 1; i<=n; i++){
             for (int j=1; j<=i; j++){
                 System.out.print("*");
             }
             for (int j=1;j<=n;j++){
                 System.out.print("*");
             }
             System.out.println();
         }

    }
}
