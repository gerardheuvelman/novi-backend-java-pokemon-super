public class FireType extends Pokemon implements Fire {

    public FireType() {
        this.setType("Fire");
    }

    public FireType(String name) {
        this.setType("Fire");
        this.setName(name);
    }


    public FireType(String name, int level, int hp, String food, String sound) {
        super(name, "Fire", level, hp, food, sound);
    }

    @Override
    public void eats() {
        System.out.println("I eat fire");
    }

    @Override
    public void  speaks() {
        System.out.println("OUCH!");
    }

    public void inferno() {System.out.println("Inferno!"); }
    public void pyroBall() {System.out.println("Pyro Ball!");}
    public void fireLash() {System.out.println("Fire Lash!");}
    public void flameThrower() {System.out.println("Flame Thrower!");}
}
