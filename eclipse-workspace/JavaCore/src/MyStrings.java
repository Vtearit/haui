
public class MyStrings {
	/**
	 * This method is user to count a ch char in the str string
	 * 
	 * @param str
	 * @param ch
	 * @return
	 */
	public static int countChar(String str, char ch, boolean isIgnoreCase) {
		// Neu co bo qua kieu chu viet hoa
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

	public static int countWord(String str) {
		int count = 0;
		// chuan hoa
		str = MyStrings.formatString(str);
		// dem so dau cach +1
		count = MyStrings.countChar(str, ' ', false) + 1;
		return count;
	}

	public static String formatString(String str) {
		// danh sach cac ki tu dac biet
		char[] chs = { '`', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', ']', '{', '}',
				'|', '\\', '\'', '"', ';', ':', '?', ',', '.', '<', '>', '/' };
		// Loai bo cac ky tu dac biet co trong chuoi
		for (char ch : chs) {
			str = str.replace(ch, ' ');
		}
		// Loai bo khoang trong dau va cuoi
		str = str.trim();
		// Loai bo khoang trong thua o trong chuoi
		while (str.indexOf("  ") != -1) {
			str = str.replace("  ", " ");
		}
		return str;
	}

	public static java.util.ArrayList<String> frequencyChar(String str, boolean isIgnoreCase) {
		java.util.ArrayList<String> fres = new java.util.ArrayList<String>();
		// Bo qua kieu chu
		if (isIgnoreCase) {
			str = str.toLowerCase();
		}
		// Lay cac ky tu khac nhau co trong chuoi
		String tmp = str.trim();
		int count = 0;

		String chs = "";// Luu tru cac ky tu khac nhau
		char ch;
		for (int i = 0; i < tmp.length(); i++) {
			ch = tmp.charAt(i);
			if (ch != ' ') {
				chs += ch;
				tmp = tmp.replace(ch, ' ');// loai bo ky tu da duoc lay dua vao chs
			}

		}

		// dem so cac ky tu khac nhau
		for (int i = 0; i < chs.length(); i++) {
			ch = chs.charAt(i);
			count = MyStrings.countChar(str, ch, isIgnoreCase);

			// Luu tru
			fres.add("[" + ch + "," + count + "]");
		}
		return fres;
	}
	/**
	 * cat 1 so luong tu nhat ding trong 1 chuoi voiw dieu kien khong duoc cat do dang
	 * @param str
	 * @param nWords
	 * @return
	 */
	public static String getWords(String str, byte nWords) {
		//chuan hoa chuoi 
		str = MyStrings.formatString(str);
		
		//xac dinh vi tri de cat chuoi
		int i=0;//se duoc dung o nhung vi tri la ky tu cach
		int count = 0;//dem ky tu cach
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
			
			if(count >= nWords) {break;}

		}
		//Lay chuoi can cat
		if(i<str.length()-1) {
			//chac chan i se ton tai o nhung vi tri co dau cach
			return str.substring(0,i)+"...";
		}else {
			return str;
		}
		
		
	}
	public static void main(String[] args) {
//		String str = "Hello              Everybody";
		String str = "     Cộng     Hòa  xã hội      Chủ Nghĩa Việt Nam   ";
//		int count = MyStrings.countWord(str);
//		System.out.print("Co tat ca " + count + " tu.");

//		System.out.print(frequencyChar(str, true));
		System.out.print(getWords(str, (byte)4));
	}
}
