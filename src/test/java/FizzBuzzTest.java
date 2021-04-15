import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @BeforeEach
  void setup() {
    this.fizzBuzz = new FizzBuzz();
  }

  @Test
  public void fizz_buzz_test() {
    assertEquals("1", fizzBuzz.of(1));
    assertEquals("2", fizzBuzz.of(2));
    assertEquals("fizz", fizzBuzz.of(3));
    assertEquals("4", fizzBuzz.of(4));
    assertEquals("buzz", fizzBuzz.of(5));
    assertEquals("fizz", fizzBuzz.of(6));
    assertEquals("7", fizzBuzz.of(7));
    assertEquals("8", fizzBuzz.of(8));
    assertEquals("fizz", fizzBuzz.of(9));
    assertEquals("buzz", fizzBuzz.of(10));
    assertEquals("11", fizzBuzz.of(11));
    assertEquals("fizz", fizzBuzz.of(12));
    assertEquals("13", fizzBuzz.of(13));
    assertEquals("14", fizzBuzz.of(14));
    assertEquals("fizz buzz", fizzBuzz.of(15));
    assertEquals("16", fizzBuzz.of(16));
    assertEquals("fizz", fizzBuzz.of(18));
    assertEquals("buzz", fizzBuzz.of(20));
    assertEquals("fizz buzz", fizzBuzz.of(30));
  }
}
