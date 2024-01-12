package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

//array list is used to featching a data; which method to use fetching by using "get()"  Arraylist is faster compare linked list when you want to fetching
//linkedlist is used to


public class Demo {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
//		long starttime = System.nanoTime();
		for(int i = 0; i<= 100000 ; i++)
		{
			a.add(i);
		}
//		long endTime = System.nanoTime();             check time complexcity without get() method
		
		long starttime = System.nanoTime();
		a.get(100000);
		long endTime = System.nanoTime();
		
	System.out.println(endTime-starttime);	
	
	
	LinkedList a1 = new LinkedList();
//	long startTime1 = System.nanoTime();                               check time complexcity without get() method
	for(int i = 0 ; i<=100000;i++)
	{
		a1.add(i);
	}
//	long endtime1  =System.nanoTime();          check time complexcity get() method
	
	long startTime1 = System.nanoTime();         // cooment ucomment
	a1.get(100000); 
	long endtime1  =System.nanoTime();                  //comment uncomment
	System.out.println(endtime1-startTime1);    
	
	
	
	}

}
