package store;
public class Q43 {

	public void play() {
	System.out.print("play-");
	}
	public void finalizer() {
	System.out.print("clean-");
	}
	public static void main(String[] fun) {
	Q43 car = new Q43();
	car.play();
	System.gc();
	Q43 doll = new Q43();
	doll.play();
	}
	

}
