import java.util.Scanner;

public class Days69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        int K = input.nextInt();

        
        if (N < 1 || M < 1 || K < 1) {
            System.out.println("Input tidak valid");
            return;
        }

        int totalBerhenti = 0;

        System.out.print("Halte : ");

        for (int i = 1; i <= N; i++) {

        
            if (i % 7 == 0) {
                continue;
            }

            
            if (i % M != 0) {
                continue;
            }

           
            System.out.print(i + " ");
            totalBerhenti++;
            
          
            if (totalBerhenti == K) {
                break;
            }
        }


        if (totalBerhenti == 0) {
            System.out.print("Tidak ada");
        }

        System.out.println();
        System.out.println("Total berhenti : " + totalBerhenti);

        input.close();
    }
}
