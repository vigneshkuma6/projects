package seleniumpractice;

public class IndianTraffic implements CentralTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic it = new IndianTraffic();
		it.greengo();
		it.redstop();
		it.flashyellow();
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("green go implementation");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("red stop implementation");
	}

	@Override
	public void flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("flash yellow implementation");
	}

}
