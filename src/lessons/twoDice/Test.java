package lessons.twoDice;

public class Test {

	public static void main(String[] args) {
		
		
		// create new instance of TwoDice
		TwoDice myTwoDiceGame = new TwoDice();
		
		System.out.println(myTwoDiceGame.getDice1());
		System.out.println(myTwoDiceGame.getDice2());
		myTwoDiceGame.rollDi();
		System.out.println(myTwoDiceGame.getDice1());
		System.out.println(myTwoDiceGame.getDice2());
		

	}

}
