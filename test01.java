package test;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private String food;
		private String lifenumber;
		int a = 3, b = 4;
		if ( a++ >= 3 || b-- <= 3){
		System.out.println("1:" + a + ":"+ b);
		}else {
		System.out.println("2:" + a + ":"+ b);
		}
		final double defaultFortune = 1500000;
		double interestRate = 0.02;
		double totalFortune = defaultFortune;
		for(int i=0;i<10;i++) {
			totalFortune = totalFortune + (totalFortune*interestRate);
		}
		System.out.println("第五題");
		System.out.println("10年後本金加利息共有" + totalFortune + "元");//利率
	}

}
