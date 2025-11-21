package day06.q02;

public class Bank {
	private int bankCode = 000111;
	private String  bankName = "シェアード銀行";
	private Depositor depositor;
	
	public void showdate() {
		System.out.println("銀行情報を表示します");
		System.out.println("bankCode:"+bankCode);
		System.out.println("bankName"+bankName);
		depositor.showData();
	}

	public Depositor getDepositor() {
		return depositor;
	}

	public void setDepositor(Depositor depositor) {
		this.depositor = depositor;
	}
	
	
		
}
