public class FizzBuzz {

  public String of(int i) {
    if (i % 15 == 0) {
      return "fizz buzz";
    }

    if (i % 3 == 0) {
      return "fizz";
    }

    if (i % 5 == 0) {
      return "buzz";
    }

    return String.valueOf(i);
  }
}
