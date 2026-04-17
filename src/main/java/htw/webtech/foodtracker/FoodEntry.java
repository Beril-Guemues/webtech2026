package htw.webtech.foodtracker;

public class FoodEntry {

    private String foodName;
    private int calories;
    private double quantity;
    private String userName;

    public FoodEntry(String foodName, int calories, double quantity, String userName) {
        this.foodName = foodName;
        this.calories = calories;
        this.quantity = quantity;
        this.userName = userName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}