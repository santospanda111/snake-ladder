package snakeladder;

public class snakeladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position=0;
		int randomCheck = (int) Math.floor(Math.random() * 10) % 6+1;
		int randomPlay = (int) (Math.random() * 10) % 3;
		switch(randomPlay) {
		case 0:
			System.out.println("No play");
			break;
		case 1:
			System.out.println("Ladder");
			position += randomCheck;
			break;
		case 2:
			System.out.println("Snake");
			position -= randomCheck;
			break;
		}

	}

}
