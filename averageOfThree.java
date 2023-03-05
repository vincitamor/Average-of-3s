import java.util.Scanner;
public class averageOfThree {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double num1 = 0;
        double average;

        while(num1 != 3) {
            
        System.out.print("Type in a number:\t");
        num1 = keyboard.nextDouble();
        System.out.print("Type in another number:\t");
        num1 = keyboard.nextDouble();
        System.out.print("Type in the last number:\t");
        num1 = keyboard.nextDouble();
        average = (num1 + num1 + num1) / 3.0;
        

        System.out.println("The average of your numbers is " + average);
        
        }
        keyboard.close();
    }//end main

}