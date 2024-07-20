/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pizzaland;

/**
 *
 * @author litho
 */

    import java.util.Scanner;


public class PizzaLand {

    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("welcome to pizza app");
        System.out.println("choose from the following pizza sizes");
        System.out.println("menu");
        System.out.println("1.Large(R150.00)");
        System.out.println("2.Medium(R80.00)");
        System.out.println("3.Small(R30.00)");
        
        System.out.println("enter the choice(1-3):");
        int choice= scanner.nextInt();
         int price=0;
         
         if(choice==1){
             
             price+=150;
         }
         else if(choice==2){
             price+=80;
         }
             else{
                 price+=30;
         
    }
    
         System.out.println("choose from the following toppings");
        System.out.println("menu");
        System.out.println("1 toppings(R10)");
        System.out.println("2 toppings (R25)");
        System.out.println("3 toppings(R40)");
       
        System.out.println("enter the toppings(1-3):");
        int toppings= scanner.nextInt();
        if(toppings==1){
            price+=10;
        }
            else if(toppings==2){
               price+=25;
            }
               else{
                price+=40;
                 
               }     
     System.out.println("Delivery or no delivery");
     System.out.println("menu");
     System.out.println("1 Delivery (R30)");
     System.out.println("2 no delivery (R0)");
        int delivery= scanner.nextInt();
        if(delivery==1){
            price+=30;
        }
          
        else{
        price+=0;
                    }
      
       System.out.print(price) ;  
    
    }
            
        }
       
    
   
