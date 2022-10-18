import java.util.Scanner;

public class zad5 {

    public static void function5(){
        String slowo=" ";
        String reversed=" ";

        Scanner input=new Scanner(System.in);
        System.out.println("Podaj slowo: ");
        slowo= input.nextLine();

        StringBuilder reverseString=new StringBuilder(slowo);
        reverseString.reverse();
        reversed=reverseString.toString();
        System.out.println("Reversed: "+ reversed);

        if (slowo.equals(reversed)){
            System.out.println("Podane slowo jest palindromem: ");
        }else{
            System.out.println("Podane slowo nie jest palindromem");
        }
    }



}
