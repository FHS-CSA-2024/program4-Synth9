//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class Program4{
    public static void main(String[] args){
        //Declare variables
        double numberOne = 0;
        double numberTwo = 0;
        double numberThree = 0;
        double numberFour = 0;
        
        //Take user input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter numberOne: ");
        numberOne = myScanner.nextDouble();
        
        System.out.println("Enter numberTwo: ");
        numberTwo = myScanner.nextDouble();
        
        System.out.println("Enter numberThree: ");
        numberThree = myScanner.nextDouble();
        
        System.out.println("Enter numberFour: ");
        numberFour = myScanner.nextDouble();
        
        //Calc
        double sum = numberOne + numberTwo + numberThree + numberFour;
        double average = sum / 4;
        
        
        //Print results
        System.out.println("The sum of the four numbers is: " + sum);
        System.out.println("The average of the four numbers is " + average);
    
    }
}


//Paste console output below:
/*
Enter numberOne: 
475
Enter numberTwo: 
821
Enter numberThree: 
369
Enter numberFour: 
562
The sum of the four numbers is: 2227.0
The average of the four numbers is 556.75


*/
