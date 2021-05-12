package interfaceAbstractDemo.Concretes;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService _customerCheckService;
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService)
	{
		
	}
	@Override
	public void save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer))
		{
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
		
		
		
	}
	
	

}
