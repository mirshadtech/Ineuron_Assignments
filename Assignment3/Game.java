import java.util.*;
class Gusser
{
	int gunum;
	int guess()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("guesser please guess the number in the range 1 to 100");
		gunum=sc.nextInt();
		
		if(gunum>=0&&gunum<=100)
			return gunum;
		else
		{
			
			return -1;
		}
			
	}
}
class Player
{
	
	int pnum;
	
	int guess()
	{
		Scanner sc=new Scanner(System.in);

		pnum=sc.nextInt();
		
		if(pnum>=0&&pnum<=100)
			return pnum;
		else
			return -1;
		
		
	}
}
class Umpire
{
	int gnum;
	
	int comp=0;
	ArrayList<Player> al=new ArrayList<>();
	void collect()
	{
		Gusser g=new Gusser();
		
		if(g.guess()<=0)
		{
			System.out.println(".. GAME OVER PLAY AGAIN");
			System.exit(0);
			
		}
		else
			gnum=g.gunum;
		
		//try for dynamic players
		System.out.println("Please enter the number of players");
		Scanner sc=new Scanner(System.in);
		int noOfPlayer=sc.nextInt();
		if(noOfPlayer>=1 && noOfPlayer<=10)
		{
			for(int i=0;i<noOfPlayer;i++)
			{
				al.add(new Player());
			}
			for(int j=0;j<noOfPlayer;j++)
			{
				int xx=j+1;
				System.out.println("Enter the number of player "+xx);
				int x=sc.nextInt();;
				if(x>0&&x<=100)
				{
					al.get(j).pnum=x;
				}
				else
				{
					al.get(j).pnum=0;
					
					System.out.println("Player "+xx+" is disqualified");
				}
				
				
			}	
		}
		else
		{
			if(noOfPlayer<=0)
			{
				System.out.println("number of player is not valid .. GAME OVER PLAY AGAIN");
				System.exit(0);
			}
			else if(noOfPlayer>10)
			{
				System.out.println("number of player is more then 10 .. GAME OVER PLAY AGAIN");
				System.exit(0);
			}
		}
		
		
	}
	void compare()
	{
		boolean flag=false;
		comp=gnum;
		for(int i=0;i<al.size();i++)
		{
			int res=i+1;
			
			if(comp==al.get(i).pnum)
			{
				
				System.out.println("Winner player is "+res);
				
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("NO ONE IS WINNER");
		}
		
	}
}
public class Game {

	public static void main(String[] args) {
		Umpire ump=new Umpire();
		ump.collect();
		ump.compare();

	}

}

