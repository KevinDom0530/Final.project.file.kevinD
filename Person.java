/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nutrition.calculator;

/**
 *
 * @author kevds
 */
public class Person {
    public int age;
    public int height;
    public int weight;
    public String sex;
    public int activity;
    
    public Person(int age, int height, int weight, String sex, int activity){
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.activity = activity;
    }

    Person() {
    }
    //Men: BMR = (10 × weight in kg) + (6.25 × height in cm) − (5 × age in years) + 5
    //Women: BMR =  (10 × weight in kg) + (6.25 × height in cm) − (5 × age in years) − 161
    private double GetBMR(){
        if(sex.contains("M")){
           double BMR = (10 * weight) + (6.25 * height) - (5 * age) + 5;
            return BMR;
        } else {
            return (10 * weight) + (6.25 * height) - (5 * age)- 161;
        }
    }
    public double GetActivityLevel(){
        if(activity == 1){
            return GetBMR() * 1.725;
        } else {
            return GetBMR() * 1.2;
        }
    }
    public void ShowResult(){
        String response = "Your BMR is " + String.valueOf(GetBMR()) + 
                " and your daily calorie "
                + "intake should be " + String.valueOf(GetActivityLevel())+ 
                " calories a day.";
        System.out.println(response);
    }
}
