package StringClass;

public class Bai5 {
	static void DemKyTu(String str)
    {
		//tao bo dem gom 256 ki tu
        int counter[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;
        char array[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int dem = 0;
            //kiem tra xem ki tu co bi trung hay ko
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    dem++;
            }
            if (dem == 1)
                System.out.println("Số lần xuất hiện của " + str.charAt(i) + " trong chuỗi:" + counter[str.charAt(i)]);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Good girl dont die";
        System.out.println(str);
        DemKyTu(str);
	}

}
