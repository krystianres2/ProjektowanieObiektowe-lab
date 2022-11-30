import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[]args){

        ArrayList<Uczestnik> list =new ArrayList<Uczestnik>();
        LinkedList<Uczestnik> list2=new LinkedList<Uczestnik>();
        Uczestnik u1=new Uczestnik(1,"Jan",19);
        Uczestnik u2=new Uczestnik(2,"Piotr",16);
        Uczestnik u3=new Uczestnik(3,"Tomasz",29);
        Uczestnik u4=new Uczestnik(4,"Cyspin",20);

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);

        list2.add(u1);
        list2.add(u2);
        list2.add(u3);
        list2.add(u4);

        Uczestnik.show(u1);




    }
}
