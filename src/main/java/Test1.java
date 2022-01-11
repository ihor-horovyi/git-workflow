package src.main.java;

import java.util.List;

public class Test1 {

  public static void main(String[] args) {
    List<List<src.main.java.User>> listOfUsers = List.of(
            List.of(
                    new src.main.java.User(9, "A"),
                    new src.main.java.User(8, "B"),
                    new src.main.java.User(7, "V")
            ),
            List.of(
                    new src.main.java.User(3, "Q"),
                    new src.main.java.User(2, "W"),
                    new src.main.java.User(1, "E")
            ),
            List.of(
                    new src.main.java.User(6, "L"),
                    new src.main.java.User(5, "K"),
                    new src.main.java.User(4, "J")
            )
    );


    listOfUsers.stream()
            .forEach(System.out::println);
  }

}
