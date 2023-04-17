package com.driver;

public class Pizza {

    private int price; // final price

    private Boolean isVeg;
    private String bill;

    private int basePrice;
    private int vegBasePrice=300;
    private int nonVegBasePrice=400;
    private Boolean isCheeseAdded;
    private int cheesePrice=80; // set cheese price

    private Boolean isToppingsAdded;

    private int vegToppingsPrice=70; // set veg topping price
    private int nonVegToppingsPrice=120; // set non-veg topping price
    private int toppingPrice;// store veg or non veg topping price
    private Boolean isTakeWay;
    private int takeWayPrice=20;
    public Pizza(Boolean isVeg){
         this.isVeg=isVeg;
         basePrice= getBasePrice();
         price=basePrice;
         isCheeseAdded=false;
         isToppingsAdded=false;
         isTakeWay=false;
        // your code goes here
    }
     private int getBasePrice(){
        return isVeg ? vegBasePrice : nonVegBasePrice;
     }
    public int getPrice(){
        return this.price;
    }
    private int getToppingPrice(){
        return  isVeg ?vegToppingsPrice : nonVegToppingsPrice;
    }
    public void addExtraCheese(){
        // your code goes here
          if(!isCheeseAdded){
              isCheeseAdded=true;
              price+=cheesePrice;
          }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            isToppingsAdded=true;
            toppingPrice+= getToppingPrice();
            price+=toppingPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
          if(!isTakeWay){
              isTakeWay=true;
              price+=takeWayPrice;
          }
    }

    public String getBill(){
        // your code goes here
        String temp="";
        temp+="Base Price Of The Pizza:"+basePrice+"\n";
        if(isCheeseAdded){
            temp+="Extra Cheese Added:"+cheesePrice+"\n";
        }
        if(isToppingsAdded){
            temp+="Extra Toppings Added:"+toppingPrice+"\n";
        }
        if(isTakeWay){
            temp+="Paperbag Added:"+takeWayPrice+"\n";
        }
        temp+="Total Price:"+price+"\n";
        this.bill=temp;
        return this.bill;
    }
}
