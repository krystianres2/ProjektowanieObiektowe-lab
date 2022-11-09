public class Student {
    //zad2
    String imie;
    String nazwisko;
    int nr_indeksu;
    String nazwaSpecjalnosci;
    int rokStudiow;

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public Student(String nazwaSpecjalnosci) {
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
    }

    public Student(String nazwaSpecjalnosci, int rokStudiow) {
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
        this.rokStudiow = rokStudiow;
    }
    public void display(){
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Nr indeksu: "+nr_indeksu);
        System.out.println("Nazwa specjalnosci: "+nazwaSpecjalnosci);
        System.out.println("Rok studiow: "+rokStudiow);
    }
}
