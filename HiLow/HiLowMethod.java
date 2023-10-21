import TurtleGraphics.KeyboardReader;
import java.util.Random;
public class HiLowMethod {
	KeyboardReader reader = new KeyboardReader();
	Random genarator = new Random();
	
	public void Game()
	{
		int  score=1000, number, bet, predict;
		char ask;
		
		number=genarator.nextInt(13)+1;
		
		System.out.println("You have "+score+" points ");
		System.out.print("How many points to risk: ");
		bet=reader.readInt();
		System.out.print("Predict (1=High, 0=Low) : ");
		predict=reader.readInt();
		
		if((predict<0)||(predict>1))
		{
			System.out.print("Invaild number. Predict (1=High, 0=Low) : ");
			predict=reader.readInt();
		}
		System.out.println("Number is "+number);
		if((number<=6)&&(predict==0))
		{
			System.out.println("You win");
			bet=bet*2;
			score=score+bet;
		}
		else if((number>=8)&&(predict==1))
		{
			System.out.println("You win");
			bet=bet*2;
			score=score+bet;
		}
		else if(number==7)
		{
			System.out.println("You lose");
			score=score-bet;
		}
		else if((number<=6)&&(predict!=0))
		{
			System.out.println("You lose");
			score=score-bet;
		}
		else if((number>=8)&&(predict!=1))
		{
			System.out.println("You lose");
			score=score-bet;
		}
		System.out.print("Play again (y/n): ");
		ask=reader.readChar();
		if((ask=='y')&&(ask!='n'))
		{
			Regame(score);
		}
		else if((ask!='y')&&(ask=='n'))
		{
			End(score);
		}
	}
	
	public int Regame(int score1)
	{
int  number, bet, predict;
char ask;
		
		number=genarator.nextInt(13)+1;
		System.out.println();
		System.out.println("You have "+score1+" points ");
		System.out.print("How many points to risk: ");
		bet=reader.readInt();
		System.out.print("Predict (1=High, 0=Low) : ");
		predict=reader.readInt();
		
		if((predict<0)||(predict>1))
		{
			System.out.print("Invaild number. Predict (1=High, 0=Low) : ");
			predict=reader.readInt();
		}
		System.out.println("Number is "+number);
		if((number<=6)&&(predict==0))
		{
			System.out.println("You win");
			bet=bet*2;
			score1=score1+bet;
		}
		else if((number>=8)&&(predict==1))
		{
			System.out.println("You win");
			bet=bet*2;
			score1=score1+bet;
		}
		else if(number==7)
		{
			System.out.println("You lose");
			score1=score1-bet;
		}
		else if((number<=6)&&(predict!=0))
		{
			System.out.println("You lose");
			score1=score1-bet;
		}
		else if((number>=8)&&(predict!=1))
		{
			System.out.println("You lose");
			score1=score1-bet;
		}
		
		System.out.print("Play again (y/n): ");
		ask=reader.readChar();
		if((ask=='y')&&(ask!='n'))
		{
			Regame(score1);
		}
		else if((ask!='y')&&(ask=='n'))
		{
			End(score1);
		}
		return score1;
		
	}
	
	public void End(int score2)
	{
		System.out.println();
		System.out.println("Final amount: "+score2);
		
		System.exit(0);
	}

}
