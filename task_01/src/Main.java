public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {

            boolean isMultipleOfThree = ((i % 3) == 0);
            boolean isMultipleOfFive = ((i % 5) == 0);


            if (isMultipleOfThree && isMultipleOfFive) {
                System.out.println("FizzBuzz");

            } else if (isMultipleOfThree) {
                System.out.println("Fizz");
            } else if (isMultipleOfFive) {
                System.out.println("Buzz");
            } else System.out.println(i);
        }
    }
}