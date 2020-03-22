import java.util.Scanner;

public class App {
    static boolean checkPrime(int number) {
        boolean status = true;
        for (int i = 2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                status = false;
                break;
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Prime want to print:");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count<number){
            if(checkPrime(n)){
                count++;
                System.out.print(n+" ");
            }
            n++;
        }

    }
}
