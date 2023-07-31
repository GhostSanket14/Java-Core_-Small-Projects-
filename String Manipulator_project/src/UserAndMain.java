import java.util.Scanner;

public class UserAndMain {

	// This function will make given string reverse.
	public String reverse(String pas) {
		StringBuffer ans=new StringBuffer();
		for(int i=pas.length()-1; i>=0; i--) {
			ans.append(pas.charAt(i));
		}		
		return ans.toString();
	}
	
	// This function will make given string Uppercase.	
	public String upper(String pas) {
		StringBuffer ans=new StringBuffer();
		ans.append(pas.toUpperCase());
		return ans.toString();
	}
	
	// This function will make given string Lowercase.
	public String lower(String pas) {
		StringBuffer ans=new StringBuffer();
		ans.append(pas.toLowerCase());
		return ans.toString();
	}
	
	// This function will check if given string is palindrome.
	public String palindrome(String pas) {
		StringBuffer ans=new StringBuffer();
		for(int i=pas.length()-1; i>=0; i--) {
			ans.append(pas.charAt(i));
		}
		if(pas.equals(ans.toString())) {
			return "It is a Palindrome";
		}
		return "It is not Palindrome";
	}
	
	// This function will remove integer from String.
	public String removeInt(String pas) {
		StringBuffer ans=new StringBuffer();
		for(int i=0;i<pas.length(); i++) {
			if(checkInt(pas.charAt(i))) {
			ans.append(pas.charAt(i));
			}
		}
		return ans.toString();
	}
	// This function support above function. (it identifies the number).
	private boolean checkInt(char charAt) {
		int ASCI=charAt;
		if(ASCI>47 && ASCI<57) {
			return false;
		}
		return true;
	}
}