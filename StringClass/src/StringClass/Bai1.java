package StringClass;
import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap");
	    String str = input.nextLine();
	    System.out.println("\nChuỗi ban đầu: " + str);
	    //Xóa khoảng trắng
	    str = str.replaceAll(" ", "");
	    System.out.println("Chuỗi sau khi xóa khoảng trắng: " + str);
	    
	}

}
