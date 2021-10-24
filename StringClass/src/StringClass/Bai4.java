package StringClass;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "em an com chua ";
		String[] words = s.split("\\s");
		
		for (String w : words) {
			System.out.println(w);
		}
	}

}
