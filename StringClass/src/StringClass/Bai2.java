package StringClass;
import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap");
	    String str = input.nextLine();
	    System.out.println("\nChuỗi ban đầu: " + str);
	    boolean foundSpace = true;
	    //
	    str = str.trim();
	    char[] charArray = str.toCharArray();
	    
	    for(int i = 0; i < charArray.length; i++) {
	    	if(Character.isLetter(charArray[i])) {
	            // kiểm tra khoảng trắng có trước chữ cái
	            if(foundSpace) {
	              //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
	              charArray[i] = Character.toUpperCase(charArray[i]);
	              foundSpace = false;
	            }
	         }
	         else {
	            foundSpace = true;
	         }
	    }
	    str = String.valueOf(charArray);
	    System.out.println("Chuỗi sau khi đổi: \n" + str);
	 
	}

}
