import java.util.Scanner;
import java.io.BufferedInputStream;
import java.util.ArrayList;

public class AutoGeneratorEngram {
	public static void main(String args[])
	{
		String add = "";
		Scanner reader = new Scanner(System.in);
		ArrayList<String> numbers = new ArrayList<String>();
		while(!add.equals("close"))
		{
			System.out.println("Enter your list of numbers. (Close will exit the program.)");
			while(!add.equals("x"))
			{
				System.out.println("Enter the number you wish to add: (x when you are done adding numbers)");
				add = reader.next();
				if(!add.equals("x") && !add.equals(""))
				{
					numbers.add(add);
					String x;
					while(reader.hasNextLine())
					{
						add = reader.nextLine();
						if(add.equals("x"))
						{
							break;
						}
						numbers.add(add);
					}
				}
			}
			
			for(int i = 0; i < numbers.size(); i++)
			{
				System.out.println("OverrideEngramEntries=(EngramIndex="+numbers.get(i)+",EngramHidden=true ,EngramPointsCost= ,EngramLevelRequirement=,RemoveEngramPreReq=false)");		
			}
			System.out.println("Would you like another block or to close?");
			add = reader.nextLine();
		}
		
		reader.close();
		System.exit(0);

		
	}
}
