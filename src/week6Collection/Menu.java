package week6Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	ArrayList<Integer> arrayList;
	
	Menu(ArrayList<Integer> arrayList)
	{
		this.arrayList = arrayList;
	}
	
	public void addData(Scanner sc)
	{
		System.out.println("Enter a Integer data to add");
		int data = sc.nextInt();
		this.arrayList.add(data);
		System.out.println("Data added");
	}
	
	public void updateData(Scanner sc)
	{
		
			System.out.println("Enter index of list you want to update");
			int index = sc.nextInt();
			System.out.println("Enter the updated value");
			int updatedData = sc.nextInt();
			try
			{
				this.arrayList.set(index, updatedData);
				System.out.println("Data updated");
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("Invalid index");
			}
		
	}
	
	public void deleteData(Scanner sc)
	{
		System.out.println("Enter the index of list you want to delete");
		int index = sc.nextInt();
		try {
			System.out.println("Deleted data is "+this.arrayList.remove(index));
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Invalid index");
		}
		
	}
	public void readAllData()
	{
		System.out.println(arrayList);
	}
	
	public void readData(Scanner sc)
	{
		System.out.println("Enter the index of the data you want to read");
		int index = sc.nextInt();
		try
		{
			System.out.println("The data at index "+index+" is "+this.arrayList.get(index));
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Invalid index");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menu obj = new Menu(new ArrayList<Integer>());
		boolean run = true;
		
		while(run)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a choice");
			System.out.println("Enter 1 to add");
			System.out.println("Enter 2 to update data");
			System.out.println("Enter 3 to delete data");
			System.out.println("Enter 4 to read all data");
			System.out.println("Enter 5 to read specific data");
			System.out.println("Enter 0 to exit");
			switch(sc.nextInt())
			{
				case 1:
					obj.addData(new Scanner(System.in));
					break;
				case 2:
					obj.updateData(new Scanner(System.in));
					break;
				case 3:
					obj.deleteData(new Scanner(System.in));
					break;
				case 4:
					obj.readAllData();
					break;
				case 5:
					obj.readData(new Scanner(System.in));
					break;
				case 0:
					run = false;
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}

}
