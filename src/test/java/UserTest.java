import org.junit.jupiter.api.Test;
import src.main.java.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

  @Test
  public void getId() {
    assertEquals("test", "test");
  }

  @Test
  public void getName() {
    User user = new User(1, "Name");
    assertEquals(user, user);
  }

}
