package APRIL2022;


public class ReverseString {
	
	public static String reverseStr(String str) {
		String result="";
	char []newStr=str.toCharArray();
	for(int i=0;i<newStr.length;i++) {
		result+=newStr[newStr.length-1-i];
	}
	return result;
		
	}
	
	
	
	public static void main(String[] args) {
        System.out.println(reverseStr("Programming"));
        
        System.out.println(Integer.parseInt(reverseInt(12345678)));
        
        
       
        
        
	}
	public static String reverseInt(int num) {
		String result=""+num;
		String reversedNum="";
		char []newNum=result.toCharArray();
		for(int i=0;i<newNum.length;i++) {
			reversedNum+=newNum[newNum.length-1-i];
		}
		return reversedNum;
		
	}
	
}
