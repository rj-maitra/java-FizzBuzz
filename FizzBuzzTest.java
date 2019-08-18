public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz test = new FizzBuzz();

        // Test One
        String testOne = test.fizzBuzz(3);
        System.out.println(testOne);

        // Test Two
        String testTwo = test.fizzBuzz(5);
        System.out.println(testTwo);

        // Test Three
        String testThree = test.fizzBuzz(15);
        System.out.println(testThree);

        // Test Four
        String testFour = test.fizzBuzz(2);
        System.out.println(testFour);
    }
}