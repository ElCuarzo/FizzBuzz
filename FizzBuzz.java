// Escribir un programa que tomará un entero y mostrará en pantalla Fizz si el número es divisible por 3, Buzz si el número es divisible por 5,
// FizzBuzz si el número es divisible por 3 y 5 y para el resto de los casos mostrará el número que se ingresó.
// Salida para el 3 = Fizz
// Salida para el 5 = Buzz
// Salida para el 15 = FizzBuzz
// Salida para el 2 = 2
public class FizzBuzz {
    public String fizzbuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}