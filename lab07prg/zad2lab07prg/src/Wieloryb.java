public class Wieloryb extends Zwierze implements Plywanie {
    @Override
    public void plyn() {
        System.out.println("Plyne");
    }

    @Override
    public void wynurz() {
        System.out.println("Wynurzam sie");
    }

    @Override
    public void zanurz() {
        System.out.println("Zanurzam sie");
    }
}
