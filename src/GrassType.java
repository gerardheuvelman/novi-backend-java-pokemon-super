public class GrassType extends Pokemon implements Grass {

    public GrassType() {
        this.setType("Grass");

    }

    public GrassType(String name) {
        this.setType("Grass");
        this.setName(name);
    }


    public GrassType(String name, int level, int hp, String food, String sound) {
        super(name, "Grass", level, hp, food, sound);
    }

    @Override
    public void eats() {
        System.out.println("I eat grass");
    }

    @Override
    public void  speaks() {
        System.out.println("I AM SOOO BAKED RIGHT NOW! :-)");
    }

    public void solarBeam() {System.out.println("Solar Beam!");}
    public void leafStorm() {System.out.println("Leaf Storm!");}
    public void leechSeed() {System.out.println("Leech Seed!");}
    public void leafBlade() {System.out.println("Leaf Blade!");}
}
