package animal;

public class Main {
    public static void main(String[] args) {
        Animal animal;
        animal = new Animal("Pisica");
        printAnimal(animal);

        AnimalAdopter animalAdopter;
        animalAdopter = new AnimalAdopter("Ileana", 200);
        printAnimalAdopter(animalAdopter);

        AnimalFood animalFood;
        animalFood  = new AnimalFood("Lapte", 12, 10);
        printAnimalFood(animalFood);

        Activity activity;
        activity = new Activity("Joaca");
        printActivity(activity);

        Veterinarian veterinarian;
        veterinarian = new Veterinarian("Popescu Emil", "cardiologie");
        printVeterinarian(veterinarian);
    }

    private static void printAnimal(Animal animal) {
        System.out.println("Animal");
        System.out.println("Nume: " + animal.getName());
        System.out.println("Varsta: " + animal.getAge());
        System.out.println("Nivel sanatate: " + animal.getHealthLevel());
        System.out.println("Nivel senzatie foame: " + animal.getHungerLevel());
        System.out.println("Nivel stare de spirit: " + animal.getSpiritLevel());
        System.out.println("Mancare favorita: " + animal.getFavouriteFood());
        System.out.println("Activitate favorita: " + animal.getFavouriteActivityName());
    }

    private static void printAnimalAdopter(AnimalAdopter animalAdopter) {
        System.out.println("");
        System.out.println("Animal Adopter");
        System.out.println("Nume: " + animalAdopter.getName());
        System.out.println("Suma de bani disponibila: " + animalAdopter.getAvailableAmount());
    }

    private static void printAnimalFood(AnimalFood animalFood) {
        System.out.println("");
        System.out.println("Animal Food");
        System.out.println("Nume: " + animalFood.getName());
        System.out.println("Pret: " + animalFood.getPrice());
        System.out.println("Cantitate: " + animalFood.getQuantity());
        System.out.println("Stoc: " + animalFood.getStock());
    }

    private static void printActivity(Activity activity) {
        System.out.println("");
        System.out.println("Activitate");
        System.out.println("Nume: " + activity.getName());
    }

    private static void printVeterinarian(Veterinarian veterinarian) {
        System.out.println("");
        System.out.println("Veterinar");
        System.out.println("Nume: " + veterinarian.getName());
        System.out.println("Specializare: " + veterinarian.getSpeciality());
    }
}
