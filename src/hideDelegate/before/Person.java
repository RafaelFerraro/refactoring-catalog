package hideDelegate.before;

public class Person {
  private Department department;

  public Person(Department department) {
    this.department = department;
  }

  public Department getDepartment() {
    return department;
  }
}
