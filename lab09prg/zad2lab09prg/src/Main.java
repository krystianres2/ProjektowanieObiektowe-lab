import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[]args){

        Czlowiek c1=new Czlowiek("Jan","Kowalski",20);
        Czlowiek c2=new Czlowiek("Tomasz","Kowalski",20);
        Czlowiek c3=new Czlowiek("Piotr","Kowalski",20);
        Czlowiek c4=new Czlowiek("Mateusz","Kowalski",20);

        Czlowiek[] tab=new Czlowiek[]{c1,c2,c3,c4};
        ArrayList<Czlowiek> list= new ArrayList<>();
        Collections.addAll(list,tab);
        System.out.println("Sublist: "+ list.subList(1,3));
        list.subList(1,3).clear();

    }
}
