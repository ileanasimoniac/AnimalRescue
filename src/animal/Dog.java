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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        if (!(healthLevel < 1 || healthLevel > 10)) {
            this.healthLevel = healthLevel;
        }
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getSpiritLevel() {
        return spiritLevel;
    }

    public void setSpiritLevel(int spiritLevel) {
        if (spiritLevel < 1) {
            this.spiritLevel = 1;
        } else if (spiritLevel > 10) {
            this.spiritLevel = 10;
        } else {
            this.spiritLevel = spiritLevel;
        }
    }

    public String getFavouriteFood() {
        return favouriteFoodName;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFoodName = favouriteFood;
    }

    public String getFavouriteActivityName() {
        return favouriteActivityName;
    }

    public void setFavouriteActivityName(String favouriteActivityName) {
        this.favouriteActivityName = favouriteActivityName;
    }

}
