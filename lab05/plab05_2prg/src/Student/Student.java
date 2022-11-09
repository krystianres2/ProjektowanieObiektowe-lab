package Student;

import java.util.Scanner;

public class Student {
    String imie="";
    String nazwisko="";
    int nr_indeksu=0;
    String nazwaSpecjalnosci="";
    int rokStudiow=0;
    static Student[] tab=new Student[100];

    public static void ob(){
        for (int i = 0; i <100; i++) {
            tab[i]=new Student();
        }
    }//ob

    public static void addData(int i){
        Scanner input=new Scanner(System.in);
        tab[i].imie= input.nextLine();
        tab[i].nazwisko= input.nextLine();
        tab[i].nr_indeksu= input.nextInt();
        tab[i].nazwaSpecjalnosci= input.nextLine();
        tab[i].rokStudiow= input.nextInt();
    }
    public static void editData(int i){
        Scanner input=new Scanner(System.in);
        tab[i].imie= input.nextLine();
        tab[i].nazwisko= input.nextLine();
        tab[i].nr_indeksu= input.nextInt();
        tab[i].nazwaSpecjalnosci= input.nextLine();
        tab[i].rokStudiow= input.nextInt();
    }
    public static void deleteData(int i){
        tab[i].imie="" ;
        tab[i].nazwisko="";
        tab[i].nr_indeksu=0;
        tab[i].nazwaSpecjalnosci="";
        tab[i].rokStudiow=0;
    }
    public static void showOne(int i){
        System.out.println(tab[i].imie);
        System.out.println(tab[i].nazwisko);
        System.out.println(tab[i].nr_indeksu);
        System.out.println(tab[i].nazwaSpecjalnosci);
        System.out.println(tab[i].rokStudiow);
    }
    public static void showAll(){
        for (int i = 0; i < 100; i++) {
            System.out.println(tab[i].imie);
            System.out.println(tab[i].nazwisko);
            System.out.println(tab[i].nr_indeksu);
            System.out.println(tab[i].nazwaSpecjalnosci);
            System.out.println(tab[i].rokStudiow);
        }
    }//showAll

    public static void showRange(int min, int max){
        for (int i=min;i<=max;i++){
            System.out.println(tab[i].imie);
            System.out.println(tab[i].nazwisko);
            System.out.println(tab[i].nr_indeksu);
            System.out.println(tab[i].nazwaSpecjalnosci);
            System.out.println(tab[i].rokStudiow);
        }
    }//showRange

}
