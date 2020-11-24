package BridgeLabz.RegexPattern;
import java.util.*;
import java.util.regex.Pattern;

public class PinCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PinCode p = new PinCode();
		System.out.println("Enter pincode contains numbers:");
		String pin1 = sc.nextLine();
		p.checkPincode1(pin1);
		System.out.println("Enter Pincode which does not start with alphabet or special character:");
		String pin2 = sc.nextLine();
		p.checkPincode2(pin2);
		System.out.println("Enter Pincode does not end with alphabet or special character");
		String pin3 = sc.nextLine();
		p.checkPincode3(pin3);
		System.out.println("Enter pincode with space");
		String pin4 = sc.nextLine();
		p.checkPincode4(pin4);
		sc.close();
	}
	
	public void checkPincode1(String str)
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
	
	public void checkPincode2(String str)
	{
		/*UC2*/
		String regexforPincode2 = "^[1-9]{1}[0-9]{5}$";
		if(Pattern.matches(regexforPincode2, str))
		{
			System.out.println("Pincode is valid");
		}
		else
		{
			System.out.println("Pincode is invalid");
		}
		
	}
	
	public void checkPincode3(String str)
	{
		/*UC3*/
		String regexforPincode3 = "^[1-9]{1}[0-9]{5}$";
		if(Pattern.matches(regexforPincode3, str))
		{
			System.out.println("Pincode is valid");
		}
		else
		{
			System.out.println("Pincode is invalid");
		}
		
	}
	public void checkPincode4(String str)
	{
		/*UC4*/
		String regexforPincode4 = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		if(Pattern.matches(regexforPincode4, str))
		{
			System.out.println("Pincode is valid");
		}
		else
		{
			System.out.println("Pincode is invalid");
		}
		
	}

}
