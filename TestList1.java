package day_13_Collection;

import java.util.ArrayList;
import java.util.List;

public class TestList1 {

	public static void main(String[] args) {
		// insertion order, duplicate allowed , multiple null allowed 
		List<Integer> marks = new ArrayList<Integer>();
		
		   marks.add(60);
		   marks.add(70);
		   marks.add(80);
		   marks.add(90);
		   marks.add(76);
		   marks.add(null);
		   marks.add(null);
		   marks.add(null);
		   marks.add(null);
		 System.out.println(marks.get(4));
		    
		     marks.remove(2);
		 System.out.println(marks);
		 
	if(marks.contains(90))
	{
		System.out.println("present");
	} else 
	{
		System.out.println("not present");
	}
	
		
		  // for(Integer m : marks)
		   //{
			 //  System.out.println(m);
		   //}
		//   for(int i = 0; i<marks.size(); i++)
		 //  {
			//   System.out.println(marks.get(i));
		   //}
	}
}

		   
	




