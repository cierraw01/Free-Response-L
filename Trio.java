// Complete the Trio class per instructions
public class Trio{
  private Sandwich sandwich;
  private Salad salad;
  private Drink drink;
  
  public Trio(Sandwich sandwich, Salad salad, Drink drink){
    this.sandwich = sandwich;
    this.salad = salad;
    this.drink = drink;
  }
  
  public double getPrice(){
    double exclude = Math.min(sandwich.getPrice(), salad.getPrice());
    exclude = Math.min(exclude, drink.getPrice());
    double price = sandwich.getPrice() + salad.getPrice() + drink.getPrice() - exclude;
    return price;
  }
  
  public String getName(){
    String name = sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    return name;
  }
}
