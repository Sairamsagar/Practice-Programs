package demo;

public class Labelledbreak {

	public static void main(String[] args) {

		sairam:
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==4)
					break sairam;
				System.out.print("*");
			} 
				System.out.println("");
		}
	

	}

}
