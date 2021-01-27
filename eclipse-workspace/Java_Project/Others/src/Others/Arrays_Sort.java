package Others;

public class Arrays_Sort {
	// Tự động tạo một mảng n phần tử
	public static int[] generateArray(int n) {
		// intermediate array arrInt
		int[] arrInt = new int[n];

		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = (int) (Math.random() * 100);
		}
		return arrInt;
	}

	// Hiện mảng
	public static void show(int[] arrInt) {
		for (int value : arrInt) {
			System.out.print(value + " ");
		}
	}

	// Sắp xếp mảng tăng dần
	public static void sortArray(int[] arrInt) {
		for (int i = 1; i < arrInt.length; i++) {
			for (int j = 0; j < arrInt.length - 1; j++) {
				if (arrInt[j] > arrInt[j + 1]) {
					int temp = arrInt[j];
					arrInt[j] = arrInt[j + 1];
					arrInt[j + 1] = temp;
				}
			}
		}
		System.out.println("\n\nMảng sắp xếp tăng dần:");
		show(arrInt);
		System.out.println("\n");
	}

	// Tìm kiếm nhị phân trả về vị trí số cần tìm
	public static int binarySearch(int[] arr, int left, int right, int x) {
		if (right >= left) {
			int mid = (left + right) / 2;
			if (x == arr[mid])
				return mid;
			else if (x < arr[mid])
				return binarySearch(arr, left, mid - 1, x);
			else
				return binarySearch(arr, mid + 1, right, x);
		} else {
			return -1;
		}

	}

	// Tìm kiếm nhị phân
	public static void timKiemNhiPhan(int[] arr, int left, int right, int x) {
		if (binarySearch(arr, left, right, x) == (-1)) {
			System.out.println("Không có phần tử " + x + " trong mảng.");
		} else {
			System.out.println("Phần tử " + x + " ở vị trí: " + binarySearch(arr, left, right, x));
		}
	}

	// Kiểm tra số nguyên tố
	public static boolean checkPrime(int n) {
		if (n < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Sắp xếp mảng nguyên tố tăng dần
	public static void SortPrimeArray(int[] arrInt) {
		sortArray(arrInt);

		int index = 0;
		for (int i = 0; i < arrInt.length; i++) {
			if (checkPrime(arrInt[i]) == true) {
				int temp = arrInt[i];
				arrInt[i] = arrInt[index];
				arrInt[index] = temp;

				index++;
			}
		}
		System.out.println("Mảng sau khi lọc số nguyên tố và sắp xếp tăng dần: ");
		show(arrInt);
	}

	// So sánh mảng
	public static void equalArray(int[] arrInt1, int[] arrInt2) {
		int count = 0;

		for (int i = 0; i < arrInt1.length; i++) {
			for (int j = 0; j < arrInt2.length; j++) {
				if (arrInt1[i] == arrInt2[j])
					count++;
			}
		}

		if (count == 0) {
			System.out.println("\n=>Hai mảng không có giá trị trùng khớp.");
		} else if (count == arrInt1.length && arrInt1.length == arrInt2.length) {
			System.out.println("\n=>Hai mảng có giá trị khớp nhau hoàn toàn.");
		} else {
			System.out.println("\n=>Hai mảng khớp nhau " + count + " giá trị.");
		}
	}

	// Kiểm tra mảng cha con
	public static boolean checkArray(int[] arrIntA, int[] arrIntB) {
		// Mảng con phải có ít phần tử hơn mảng cha, nếu không => false
		if (arrIntA.length >= arrIntB.length)
			return false;

		// Kiếm tra từng phần từ của mảng A có tồn tại trong mảng B không
		int index = 0;
		for (int i = 0; i < arrIntA.length; i++) {
			for (int j = 0; j < arrIntB.length; j++) {
				if (arrIntB[j] == arrIntA[i]) {
					index++;
				}
			}
			// Nếu có 1 phần tử mảng A không tồn tại trong mảng B => false
			if (index == 0)
				return false;

			// Đặt lại giá trị tham số index
			index = 0;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo mảng tự động
		int[] arrInt = generateArray(20);

		// Hiển thị mảng
		System.out.println("Mảng: ");
		show(arrInt);

		// Sắp xếp mảng
		sortArray(arrInt);

		// Tự tạo giá trị x để tìm kiếm
		int x = (int) Math.random() * 20;
		// Hiển thị giá trị cần tìm
		System.out.println("x = " + x);

		// Tìm kiếm nhị phân
		timKiemNhiPhan(arrInt, 0, arrInt.length - 1, x);

		// Sắp xếp số nguyên tố
		SortPrimeArray(arrInt);

		// Tạo mảng A và B
		int[] arrIntA = generateArray(10);
		int[] arrIntB = generateArray(15);
		// Hiển thị mảng A và B
		System.out.println("\n\nA: ");
		show(arrIntA);
		System.out.println("\nB: ");
		show(arrIntB);

		// So sánh 2 mảng
		equalArray(arrIntA, arrIntB);

		// Kiếm tra mảng con
		if (checkArray(arrIntA, arrIntB) == true) {
			System.out.println("nA là mảng con của B");
		} else {
			System.out.println("\nA không là mảng con của B");
		}
	}
}
