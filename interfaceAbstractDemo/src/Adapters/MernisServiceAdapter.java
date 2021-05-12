package Adapters;

import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return false; 
	}

}
