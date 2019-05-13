import java.util.*;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Word.....!!");
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the how many number you want...??");
		int n=input.nextInt();
		List<Integer> values= new ArrayList<>();
		Set<Integer> val=new HashSet<>();
		for(int i=0;i<=n;i++)
		{
			values.add(i);
			val.add(i);
		}
		for (Integer j : values)
		{
			System.out.println(j); 
		}
		
		System.out.println("Set start");
		for (Integer k : val)
			
			System.out.println(k);
		
		  for(Integer i : values)
		  {
    	  System.out.println(i);
		  }
	values.forEach(j -> System.out.println(j));
		
		
	}

}
