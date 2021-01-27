package jSE;

/**
 * 
 * @author Vtearit
 *
 */
public class myString {
	/**
	 * 
	 * @param str
	 * @param ch
	 * @return
	 */
	public static int countChar(String str, char ch, boolean isIgnoreCase) {

		// Nếu có bỏ qua kiểu chữ viết hoa
		if (isIgnoreCase) {
			str = str.toLowerCase();
			ch = Character.toLowerCase(ch);
		}

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}

		return count;
	}

	/**
	 * This method is used to <b>count number of word in this str string</b>
	 * 
	 * <code>count = myString.countChar(str, ' ', false) + 1;</code>
	 * 
	 * @param str
	 * @return
	 */

	public static int countWord(String str) {
		int count = 0;

		// chuan hoa
		str = myString.formatString(str);

		// Dem so dau cach +1
		count = myString.countChar(str, ' ', false) + 1;

		return count;
	}

	public static String formatString(String str) {
		// Danh sach cac ky tu dac biet
		char[] chs = { '.', '/', ',', ';', ']', '[', '=', '-', '?', '<', '>', '|', '"', ':', '}', '{', '+', '_', '\\',
				'\'', };

		// Loai bo cac ky tu dac biet co trong chuoi
		for (char ch : chs) {
			str = str.replace(ch, ' ');
		}

		// Loai bo khoang trong dau cuoi
		str = str.trim();

		// Loai bo khoang trong thua o trong chuoi
		while (str.indexOf("  ") != -1) {
			str = str.replace("  ", " ");
		}

		return str;
	}

	/**
	 * 
	 * @param str
	 * @return
	 */

	public static java.util.ArrayList<String> frequencyChar(String str, boolean isIgnoreCase) {
		java.util.ArrayList<String> fres = new java.util.ArrayList<String>();

		// Bỏ qua kiểu chữ
		if (isIgnoreCase) {
			str = str.toLowerCase();
		}

		// Lấy các ký tự khác nhau có trong chuỗi
		String tmp = str.trim();
		int count = 0;

		String chs = ""; // Lưu trữ các ký tự khác nhau
		char ch;
		for (int i = 0; i < tmp.length(); i++) {
			ch = tmp.charAt(i);
			if (ch != ' ') {
				chs += ch;
				tmp = tmp.replace(ch, ' ');// Loại bỏ ký tự đã được lấy đưa vào chs
			}

		}

		// Đếm số lượng các ký tự khác nhau
		for (int i = 0; i < chs.length(); i++) {
			ch = chs.charAt(i);
			count = myString.countChar(str, ch, isIgnoreCase);

			// Lưu trữ
			fres.add("[" + ch + "," + count + "]");
		}
		return fres;
	}

	/**
	 * Cắt một số lượng từ nhất định có trong chuỗi Với điều kiện không được cắt dở
	 * dang từ
	 * 
	 * @param str
	 * @param nWords
	 * @return
	 */
	public static String getWords(String str, byte nWords) {

		// Cộng hòa xã hội Chủ Nghĩa Việt Nam
		// CHuẩn hóa chuỗi
		str = myString.formatString(str);

		// Xác định vị trí để cắt chuỗi
		int i = 0; // Được dừng ở những vị trí là ký tự cách
		int count = 0; // Đếm ký tự cách
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}

			if (count >= nWords) {
				break;
			}
		}

		// Lay chuoi can cat
		if (i < str.length() - 1) {
			// Chac chan i se ton tai o nhung vi tri co dau cach
			return str.substring(0, i) + "...";
		} else {
			// Cat toan bo
			return str;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String str = "Hello Everybody";
		// int count = myString.countChar(str, 'e', true);
		String str = "Cộng hòa xã hội Chủ Nghĩa Việt Nam";
//		int count 
//		
//		System.out.println("Có tất cả " + count + " từ.");

		// System.out.print(myString.frequencyChar(str, false));

		System.out.print(myString.getWords(str, (byte) 4));
	}
}
