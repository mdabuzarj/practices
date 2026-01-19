public class Practice {

    // factorial function
    int Factorial(int n) {
        int fact = 1;

        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        return fact;
    }

    // main method (ENTRY POINT)
    public static void main(String[] args) {

        Practice obj = new Practice();   // create object
        int result = obj.Factorial(5);  // call function

        System.out.println(result);     // print result
    }
}
