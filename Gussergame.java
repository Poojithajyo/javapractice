import java.util.Scanner;
class Guesser
{
	int gnum;
	int guessnum()
	{
		System.out.println("Guesser guess number");
		Scanner Scan = new Scanner (System.in);
		gnum = Scan.nextInt();
		return gnum;
	}
}
class Player
{
	int playernum;
	int pnum()
	{
		System.out.println("Player guess nnumber");
		Scanner Scan = new Scanner(System.in);
		playernum = Scan.nextInt();
		return playernum;
	}
}
class Umpire
{
	int numfromguesser,numfromplayer1,numfromplayer2,numfromplayer3;

	void collectnumfromguesser()
	{
		Guesser g = new Guesser();
		numfromguesser = g.guessnum();
	}

	void collectnumfromplayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numfromplayer1 = p1.pnum();
		numfromplayer2 = p2.pnum();
		numfromplayer3 = p3.pnum();
	}

	void compare()
	{
		if(numfromplayer1 == numfromguesser)
		{
			System.out.println("Player1 wins");
		}
		if(numfromplayer2 == numfromguesser)
		{
			System.out.println("Player2 Wins");
		}
		if(numfromplayer3 == numfromguesser)
		{
			System.out.println("Player3 Wins");
		}
		if(numfromplayer1 != numfromguesser && numfromplayer2 != numfromguesser && numfromplayer3 != numfromguesser)
		{
			System.out.println("Nobody Wins");
		}
	}
}
class Gussergame
{
	public static void main(String args[])
	{
		Umpire u = new Umpire();
		u.collectnumfromguesser();
		u.collectnumfromplayer();
		u.compare();
	}
}
