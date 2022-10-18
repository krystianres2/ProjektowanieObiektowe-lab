public class zad2 {
    public static void function2a(){
        double x=0;
        double a=0;
        System.out.println("Podaj argument funkcji: ");
        x=zad1.ScanDouble();
        if (x>0){
            a=2*x;
        }
        if (x==0){
            a=0;
        }
        if (x<0){
            x=-(3*x);
        }
        System.out.println("a(x)= "+a);
    }

    public static void function2b(){
        double x=0;
        double b=0;
        System.out.println("Podaj argument funkcji: ");
        x=zad1.ScanDouble();
        if (x>=1){
            b=x*x;
        }
        if (x<1){
            b=x;
        }
        System.out.println("b(x)= "+b);
    }
    public static void function2c(){
        double x=0;
        double c=0;
        System.out.println("Podaj argument funkcji: ");
        x=zad1.ScanDouble();
        if (x>2){
            c=2+x;
        }
        if (x==2){
            c=8;
        }
        if (x<2){
            c=x-4;
        }
        System.out.println("c(x)= "+c);
    }


}
