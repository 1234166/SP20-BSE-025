

package lab7_oop;


public class Pizza{
  private String Pizzasize;
    private int cheesequantity;
    private int pepperoniquantity;
    private int hamquantity;
    public Pizza(){
        Pizzasize = "";
        cheesequantity = 0;
        pepperoniquantity = 0;
        hamquantity = 0;
    }
    public Pizza(String Pizzasize,int cheesequantity, int pepperoniquantity, int hamquantity){
        this.Pizzasize = Pizzasize;
       this.cheesequantity = cheesequantity;
        this.pepperoniquantity = pepperoniquantity;
        this.hamquantity = hamquantity;
    }
    public String getPizzasize(){
        return Pizzasize;
    }
    public void setPizzaSize(String Pizzasize){
       Pizzasize = Pizzasize;
    }
    public int getNumcheeseToppings(){
        return cheesequantity;
    }
    public void setNumcheeseToppings(int cheesequntity){
     cheesequantity = cheesequantity;
    }
     public int getNumpepperoniToppings(){
        return pepperoniquantity;
    }
     public void setNumpepperoniToppings(int pepperoniquantity){
         pepperoniquantity = pepperoniquantity;
     }
      public int getNumhamToppings(){
        return hamquantity;
      }
       public void setNumhamToppings(int hamquntity){
      hamquantity = hamquantity;
       }
       public double calcCost(){
           if(Pizzasize.equalsIgnoreCase("Small")){
           return 10 + (cheesequantity + pepperoniquantity + hamquantity)*2;
       }
           else if(Pizzasize.equalsIgnoreCase("Medium")){
               return 12 + (cheesequantity + pepperoniquantity + hamquantity)*2;
       }
           else if(Pizzasize.equalsIgnoreCase("Large")){
               return 14 + (cheesequantity + pepperoniquantity + hamquantity)*2;
           }
           else{
               return 0.0;
           }
}
       

    String getDescription() {
       return "Pizza size: " + Pizzasize + "\n Cheese toppings: " 
				+ cheesequantity + "\n Pepperoni toppings: "
				+ pepperoniquantity + "\n Ham toppings: " + hamquantity
				+ "\n Pizza cost: $" + calcCost() + "\n";
    }
    
    
}
