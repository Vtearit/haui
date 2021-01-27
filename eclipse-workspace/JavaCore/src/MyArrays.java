import java.util.*;

/**
 * 
 * @author thanh
 *
 */

public class MyArrays {
	/**
	 * Sinh ngau nhien 1 mang 1 chieu voi n phan tu
	 * 
	 * @param n
	 * @return
	 */
	public static int[] generateArray(int n) {
		// Khai bao mang trung gian
		int[] arrInt = new int[n];// Ngam dinh cac phan tu se co gia tri = 0
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = (int) (Math.random() * 100);
			// arrInt[i] = Examples2.randomValue(100); //ham randomValue dc viet o 1 class
			// cos ten Example2
		}

		return arrInt;
	}

	/**
	 * sinh mang 2 chieu
	 * 
	 * @param rows
	 * @param cols
	 * @return
	 */
	public static int[][] generateArray(int rows, int cols) {
		int[][] arrInt = new int[rows][cols];
		// sinh du lieu
		for (int i = 0; i < rows; i++) {
			arrInt[i] = MyArrays.generateArray(cols);
		}
		return arrInt;
	}

	/**
	 * Sinh ngau nhien 1 danh sach
	 * 
	 * @param number
	 * @return
	 */
	public static Person[] generatePerson(int number) {
		// Khai bao mang trung gian
		Person[] list = new Person[number];

		// Danh sach ten
		final String[] firstNames = { "Anh", "Tuấn Anh", "Anh Tuấn", "Ngọc Anh", "Minh Anh", "Hằng", "Anh Đào", "Tuấn",
				"Tuân", "Tân", "Hùng", "Hải", "Vương", "Minh", "Trang", "Huyền", "Huyền Anh", "Minh Tuyền",
				"Minh Trang", "Hân", "Bảo Hân", "Vân", "Vân Anh", "Thủy", "Yến", "Yến Xôi", "Trang Yến", "Vân Đồn" };

		final String[] lastNames = { "Nguyễn", "Hoàng", "Lê", "Trần", "Đào", "Đoàn", "Phan", "Phạm", "Vũ", "Lương",
				"Bùi", "Vương", "Quách", "Ngô", "Hồ", "Tôn Nữ", "Kiều", "Lưu", "Dương", "Đồng" };

		// Sinh dữ liệu cho Person
		int index;
		for (int i = 0; i < number; i++) {
			// Khởi tạo bộ nhớ cho từng phần tử mảng
			list[i] = new Person();

			// Sinh ngẫu nhiên tên (sinh ngẫu nhiên chỉ số trong mảng firstNames )
			index = (int) (Math.random() * firstNames.length);
			list[i].setFirstName(firstNames[index]);

			// Sinh ngẫu nhiên họ (lastNames)
			index = (int) (Math.random() * lastNames.length);
			list[i].setLastName(lastNames[index]);

			// Sinh tuổi
			index = (int) (18 + Math.random() * 7);
			list[i].setAge((byte) index);
		}
		return list;
	}

	/**
	 * Tìm kiếm 1 dánh sách Person dựa vào dánh sahcs ban đầu và tên
	 * 
	 * @param list
	 * @param name
	 * @return
	 */
	public static Person[] searchPerson(Person[] list, String name) {
		// Khai báo mảng kết quả
		Person[] result = null;

		// Đếm số kết quả
		int count = 0;
		for (Person p : list) {
			if (p.getFirstName().contains(name)) {// so sanh bo qua kiểu chữ
				count++;
			}
		}

		// Khoi tao bo nho
		result = new Person[count];

		// Ghi nhan ket qua
		count = 0;
		for (Person p : list) {
			if (p.getFirstName().contains(name)) {
				result[count++] = p;
			}
		}

		return result;
	}

	public static ArrayList<Person> searchPersonV2(Person[] list, String name) {
		// Khai bao mang ket qua
		ArrayList<Person> result = new ArrayList<>();

		for (Person p : list) {
			if (p.getFirstName().contains(name)) {
				result.add(p);
			}
		}

		return result;
	}

	public static void printArray(int[] arrInt, boolean isOlder) {
		if (isOlder) {
			// C1: truyen thong va co dien tu C++
			for (int i = 0; i < arrInt.length; i++) {
				System.out.println(arrInt[i] + " ");
			}
		} else {
			// C2: tu java 5 tro len
			for (int value : arrInt) {
				System.out.print(value + " ");
			}
		}
		System.out.println();
	}

	public static void printArray(int[][] arrInt) {
		for (int[] row : arrInt) {
			MyArrays.printArray(row, false);
		}
	}

	public static void printPerson(Person[] list) {
		for (Person p : list) {
			System.out.println(p);
		}
	}

	public static void printPerson(ArrayList<Person> persons, boolean isGeneric) {
		if (isGeneric) {
			for (Person p : persons) {
				System.out.println(p);
			}
		} else {
			Person p;
			for (int i = 0; i < persons.size(); i++) {
				p = (Person) persons.get(i);
				System.out.println(p);
			}
		}
	}

	/**
	 * isICN =true thif sap xep tang dan va nguoc lai
	 * 
	 * @param arrInt
	 * @param isICN
	 * @return
	 */
	public static int[] sortedArray(int[] arrInt, boolean isICN) {
		// Xác định hướng sắp xếp
		byte oriented = (byte) ((isICN) ? 1 : -1);

		int tmp;
		for (int i = 0; i < arrInt.length - 1; i++) {
			for (int j = i + 1; j < arrInt.length; j++) {
				if (arrInt[i] * oriented > arrInt[j] * oriented) {
					tmp = arrInt[j];
					arrInt[j] = arrInt[i];
					arrInt[i] = tmp;
				}
			}
		}
		return arrInt;
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int[] filterArray(int[] arrInt, boolean isINC) {
		// sap xep
		arrInt = MyArrays.sortedArray(arrInt, isINC);

		// Tach cac so nguyen to va khong nguyen to thanh 2 mang
		int[] temp1 = new int[arrInt.length];// luu so nguyen to
		int[] temp2 = new int[arrInt.length];// Luu khong nguyen to

		// Khai bao 2 bien chay dan dan tuong ung hai mang tren de ghi nhan gia tri
		int t1 = 0, t2 = 0;
		for (int value : arrInt) {
			if (isPrime(value)) {
				temp1[t1++] = value;
			} else {
				temp2[t2++] = value;
			}
		}

		// gop mang de nhan ket qua
		for (int i = t1; i < arrInt.length; i++) {
			temp1[i] = temp2[i - t1];
		}
		return temp1;
	}

	public static void main(String[] args) {
//		int[] arrInt = MyArrays.generateArray(20);
//
//		MyArrays.printArray(arrInt, false);

//		// Sắp xếp
//		arrInt = MyArrays.sortedArray(arrInt, true);
//		// In ra man hình
//		MyArrays.printArray(arrInt, false);

//		// Sap xep SNT len dau
//		arrInt = MyArrays.filterArray(arrInt, true);
//		// In ra man hình
//		MyArrays.printArray(arrInt, false);

//		int[][] arrInt = MyArrays.generateArray(5, 5);
//		
//		MyArrays.printArray(arrInt);

		Person[] list = MyArrays.generatePerson(20);
		// In
		MyArrays.printPerson(list);

		System.out.println("-------------------------------");

//		// tim kiem
//		Person[] result = MyArrays.searchPerson(list, "Anh");
//		MyArrays.printPerson(result);
		ArrayList<Person> result = MyArrays.searchPersonV2(list, "Anh");
		MyArrays.printPerson(result,true);
	}
}
