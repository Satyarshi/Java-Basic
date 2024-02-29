import java.util.Scanner;
public class even_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.");
        int n = sc.nextInt();
        int f=0,l;
        l = n%10;
        while(n!=0){
            f=n%10;
            n=n/10;
        }
        System.out.println(f);
        System.out.println(l);
        sc.close();
    }
}
