public class Ksiazka extends Ksiegarnia{
    String autor;
    int rokWydania;
    int iloscStron;

    public Ksiazka(String autor, int rokWydania, int iloscStron) {
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.iloscStron = iloscStron;
        iloscKsiazek++;
    }
    public void opis(){
        System.out.println("Autor: "+ autor);
        System.out.println("Rok wydania: "+ rokWydania);
        System.out.println("Ilosc stron: "+iloscStron);
    }

    @Override
    public void Opis() {
        super.Opis();
        System.out.println("Autor: "+ autor);
        System.out.println("Rok wydania: "+ rokWydania);
        System.out.println("Ilosc stron: "+iloscStron);
    }
}
