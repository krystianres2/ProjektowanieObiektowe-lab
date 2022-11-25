public abstract class Ryba implements Plywanie {
    void jedz(){
        System.out.println("Jem");
    }
    void wydalaj(){
        System.out.println("Wydalam");
    }

    @Override
    public void plyn() {
        System.out.println("plyne");
    }
}
