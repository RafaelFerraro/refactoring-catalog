package splitLoop.before;

import java.util.ArrayList;

public class CustomerData {

	public static void main(String[] args) {
		var customers = new ArrayList<Customer>();
		var customer1 = new Customer("Jose", 30, 15000.0);
		var customer2 = new Customer("Amanda", 35, 18000.0);
		var customer3 = new Customer("Gabriela", 24, 9000.0);

		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);

		customers.forEach((customer) -> {
			System.out.println(String.format("Customer name is %s", customer.getName()));
			System.out.println(String.format("Customer age is %s", customer.getAge()));
			System.out.println(String.format("Customer current salary is %s", customer.getSalary()));
		});
	}

}
