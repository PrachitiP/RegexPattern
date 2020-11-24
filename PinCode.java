package BridgeLabz.RegexPattern;
import java.util.*;
import java.util.regex.Pattern;

public class PinCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pincode contains numbers:");
		String pin = sc.nextLine();
		PinCode p = new PinCode();
		p.checkPincode1(pin);
		sc.close();
	}
	
	public void checkPincode1(String str )
	{
		/*UC1*/
		String regexforPincode1 = "^[1-9]{1}[0-9]{5}$";
		if(Pattern.matches(regexforPincode1, str))
		{
			System.out.println("Pincode is valid");
		}
		else
		{
			System.out.println("Pincode is invalid");
		}
		
	}

}
