package Java_Exercise_200420;

Các em làm bài tập về mảng cho Thầy:
‌

Sắp xếp mảng (tăng dần hoặc giảm dần)
Tìm kiếm một giá trị trong mảng với các thuật toán Cây nhị phân,...
Sắp xếp các số nguyên tố lên đầu, không phải nguyên tố về sau và theo thứ tự nào đó
So sánh độ khớp nhau về giá trị của các phần tử mảng giữa 2 mảng.
Kiểm tra xem một mảng A có phải là tập con của mảng B?
Liệt kê xem một mảng A có bao nhiêu mảng con với độ dài n xác định trước.

public class SortArrays {

	//Create a random array has n element
	public static int[] generateArray(int n) {
		//intermediate array arrInt
		int[] arrInt = new int[n];
		
		for(int i=0; i<arrInt.length; i++) {
			arrInt[i] = (int)(Math.random()*100);
		}
		return arrInt;
	}
	
	//show array
	public static void show(int[] arrInt) {
		for(int value: arrInt) {
			System.out.print(value + " ");
		}
		
		//cach 2 dong
		System.out.println("");
		System.out.println("");
	}
	
	
	
	//sort array increase
	public static void sortArray(int[] arrInt) {
		for(int i=1; i < arrInt.length; i++) {
			for  ( int  j =  0 ; j <arrInt.length - 1; j ++) {  
	            if  (arrInt [j] > arrInt[j +  1 ]) {  
	            	int temp = arrInt[j];
	            	arrInt[j] = arrInt[j + 1];
	            	arrInt[j + 1] = temp;
	            }  
	        }
		}
		System.out.println("Mang sap xep tang dan:");
		show(arrInt);
	}
	
	// tìm kiếm nhị phân trả về vị trí số cần tìm
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

		// tìm kiếm nhị phân
		public static void timKiemNhiPhan(int[] arr, int left, int right, int x) {
			if (binarySearch(arr, left, right, x) == (-1)) {
				System.out.println("Khong co phan tu nao trong mang");
			} else {
				System.out.println("Phan tu can tim o vi tri: " + binarySearch(arr, left, right, x));
			}
		}
	
	//Check Prime
	public static boolean checkPrime(int n) {
		if(n < 2) return false;
		
		for(int i=2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Sap xep mang nguyen to tang dan
	public static void SortPrimeArray(int[] arrInt) {
		sortArray(arrInt);
		
		int index = 0;
		for(int i=0; i < arrInt.length; i++) {
			if(checkPrime(arrInt[i]) == true) {
				int temp = arrInt[i];
				arrInt[i] = arrInt[index];
				arrInt[index] = temp;
				
				index++;
			}
		}
		System.out.println("Mang sau khi loc soNT va sap xep tang dan: ");
		show(arrInt);
	}
	
	//equal array
	public static void equalArray(int[] arrInt1, int[] arrInt2) {
		int count = 0;
		
		for(int i=0; i < arrInt1.length; i++)
		{
			for(int j=0; j < arrInt2.length; j++) {
				if(arrInt1[i] == arrInt2[j])	count++;
			}
		}
		
		if(count == 0) {
			System.out.println("Hai mang khong co gia tri trung khop");
		}else if(count == arrInt1.length && arrInt1.length == arrInt2.length) {
			System.out.println("Hai mang co gia tri khop nhau hoan toan");
		}else {
			System.out.println("Hai mang khop nhau " + count + " gia tri");
		}
	}
	
	//kiem tra mang cha con
	public static boolean checkArray(int[] arrIntA, int[] arrIntB) {
		//Mang con phai co it ptu hon mang cha, neu k thoa man => false
		if(arrIntA.length >= arrIntB.length) return false;
		
		//kiem tra tung phan tu mang A co ton tai trong mang B hay khong
		int index = 0;
		for(int i=0; i < arrIntA.length; i++) {
			for(int j=0; j < arrIntB.length; j++) {
				if(arrIntB[j] == arrIntA[i]) {
					index++;
				}
			}
			//neu co 1 ptu mang A k ton tai trong mang B => false
			if(index == 0) return false;
			
			//dat lai gia tri tham so index
			index = 0;
		}
		
		return true;
	}
	
	public static void listChildArray(int[] arrIntA) {
		//So phan tu cua mang con
		int num = 1;
		//Dem so mang con
		int countChildArray = 0;
		
		System.out.println("Cac mang con cua A lan luot la: ");
		while(num <= arrIntA.length) {
			//Dem so phan tu de chia mang cha thanh mang con
			int count = 0;
			for(int i=0; i < arrIntA.length; i++) {
				if(count == num) {
					//xuong dong
					System.out.println("");
					//Xet lai mang(vd arr1 = {1, 2, 3} => arr2 = {2, 3, 4}
					i -= (count - 1);
					//gan lai gia tri tham so
					count =0;
					//Tang so luong mang con len 1
					countChildArray++;
				}
				System.out.print(arrIntA[i] + " ");
				count++;
			}
			System.out.println("");
			num++;
		}
		System.out.println("");
		System.out.println("Co " + countChildArray + " mang con cua A");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create random array
		int[] arrInt = generateArray(20);
		
		//show array
		show(arrInt);
		
		//sort array
		sortArray(arrInt);
		
		//create value x for searching
		int x = (int)Math.random() * 20;
		//show x
		System.out.println("x = " + x);
		
		//binary searching
		timKiemNhiPhan(arrInt, 0, arrInt.length - 1, x);
		
		//Sort prime
		SortPrimeArray(arrInt);
		
		//create A & B array
		int[] arrIntA = generateArray(10);
		int[] arrIntB = generateArray(15);
		//show array A and B
		System.out.println("A: ");
		show(arrIntA);
		System.out.println("b: ");
		show(arrIntB);
		
		//equal 2 arrays
		equalArray(arrIntA, arrIntB);
		
		//check child array
		if(checkArray(arrIntA, arrIntB) == true)
		{
			System.out.println("A la mang con cua B");
		}else {
			System.out.println("A khong la mang con cua B");
		}
		
		//listChildArray
		listChildArray(arrIntA);
	}

}
