package app;

public class Main {
    public static void main(String[] args){

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int totalSum = 0;
        int sum = 0;
        int i = 0;
        while (i < numbers.length) {
            i++;
            sum += i;
            System.out.println(i + ")" + "Num is "+ i + ", sum is " + sum);
            totalSum += i;
        }
        System.out.println("\nSum of numbers is " + totalSum);
    }
}
