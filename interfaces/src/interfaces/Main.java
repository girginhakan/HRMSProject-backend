package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(),new DatabaseLogger(),new FileLogger()};
		
		CustomerManager customerManager =new CustomerManager(loggers);
		Customer hakan = new Customer(1,"Hakan","Girgin");
		customerManager.add(hakan);

	}

}
