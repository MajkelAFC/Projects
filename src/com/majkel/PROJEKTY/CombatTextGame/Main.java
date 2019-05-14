package com.majkel.PROJEKTY.CombatTextGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //System objects
    private static Scanner in = new Scanner(System.in);
     private static Random rand = new Random();

    //Game variables
   private static String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
    private static int maxEnemyHealth = 75;
    private static int enemyAttackDamage = 25;
    private static int damageTaken;

    //Player variables
    private static int health = 100;
    private static int attackDamage = 50;
    private static int numHealthPotions = 3;
    private static int healthPotionHealAmount = 30;
    private static int healthPotionDropChance = 50; //Percentage
    private static int damageDealt;

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("Welcome to the Dungeon!");

        GAME:
        while(running){
            System.out.println("-----------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t # " + enemy + " has appeared! #\n");

            while (enemyHealth >0){
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\t What would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");

                String input = in.nextLine();
                if(input.equals("1")){

                    damageDealt = rand.nextInt(attackDamage);
                    damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("\t> You recive " + damageTaken + " in retaliation!");

                    if(health < 1){
                        System.out.println("\t> You have taken to much damage, you are too weak to go on!");
                        break;
                    }


                }else if(input.equals("2")){
                    if(numHealthPotions > 0){
                        health += healthPotionHealAmount;
                        numHealthPotions--;
                        System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount
                                            + "\n\t> You have now " + health +" HP."
                                            + "\n\t> You have " + numHealthPotions + " heal potions left.\n");

                    }else{
                        System.out.println("\t> You have no health potions left! Defeat enemies for chance to get one!");
                    }

                }else if(input.equals("3")){
                    System.out.println("\t> You run away from the " + enemy + "!");
                    //word "continue" provides to loop start. (next iteration and ignores all cases below)
                    //"GAME" provides to exit program to main loop (start loop, new opponent)
                    continue GAME;
                    // without "GAME" we would continue loop moving (that loop where we are now inside)

                }else{
                    System.out.println("\t> Invalid command!");
                }

            }

            if(health < 1){
                System.out.println("You limp out of the dungeon, weak from battle.");
                break;
            }

            System.out.println("-----------------------------------------------");
            System.out.println(" # " + enemy + " has defeated! #");
            System.out.println(" # You have " + health + " HP left #");
            if(rand.nextInt(100) < healthPotionDropChance){
                numHealthPotions++;
                System.out.println(" # The " + enemy + " dropped a health potion! # ");
                System.out.println(" # You now have " + numHealthPotions + " health potion(s). # ");
            }
            System.out.println("-----------------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit dungeon");

            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")){
                System.out.println("Invalid command!");
                input = in.nextLine();
            }
            if(input.equals("1")){
                System.out.println("You continue on your adventure");
            }else if(input.equals("2")){
                System.out.println("You exit the dungeon, successful from your adventures!");
                break;
            }

            System.out.println("#########################################");
            System.out.println(" # THANKS FOR PLAYING! #");
            System.out.println("#########################################");



        }
    }
}
