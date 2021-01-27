package jSE;

/*
 * <b>Business class</b>
 * <br/>
 * <em>Những lớp đối tượng thiên về xử lý kỹ thuật hoặc giải thuật, các phân tích
 * dữ liệu hỗ trợ cho các lớp đối tượng khác...</em>
 * <br/>
 * <i>update 18/04/2020</i>
 * 
 * @author Vtearit
 */
public class myArrays {
	/*
	 * Sinh ngẫu nhiên 1 mảng 1 chiều với n phần từ
	 * 
	 * @param n
	 * 
	 * @return
	 */
	public static int[] generateArray(int n) {
		// Khai báo mảng trung gian
		int[] arrInt = new int[n]; // Ngầm định các phần tử sẽ có giá trị là 0

		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = (int) (Math.random() * 100);

			// arrInt[i] = Person.randomValue(100);

		}

		return arrInt;
	}

	// Print methods
	public static void printArray(int[] arrInt, boolean isOlder) {

		if (isOlder) {
			// Cách 1 - truyền thống và cổ điển từ C++
			for (int i = 0; i < arrInt.length; i++) {
				System.out.print(arrInt[i] + " ");
			}
		} else {
			// Cách 2- từ java 5 trở lên
			for (int value : arrInt) {
				System.out.print(value + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sinh ngẫu nhiên mảng
		int[] arrInt = myArrays.generateArray(20);

		// In ra màn hình
		myArrays.printArray(arrInt, true);
	}
}
