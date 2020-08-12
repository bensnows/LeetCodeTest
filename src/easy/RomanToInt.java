package easy;

public class RomanToInt {
	public static void main(String[] args) {
		
		System.out.println(counter("MCMXCIV"));//1994
		System.out.println(counter2("LVIII"));//58 
	}
	
	
	/*
	 * Runtime: 4 ms, faster than 86.23% of Java online submissions for Roman to Integer.
Memory Usage: 39.9 MB, less than 67.45% of Java online submissions for Roman to Integer.
	 * 
	 * */
	public static int counter(String romans) {
		int num = 0;
		int I = 1;
		int V = 5;
		int X = 10;
		int L = 50;
		int C = 100;
		int D = 500;
		int M = 1000;

		for (int i = 0; i < romans.length(); i++) {
			switch (romans.charAt(i)) {
			case 'I':
				num += I;
				break;
			case 'V':
				num += V;
				break;
			case 'X':
				num += X;
				break;
			case 'L':
				num += L;
				break;
			case 'C':
				num += C;
				break;
			case 'D':
				num += D;
				break;
			case 'M':
				num += M;
				break;
			}
		}
		
		if(romans.contains("IV")||romans.contains("IX")) {
			num-=2;
		}
		
		if(romans.contains("XL")||romans.contains("XC")){
			num-=20;
		}
		
		if(romans.contains("CD")||romans.contains("CM")) {
			num-=200;
		}
		
		return num;
	}
	
	
	/*
	 * Runtime: 4 ms, faster than 86.23% of Java online submissions for Roman to Integer.
Memory Usage: 39.6 MB, less than 87.30% of Java online submissions for Roman to Integer.
	 * 
	 * */
	public static int counter2(String romans) {
		int num = 0;
		int I = 1;
		int V = 5;
		int X = 10;
		int L = 50;
		int C = 100;
		int D = 500;
		int M = 1000;
		
		char[] array = romans.toCharArray();
		for (char chars:array) {
			switch (chars) {
			case 'I':
				num += I;
				break;
			case 'V':
				num += V;
				break;
			case 'X':
				num += X;
				break;
			case 'L':
				num += L;
				break;
			case 'C':
				num += C;
				break;
			case 'D':
				num += D;
				break;
			case 'M':
				num += M;
				break;
			}
		}
		
		if(romans.contains("IV")||romans.contains("IX")) {
			num-=2;
		}
		
		if(romans.contains("XL")||romans.contains("XC")){
			num-=20;
		}
		
		if(romans.contains("CD")||romans.contains("CM")) {
			num-=200;
		}
		
		return num;
	}
}
