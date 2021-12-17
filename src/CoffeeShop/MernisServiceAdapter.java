package CoffeeShop;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()),customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthOfDate());
		if(result == true)
		{
			System.out.println("Başarılı");
			return true;
			
		}else {
			System.out.println("Başarısız");
			return false;
		}
		
	}
}
