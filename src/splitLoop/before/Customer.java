package splitLoop.before;

public class Customer {
  private String name;
  private Integer age;
  private Double salary;

  public Customer(String name, Integer age, Double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public Double getSalary() {
    return salary;
  }

  public Integer getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
}
