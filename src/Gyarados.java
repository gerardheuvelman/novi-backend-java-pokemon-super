public class Gyarados  extends WaterType implements Flying {

    public Gyarados() {
        super();
        this.setName("Gyarados");
    }

    @Override
    public void eats() {
        System.out.println("Gyarados eats PokeBrox!");
    }

    @Override
    public void  speaks() {
        System.out.println("GAYARADOS!");
    }

    public void fly() {
        System.out.println("Gyarados is Flying!");
    }
}
