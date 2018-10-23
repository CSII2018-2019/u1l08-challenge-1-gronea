
public class U1L08Challenge1 {

	public static void main(String[] args) {
		int [] array1 = { 1, 4, 8, 3, 6, 9, 2, 6};
		for (int i = 0; i < array1.length; i++) {
			System.out.println("1: " + array1[i]);
		}
		int a = 0;
		int num = (array1.length);
		for (int i = 0; i < (array1.length)/2; i++) {
			num -= 1;
			a = array1[num];
			array1[num] = array1[i];
			array1[i] = a;
		}
		
		for(int i = 0; i < array1.length; i++) {
			System.out.println("2: " + array1[i]);
		}
	}

}
