package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    @Test
    public void returnsOneForOne() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int input = 1;
        String expected_output = "1";
        assertEquals(expected_output, fizzbuzz.play(input));
    }

    @Test
    public void returnsTwoForTwo() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int input = 2;
        String expected_output = "2";
        assertEquals(expected_output, fizzbuzz.play(input));
    }

    @Test
    public void returnsFizzForThree() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int input = 3;
        String expected_output = "Fizz";
        assertEquals(expected_output, fizzbuzz.play(input));
    }

    @Test
    public void returnsBuzzforFive() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int input = 5;
        String expected_output = "Buzz";
        assertEquals(expected_output, fizzbuzz.play(input));
    }

    @Test
    public void returnsFizzBuzzforFifteen() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int input = 15;
        String expected_output = "FizzBuzz";
        assertEquals(expected_output, fizzbuzz.play(input));
    }
}
