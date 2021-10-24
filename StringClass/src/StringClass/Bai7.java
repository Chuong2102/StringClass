package StringClass;
import java.util.Scanner;
public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhap chuoi");
	    String str = input.nextLine();
	    
	    char[] charArray = str.toCharArray();
	    
	    for(int i = charArray.length - 1; i >= 0; i--) {
	    	System.out.print(charArray[i]);
	    }
		
	}

}
