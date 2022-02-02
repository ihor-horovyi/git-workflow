package src.main.java;


public class User {

  private int id;

  private String name;


  public User(
          int id,
          String name
  ) {
    this.id = id;
    this.name = name;
  }

  public User() {
    System.out.println("_User_Constructor_");
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }











}
