public abstract class Pokemon {
    private String name;
    private String type;
    private int level;
    private int hp;
    private String food;
    private String sound;


    public Pokemon() {
        this.name = "Unknown";
        this.type = "Unknown";
        this.level = 0;
        this.hp = 0;
        this.food = "Unknown";
        this.sound = "Unknown";

    }

    public Pokemon(String name, String type, int level, int hp, String food, String sound) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    public  abstract void eats();
    public  abstract void speaks();



}
