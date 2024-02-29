import java.util.Scanner;
public class string {
    static char[] toggle(String name){
        char[] newname = name.toCharArray();
        for(int i=0;i<newname.length;i++){
            char ch = newname[i];
            if(ch>='A'&&ch<='Z'){
                newname[i] = (char)(ch+32);
            }
            else{
                newname[i] = (char)(ch-32);
            }
        }
        return newname;
    }
    static void checkPallindrome(String name){
        int i = 0;
        int j = name.length()-1;
        while(i<j){
            if(name.charAt(i)!=name.charAt(j)){
                System.out.println("Not a pallindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("It is a pallindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String country = "India";
        // char[] arr = country.toCharArray();
        // for(int i=0;i<country.length();i++){
        //     System.out.println(country.charAt(i));
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }



        // Q  -> convert upper to lower and vice verse

        // Ascii value
        // A - 65
        // a - 97
        // 97-65 = 32
        // B + 32 = b
        // 0 - 48
        // 9 - 57


        // String name;
        // System.out.println("Enter any string");
        // name = sc.nextLine();
        // System.out.println(name);
        // char []newname = toggle(name);
        // System.out.println(newname);



        // Q -> check if the string is pallindrome or not


        String name;
        System.out.println("Enter any string");
        name = sc.nextLine();
        checkPallindrome(name);
        sc.close();
    }
}



// Q -> check string functions