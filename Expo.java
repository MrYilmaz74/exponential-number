import java.util.Scanner;
public class Expo {
    public static void main(String[] args) {
        int n,k;
        double total=1;

        Scanner scan=new Scanner(System.in);
        System.out.println("Number to be exponent: ");
        n=scan.nextInt();
        System.out.println("Above value");
        k=scan.nextInt();

        for (int i=1; i<=k; i++){
            total*=n;
        }

        System.out.println("Result : " + total);
    }
}
