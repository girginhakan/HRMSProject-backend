package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer hakan = new IndividualCustomer();
		hakan.customerNumber="12345";
		
		CorporateCustomer hepsiBurada =new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer abc= new SendikaCustomer();
		abc.customerNumber="99999";
		
		CustomerManager customerManager=new CustomerManager();
		
		Customer[] customers= {hakan,hepsiBurada,abc};
		
		customerManager.addMultiple(customers);	
		
	}

}
