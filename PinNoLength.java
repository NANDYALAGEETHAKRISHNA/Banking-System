package test;

public class PinNoLength {
	public int c=0;
	public int length(int pinNo) {
		while(pinNo>0) {
			c++;
			pinNo=pinNo/10;
		}
		return c;
	}

}
