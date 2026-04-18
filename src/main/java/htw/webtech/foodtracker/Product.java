package htw.webtech.foodtracker;

public class Product {
    private int id;
    private String name;
    private int calories;
    private double protein;
    private double carbs;

    // Konstruktor
    public Product(int id, String name, int calories,
                   double protein, double carbs) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public int getCalories() {
        return calories;
    }

    public double getProtein() {
        return protein;
    }

    public double getCarbs() {
        return carbs;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }
}