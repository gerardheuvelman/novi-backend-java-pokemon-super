public class Pikachu extends ElectricType {

    public Pikachu() {
        super();
        this.setName("Pikachu");
    }

    @Override
    public void eats() {
        System.out.println("I eat PokeBrox!");
    }

    @Override
    public void  speaks() {
        System.out.println("PIKACHU!");
    }
}
