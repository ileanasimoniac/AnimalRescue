package animal;

public class Dog extends Animal {
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int spiritLevel;
    private String favouriteFoodName;
    private String favouriteActivityName;

    public Dog(String name) {
        super(name);
        this.name = name;
        this.healthLevel = 5;
        this.hungerLevel = 5;
        this.spiritLevel = 5;
        this.favouriteFoodName = "lapte";
        this.favouriteActivityName = "joaca";
    }



    public void setSpiritLevel(int spiritLevel) {
        if (spiritLevel < 1) {
            this.spiritLevel = 5;
        } else if (spiritLevel > 10) {
            this.spiritLevel = 15;
        } else {
            this.spiritLevel = spiritLevel;
        }
    }

}
