package interfaceAbstractDemo;





import java.time.LocalDate;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Concretes.CustomerCheckManager;
import interfaceAbstractDemo.Concretes.NeroCustomerManager;
import interfaceAbstractDemo.Concretes.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Emirhan", "Unal",LocalDate.of(2004, 05, 05), "107815550580"));
		System.out.println(customerManager);

	}

	 

}
