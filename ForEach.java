package APRIL2022;

public class ForEach {

	public static void main(String[] args) {
		String bools = "10,20,30,40,50,60,70";
		String[] arr = bools.split(",");
        int x=0;
		for (String item : arr) {
            x=Integer.parseInt(item);
           }
		System.out.println(x);

	}
}
