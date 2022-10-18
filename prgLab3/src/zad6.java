import java.util.Scanner;

public class zad6 {
    public static void function6(){
        int a,b,wyb=0;
        Scanner scanner=new Scanner(System.in);


        while(wyb!=6) {
            System.out.println("1. dodaj");
            System.out.println("2. odejmij");
            System.out.println("3. pomnoz");
            System.out.println("4. podziel");
            System.out.println("5. reszta z dzielenia");
            System.out.println("6. wyjdz");

            System.out.println("Co chesz zrobic: ");
            wyb= scanner.nextInt();

            switch (wyb) {
                case 1:
                    System.out.println("Podaj liczbe a: ");
                    a= scanner.nextInt();
                    System.out.println("Podaj liczbe b: ");
                    b= scanner.nextInt();
                    System.out.printf("Wynik: ");
                    System.out.println(a + b);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Podaj liczbe a: ");
                    a= scanner.nextInt();
                    System.out.println("Podaj liczbe b: ");
                    b= scanner.nextInt();
                    System.out.printf("Wynik: ");
                    System.out.println(a - b);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Podaj liczbe a: ");
                    a= scanner.nextInt();
                    System.out.println("Podaj liczbe b: ");
                    b= scanner.nextInt();
                    System.out.printf("Wynik: ");
                    System.out.println(a * b);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Podaj liczbe a: ");
                    a= scanner.nextInt();
                    System.out.println("Podaj liczbe b: ");
                    b= scanner.nextInt();
                    if (b==0){
                        System.out.println("Nie mozna dzielic przez 0 ");
                    }else{
                        System.out.printf("Wynik: ");
                    System.out.println(a / b);}
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Podaj liczbe a: ");
                    a= scanner.nextInt();
                    System.out.println("Podaj liczbe b: ");
                    b= scanner.nextInt();
                    if (b==0){
                        System.out.println("Nie mozna dzielic przez 0 ");
                    }else{
                        System.out.printf("Wynik: ");
                        System.out.println(a%b);}
                    System.out.println();
                    break;
            }
        }//while
    }

}
