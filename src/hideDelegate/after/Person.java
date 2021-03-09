package hideDelegate.after;

public class Person {
  private Department department;

  public Person(Department department) {
    this.department = department;
  }

  public Department getDepartment() {
    return department;
  }

  public String getManagerName() {
    return this.department.getManagerName();
  }
}
