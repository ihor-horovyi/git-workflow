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
    assertEquals(1, user.getId());
    assertEquals("Name", user.getName());
  }

}
