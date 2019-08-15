import java.security.Provider;
import java.security.Security;

public class Main1 {

	public static void main(String[] args) {
		Provider[] p = Security.getProviders() ;
		for(Provider px : p){
			System.out.println(px.getName() +"/t"+px.getInfo());
		}
		

	}

}
