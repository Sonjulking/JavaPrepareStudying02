package chapter2;

public class ExplictConversio {

	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum); //데이터가 유실됐음
	
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		float fNum = 0.9F;

		int num1 = (int) dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
