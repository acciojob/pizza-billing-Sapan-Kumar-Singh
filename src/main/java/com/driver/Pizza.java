package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int vegBasePrice=300; // set veg price
    private int nonVegBasePrice=400; // set non-veg price
    private int basePrice; // set for base price
    private boolean cheeseAdded; // check cheese added or not

    private int extraCheesePrice=80;
    private int cheesePrice; // set extra cheese price
    private boolean toppingsAdded; // check toppings added or not
    private int extraVegToppingsPrice=70;
    private int extraNonVegToppingsPrice=120;
    private int toppingsPrice; //  set extra toppings price

    private int paperBag=20; // set price of paper bag
    private int paperBagPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        basePrice=isVeg ?vegBasePrice : nonVegBasePrice;
        this.price+=basePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseAdded==false){
            cheeseAdded=true;
            cheesePrice=extraCheesePrice;
            this.price=this.price+cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingsAdded==false){
            toppingsAdded=true;
            toppingsPrice= isVeg ? extraVegToppingsPrice : extraNonVegToppingsPrice;
           this.price=this.price+toppingsPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        paperBagPrice=paperBag;
        this.price=this.price+paperBagPrice;
    }

    public String getBill(){
        // your code goes here
        String temp="";
        temp=temp+"Base Price Of The Pizza:"+basePrice+"\n";
        temp=temp+"Extra Cheese Added:"+cheesePrice+"\n";
        temp=temp+"Extra Toppings Added:"+toppingsPrice+"\n";
        if(paperBagPrice>0){
            temp=temp+"Paperbag Added:"+paperBagPrice+"\n";
        }
        temp=temp+"Total Price:"+price;
         this.bill=temp;
        return this.bill;
    }
}
