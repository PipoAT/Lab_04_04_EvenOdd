// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // declare variables for number (int) to check and result
        int numToCheck = 12;
        int moduloResult = 0;
        String result = "";

        // take modulo to indicate if number is even or odd
        moduloResult = numToCheck % 2;

        // checks if the result is 0 or 1 and sets the result string for output
        if (moduloResult == 0) { // if 0, number is even
            result = "The number " + numToCheck + " is even.";
        } else { // if not 0, number is odd
            result = "The number " + numToCheck + " is odd.";
        }

        // output the result
        System.out.println(result);


    }
}