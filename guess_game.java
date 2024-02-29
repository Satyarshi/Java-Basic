import java.util.Scanner;
public class guess_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 250;
        int count=0,guess;
        boolean flag = true;
        while(flag){
            System.out.println("Guess the no.");
            guess = sc.nextInt();
            count++;
            if(guess<secret){
                System.out.println("Think of higher no.");
            }
            else if (guess>secret) {
                System.out.println("Think of lower no.");   
            }
            else{
                System.out.println("You got the no. in "+count+" attempt");
                flag = false;
            }
        }
        sc.close();
    }
}
