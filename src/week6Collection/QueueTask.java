package week6Collection;

//program to rotate a queue

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueTask {
	
	
	public static ArrayDeque <Integer> rotateQueue(ArrayDeque <Integer> q,int k)
	{
		ArrayDeque <Integer> q2 = new ArrayDeque<Integer>();
		for(int i=0;i<k;i++)
		{
			q2.offerFirst(q.poll());
		}
		//System.out.println(q);
		for(Integer i:q)
		{
			//System.out.println(q.poll());
			q2.add(q.poll());
		}
			
		return q2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		while(n--!=0)
		{
			System.out.println("Enter data");
			q.add(sc.nextInt());
		}
		
		System.out.println("Enter the value of k");
		k=sc.nextInt();
		
		System.out.println("Before rotating:"+q);
		q=rotateQueue(q,k);
		
		System.out.println("After rotating:"+q);
	}

}
