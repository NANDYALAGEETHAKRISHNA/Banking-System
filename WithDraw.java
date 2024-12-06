package test;
public class WithDraw implements Transaction{
	public void process(int amt) {
		if(amt<=b.bal) {
			System.out.println("Amt withdraw:"+amt);
			b.bal=b.bal-amt;
			System.out.println("Balance:"+b.getBalance());
			System.out.println("Transaction Complete...");
		}else{
		System.out.println("Insufficient fund...");
	    }
	}

}

