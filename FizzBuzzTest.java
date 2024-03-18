public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        for (int number = 1; number <= 20; number++) {
            System.out.println("Salida para el " + number + ": " + fizzbuzz.fizzbuzz(number));
        }
    }
}
