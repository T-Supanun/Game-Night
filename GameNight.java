/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6Assign;
import java.util.Random;
/**
 *
 * @author supanuntinbaanmai
 */
public class GameNight 
{
    public static void main(String[] args)
    {
        Display();
        RandomCard();
    }
    
    static void Display()
    {
        System.out.println("Let's play Doremon!");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Rules");
        System.out.println("-Do not be AGGRESSIVE!-");
        System.out.println("-Do not ask any questions-");
        System.out.println("-Do not point your finger-");
        System.out.println("-Do not hold the alcohol with the right hand-");
        System.out.println("-Do not hold the cigaratte with the left hand-");
        System.out.println("-Everyone cannot go to the toilet during the game-");
        System.out.println();
        System.out.println("*IF YOU BREAK THE RULES, TAKE ONE SHOT*");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Random Card");
        System.out.println("----------------------------------------------------------------------------------------");
    }
    
    static void RandomCard()
    {
        
        String[] rank = {"A Club", "1 Daimond", "1 Heart", "1 Spade", 
                         "2 Club", "2 Daimond", "2 Heart", "2 Spade",
                         "3 Club", "3 Daimond", "3 Heart", "3 Spade",
                         "4 Club", "4 Daimond", "4 Heart", "4 Spade",
                         "5 Club", "5 Daimond", "5 Heart", "5 Spade",
                         "6 Club", "6 Daimond", "6 Heart", "6 Spade",
                         "7 Club", "7 Daimond", "7 Heart", "7 Spade",
                         "8 Club", "8 Daimond", "8 Heart", "8 Spade",
                         "9 Club", "9 Daimond", "9 Heart", "9 Spade",
                         "10 Club", "10 Daimond", "10 Heart", "10 Spade",
                         "J Club", "J Daimond", "J Heart", "J Spade",
                         "Q Club", "Q Daimond", "Q Heart", "Q Spade",
                         "K Club", "K Daimond", "K Heart", "K Spade",};
        
        Random rand = new Random();
        int X = rand.nextInt(rank.length);
        
        System.out.println("Your card is: " + rank[X]);
        
        int Y = 0;
        
        if(X <=3)
        {
            Y = 0;
        }
        
        if(X > 3 && X <= 7)
        {
            Y = 1;
        }
        
        if(X > 7 && X <= 11)
        {
            Y = 2;
        }
        
        if(X > 11 && X <= 15)
        {
            Y = 3;
        }
        
        if(X > 15 && X <= 19)
        {
            Y = 4;
        }
        
        if(X > 19 && X <= 23)
        {
            Y = 5;
        }
        
        if(X > 23 && X <= 27)
        {
            Y = 6;
        }
        
        if(X > 27 && X <= 31)
        {
            Y = 7;
        }
        
        if(X > 31 && X <= 35)
        {
            Y = 8;
        }
        
        if(X > 35 && X <= 39)
        {
            Y = 9;
        }
        
        if(X > 39 && X <= 43)
        {
            Y = 10;
        }
        
        if(X > 43 && X <= 47)
        {
            Y = 11;
        }
        
        if(X > 47 && X <= 51)
        {
            Y = 12;
        }
    
        switch(Y)
        {
            case 0 : System.out.println("Takes one shot");
                    break;
            case 1 : System.out.println("Takes two shots");
                    break;
            case 2 : System.out.println("Takes three shots");
                    break;
            case 3 : System.out.println("Takes four shots");
                    break;
            case 4 : System.out.println("Chooses your Buddy");
                    break;
            case 5 : System.out.println("Play Category");
                    break;
            case 6 : System.out.println("Count the number without the number which is end with 7 and divisible by 7");
                    break;
            case 7 : System.out.println("Break for toilet");
                    break;
            case 8 : System.out.println("The one on the left takes one shot");
                    break;
            case 9 : System.out.println("The one on the right takes one shot");
                    break;
            case 10 : System.out.println("Touch your chin whenever you want");
                    break;
            case 11 : System.out.println("Do not talk with this person!");
                    break;
            case 12 : System.out.println("Order someone to do something...");
                    break;
        }
    }         
}    
