public class WaterType extends Pokemon implements Water {

    public WaterType() {

        this.setType("Water");

    }

    public WaterType(String name) {
        this.setType("Water");
        this.setName(name);
    }


    public WaterType(String name, int level, int hp, String food, String sound) {
        super(name, "Water", level, hp, food, sound);
    }

    @Override
    public void eats() {
        System.out.println("I drink water");
    }

    @Override
    public void  speaks() {
        System.out.println("SPLASH!");
    }

    public void surf() {System.out.println("Surf!");}
    public void hydroPump() {System.out.println("Hydro Pump!");}
    public void hydroCanon() {System.out.println("Hydro Cannon!");}
    public void rainDance() {System.out.println("Rain Dance!");}
}
