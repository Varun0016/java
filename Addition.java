  //Method with Parameters: Write a method named add that takes two integers as parameters and returns their sum. Call this method from the main method and print the result//

public class Addition {
    public static float add(int a, int b,float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int firstNumber = 3;
        int secondNumber = 5;
        float thirdnumber = 3.5f;
        float sum = add(firstNumber, secondNumber,thirdnumber);
        System.out.println("The sum of " + firstNumber + " and " + secondNumber +  thirdnumber + "is: " + sum);
    }
}