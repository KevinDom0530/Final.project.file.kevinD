/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nutrition.calculator;

/**
 *
 * @author kevds
 */

import java.util.Scanner;


public class NutritionCalculator {

    /**
     * @param args the command line arguments
     */
    
    public static int getValidAge(Scanner scanner) {
        System.out.print("Please enter your age: ");
        String input = scanner.nextLine();
        
       try {
            int age = Integer.parseInt(input);
           if (age < 0 || age > 100) {
                System.out.println("Invalid age! Age cannot be negative.");
                return getValidAge(scanner); // Recursive call to prompt for a valid age
            }

           return age;
        } catch (NumberFormatException e) {
            System.out.println("Invalid age! Please enter a valid integer.");
            return getValidAge(scanner); // Recursive call to prompt for a valid age
        }
    }
    
    public static int getValidHeight(Scanner scanner) {
        System.out.print("Please enter your height: ");
        String input = scanner.nextLine();
        
       try {
            int height = Integer.parseInt(input);
           if (height < 138 || height > 230) {
                System.out.println("Invalid entry! "
                        + "Enter a valid height value.");
                return getValidHeight(scanner); 
            }

           return height;
        } catch (NumberFormatException e) {
            System.out.println("Invalid entry! Please enter a valid integer.");
            return getValidHeight(scanner); 
        }
    }
    
     public static int getValidWeight(Scanner scanner) {
        System.out.print("Please enter your weight: ");
        String input = scanner.nextLine();
        
       try {
            int weight = Integer.parseInt(input);
           if (weight < 41 || weight > 105) {
                System.out.println("Invalid entry! Enter a valid weight value.");
                return getValidWeight(scanner); 
            }

           return weight;
        } catch (NumberFormatException e) {
            System.out.println("Invalid entry! Please enter a valid integer.");
            return getValidWeight(scanner); 
        }
    }
    
    public static void main(String[] args) {
        Person p = new Person();
        Scanner input = new Scanner(System.in);
        p.age = getValidAge(input);
        System.out.println("Valid age entered: " + p.age);
        p.height = getValidHeight(input);
        System.out.println("Valid height entered: " + p.height);
        p.weight = getValidWeight(input);
        System.out.println("Valid weight entered: " + p.weight);
        System.out.println("What is your sex (M or F)?");
        p.sex = input.next();
        System.out.println("What is your activity level (1 for active, 0 for"
                + " not active)?");
        p.activity = input.nextInt();
        
        
        p.ShowResult();
        
    }
    
}
