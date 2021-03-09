package hideDelegate.after;

public class Department {
  private Manager manager;

  public Department(Manager manager) {
    this.manager = manager;
  }

  public Manager getManager() {
    return manager;
  }

  public String getManagerName() {
    return this.manager.getName();
  }
}
