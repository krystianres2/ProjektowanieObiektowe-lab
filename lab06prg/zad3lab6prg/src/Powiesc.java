public class Powiesc {
    String typologia;
    Ksiazka k;

    public Powiesc(String typologia, Ksiazka k) {
        this.typologia = typologia;
        this.k = k;
    }
    public void opis(){
        k.opis();

    }
}
