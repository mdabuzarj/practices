public class SumOfOddNumbers {

    // function to calculate sum of odd numbers just alter
    static int oddSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;

        int result = oddSum(n);
        System.out.println(result);
    }
}
