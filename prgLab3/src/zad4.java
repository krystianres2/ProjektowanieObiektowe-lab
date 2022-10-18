import java.util.Scanner;

public class zad4 {
    public static void function4(){
        boolean descz;
        boolean autobus;
        String a,b;
        Scanner input=new Scanner(System.in);
        System.out.println("Czy pada deszcz: ");
        a= input.nextLine();
        System.out.println("Czy jest autobus: ");
        b= input.nextLine();
        if (a.equals("tak")){
            descz=true;
        }else {
            descz=false;
        }//if

        if (b.equals("tak")){
            autobus=true;
        }else {
            autobus=false;
        }//if
        //System.out.println(descz);
        //System.out.println(autobus);

        if (descz==true&&autobus==true){
            System.out.println("Wez parasol "+", "+"Dostaniesz sie na uczelnie");
        }
        if (descz==true&&autobus!=true){
            System.out.println("Nie dostaniesz sie na uczelnie");
        }
        if (descz!=true&&autobus==true){
            System.out.println("Dostaniesz sie na uczelnie"+", "+"Milego dnia i pieknej pogody");
        }
    }//function4



}
