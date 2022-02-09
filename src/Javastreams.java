import java.util.ArrayList;
import java.util.List;

public class Javastreams {

	public static void main(String[] args) {

		
		ArrayList<String> names = new ArrayList<String>();
		names.add("arun");
		names.add("russo");
		names.add("ajax");
		names.add("prussian");
		names.add("aussie");
		
		//To print letters starting with a, we need a for loop, 
		// traverse through ArrayList names & find first letter a words & then prin them
		
		int count=0;
		
		for (int i=0; i<names.size(); i++)
		{
			String name = names.get(i);
			
			if (name.startsWith("a"))
			{
				count++;
				System.out.println(name);
			}
			
		}
		
		System.out.println(count);
		
		
		// all the above code can be done in simple steps using STREAMS
		
		
		Long count1 = names.stream().filter(s->s.startsWith("a")).count(); 
		System.out.println(count1);
		// convert names ArrayList to stream, then filter for conditon starts with a with lambds expressionn
		// then count the number of such s elements found & print them
		
		ArrayList<String> names1 = new ArrayList<String>();
		
		 names.stream().filter(s->s.startsWith("a")).forEach(s->System.out.println(s));
		
		names.stream().filter(s->s.length()<5).forEach(s->System.out.println(s));
		// three steps; initialize stream; intermediary condition; terminal condition;
		
		// many other actions can be done like .concat; .sorted; etc
		
		
		
		
		
		
		
		
		
		
		
	}

}
