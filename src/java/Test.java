package src.java;

public class Test {
  public static void main(String[] args) {
    print("Hello");
    print("11111");

    var igor = new User(1, "Igor");
    print(igor);
  }

  public static void print(Object obj) {
    System.out.println("[log] " + obj);
  }
}
