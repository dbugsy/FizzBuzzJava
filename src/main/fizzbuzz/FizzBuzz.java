package fizzbuzz;

public class FizzBuzz {
    public String play(int input) {
        if (input % 15 == 0) {
            return "FizzBuzz";
        } else if (input % 3 == 0) {
            return "Fizz";
        } else if (input % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(input);
        }
    }
}
