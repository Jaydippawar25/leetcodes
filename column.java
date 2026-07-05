public class column {

  static void move(int n, String A, String B, String C) {
    if (n == 1) {
      System.out.println("Move small piec from " + A + " to " + B);
      return;

    }
    move(n - 1, A, C, B);

    if (n == 2) {
      System.out.println("Move medium piec from " + A + " to " + B);
    } else if (n == 3) {
      System.out.println("Move big piec from " + A + " to " + B);
    }

    move(n - 1, C, B, A);
  }

  public static void main(String[] args) {
    move(3, "A", "B", "c");
  }

}
