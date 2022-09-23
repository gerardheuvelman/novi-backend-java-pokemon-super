public class ElectricType extends Pokemon implements Electric {

    public ElectricType() {
        this.setType("Electric");

    }

    public ElectricType(String name) {
        this.setType("Electric");
        this.setName(name);
    }


    public ElectricType(String name, int level, int hp, String food, String sound) {
        super(name,  "Electric", level, hp, food, sound);
    }

    @Override
    public void eats() {
        System.out.println("I eat Electricity");
    }

    @Override
    public void  speaks() {
        System.out.println("ZAP!");
    }

    public void thunder() {
        System.out.println("Thunder!");
    }
    public void thunderPunch() {
        System.out.println("Thunder Punch!");
    }
    public void electroBall() {
        System.out.println("Electro Ball!");
    }
    public void voltTackle() {
        System.out.println("Volt Tackle!");
    }
}
