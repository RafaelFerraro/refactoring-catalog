package hideDelegate.before;

public class Example {
  public static void main(String[] args) {
    var manager = new Manager("Boss");
    var department = new Department(manager);
    var person = new Person(department);

    printManagerName(person);
  }

  private static void printManagerName(Person person) {
    System.out.println(person.getDepartment().getManager().getName());
  }
}
