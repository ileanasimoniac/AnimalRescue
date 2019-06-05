package animal;

public class AnimalAdopter {
    private String name;
    private double availableAmount;

    public AnimalAdopter(String name, double availableAmount) {
        this.name = name;
        this.availableAmount = availableAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(double availableAmount) {
        this.availableAmount = availableAmount;
    }
}
