import java.util.Scanner;
public class multidimesnional_array {
    static void check(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        if(r!=c){
            System.out.println("Not an identity matrix");
            return;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j&&arr[i][j]!=1){
                    System.out.println("Not an identity matrix");
                    return;
                }
                else if(i!=j && arr[i][j]!=0){
                    System.out.println("Not an identity matrix");
                    return;
                }
            }
        }
        System.out.println("It is an identity matrix");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[][]= new int [3][3];
        System.out.println(num.length);
        System.out.println(num[0].length);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                num[i][j] = sc.nextInt();
            }
        }
        check(num);
        sc.close();
    }
}

// Matrix Multiplication
