package project;
import java.util.*;
class Food {
    private String name;
    private int price;

    public Food(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public int getPrice() 
    {
        return price;
    }

    @Override
    public String toString() 
    {
        return "Name: " + name + ", Price: " + price;
    }
}

class FastFood extends Food 
{
    private String category;

    public FastFood(String name, int price, String category) 
    {
        super(name, price);
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Category: " + category;
    }
}

class HealthyFood extends Food 
{
    private String type;

    public HealthyFood(String name,int price, String type) 
    {
        super(name, price);
        this.type = type;
    }

    public String istype()
    {
        return type;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", type: " + type;
    }
}

class FoodManagementSystem 
{
    private List<Food> foodItems;

    public FoodManagementSystem()
    {
        foodItems = new ArrayList<>();
    }

    public void addFoodItem(Food food) 
    {
        foodItems.add(food);
    }

    public void displayFoodItems()
    
    {
    	System.out.println("\tWelcom To Meet and Eat Restaurant!!!");
        System.out.println("\t\tAvailable Food Items:");
        for (Food item : foodItems) 
        {
            System.out.println(item);
        }
    }
}

public class FoodManagement
{
    public static void main(String[] args) 
    {
        FoodManagementSystem foodSystem = new FoodManagementSystem();
       
        // Create some FastFood and HealthyFood items
        FastFood burger = new FastFood("Burger",79, "FastFood");
        FastFood pizza = new FastFood("Pizza", 100, "FastFood");
        FastFood Sandwitch = new FastFood("Sandwitch",65, "FastFood");
        FastFood Panipoori = new FastFood("Panipoori", 35, "FastFood");
        FastFood Shavarma = new FastFood("Shavarma",120, "FastFood");
        FastFood Grill = new FastFood("Grill",450, "FastFood");
        HealthyFood MusroomRice = new HealthyFood("MusroomRice",80,"veg");
        HealthyFood Meals = new HealthyFood("Meals", 110,"veg" );
        HealthyFood Biriyani= new HealthyFood("Biriyani",210,"Non-veg");
        HealthyFood ChickanRice = new HealthyFood("ChickanRice",120,"Non-veg" );
        HealthyFood Parotta = new HealthyFood("Parotta",50,"Non-veg" );
        HealthyFood ChickanNoodle= new HealthyFood("Chickan Noodle",150,"Non-veg");
        HealthyFood EggNoodle = new HealthyFood(" Egg Noodle",120,"Non-veg" );
        
        // Add food items to the system
        foodSystem.addFoodItem(burger);
        foodSystem.addFoodItem(pizza);
        foodSystem.addFoodItem(Sandwitch);
        foodSystem.addFoodItem(Panipoori);
        foodSystem.addFoodItem(Shavarma);
        foodSystem.addFoodItem(Grill);
        foodSystem.addFoodItem(MusroomRice);
        foodSystem.addFoodItem(Meals);
        foodSystem.addFoodItem(Biriyani);
        foodSystem.addFoodItem(ChickanRice);
        foodSystem.addFoodItem(Parotta);
        foodSystem.addFoodItem(ChickanNoodle);
        foodSystem.addFoodItem( EggNoodle);

        // Display all food items
        foodSystem.displayFoodItems();
    }
}


