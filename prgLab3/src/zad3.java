import java.util.Arrays;

public class zad3 extends zad1 {
    public static void function3(){
        double x=0;
        double y=0;
        double z=0;

        System.out.println("Podaj liczbe: ");
        x=zad1.ScanDouble();
        System.out.println("Podaj liczbe: ");
        y=zad1.ScanDouble();
        System.out.println("Podaj liczbe: ");
        z=zad1.ScanDouble();
        double[] tab=new double[3];
        tab[0]=x;
        tab[1]=y;
        tab[2]=z;
        Arrays.sort(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }


    }
}
