import java.util.ArrayList;
// import java.util.Collections;
import java.util.Scanner;
public class array {
    static ArrayList<Integer> evenList(ArrayList<Integer> arr){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            int x = arr.get(i);
            if(x%2==0){
                result.add(x);
            }
        }
        return result;
    }
    static void frequency(ArrayList<Integer> arr){
        ArrayList<Integer> frequency_count = new ArrayList<>(arr.size());
        for(int i=0;i<arr.size();i++){
            int count=0;
            int x = arr.get(i);
            for(int j=0;j<arr.size();j++){
                if(x==arr.get(j)){
                    count++;
                }
            }
            frequency_count.add(count);
        }
        for(int i=0;i<arr.size();i++){
            System.out.print(frequency_count.get(i));
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int numbers[] = new int[10];  or int []numbers = new int[10];

        //***********************************************************************************************************************************


        // Q-> find unique no. program


        // int []numbers = {3,3,3,4,5,6,6,8,9,9,10,10,11};
        // Arrays.sort(numbers);
        // for(int i=0;i<numbers.length;){
        //     int j=i;
        //     int count=1;
        //     while(j<numbers.length-1&&numbers[j]==numbers[j+1]){
        //         j++;
        //         count++;
        //     }
        //     if(count==1){
        //         System.out.println("unique no. is "+numbers[i]);
        //     }
        //     i=i+count;
        // }

        //***********************************************************************************************************************************

        // Q -> given an array return an array containing items with relative frequency

        int n;
        System.out.println("Enter size of array");
        n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            arr.add(x);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i));
            System.out.print(" ");
        }
        System.out.println();
        frequency(arr);

        //***********************************************************************************************************************************

        // Q -> return (i,j) if i+j = target

        // int numbers[]={2,3,5,9,7};
        // int target = 5;
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             System.out.println(i);
        //             System.out.println(j);
        //             break;
        //         }
        //     }
        // }


        //***********************************************************************************************************************************


        // Dynamic array in java :- Syntax :- ArrayList<Integer> arr = new ArrayList<Integer>();

        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // System.out.println(arr.size());
        // arr.add(5);
        // arr.add(7);
        // // System.out.println(arr[1]); -> it will give error
        // System.out.println(arr.get(1));
        // arr.add(10);
        // // arr[2]=100; -> it will give error
        // arr.set(2, 100);
        // System.out.println(arr.get(2));
        // System.out.println(arr);


        //***********************************************************************************************************************************


        // Q-> sort array list in descending order

        // ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(5);
        // numbers.add(2);
        // numbers.add(8);
        // numbers.add(1);

        // Collections.sort(numbers, Collections.reverseOrder());

        // System.out.println("Sorted ArrayList in descending order: " + numbers);

        //***********************************************************************************************************************************

        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(5);
        // arr.add(10);
        // arr.add(6);
        // ArrayList<Integer> result = evenList(arr);
        // System.out.println(result);
        sc.close();
    }
}
