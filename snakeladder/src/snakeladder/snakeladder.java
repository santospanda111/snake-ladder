package snakeladder;

public class snakeladder {
	public static final int source = 0;
	public static final int destination = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position=0,diceRoll=0;
		while(position != destination)
		{
			diceRoll++;
				int randomCheck = (int) Math.floor(Math.random() * 10) % 6+1;
				int randomPlay = (int) (Math.random() * 10) % 3;
				switch(randomPlay) {
				case 0:
					System.out.println("No play");
					break;
				case 1:
					System.out.println("Well done");
					position += randomCheck;
					break;
				case 2:
					System.out.println("Snake");
					position -= randomCheck;
					break;
				}
				if(position < 0) {
					position = 0;}
				else if(position>=100) {
					position=100;}
		  }
		System.out.println(position);
	  }
  }


