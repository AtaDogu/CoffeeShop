package CoffeeShop;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args)throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Doğu","Yakışıklı",2019,"123456789012")
			
		);
		

	}

}
