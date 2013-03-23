import java.util.Scanner;
import java.io.*;


public class SearchMachine
{
	Scanner scan = new Scanner(System.in);

	String drives[] = {"C:/", "D:/", "E:/", "F:/","G:/","H:/","I:/"};
	String fileName;
	int driveIndex;
	String files[], innerFiles[];
	int flag=0, flag2=0;
	File f1, f2, f3;
	int i=0,j=0,k=0,l=0, m=0;


	public void getFileName()
	{
		System.out.println("ENTER THE FILE or FOLDER NAME : ");
		fileName = scan.nextLine();
	}
	public void getLocation()
	{
		System.out.println("WHERE DO YOU WANT TO SEARCH  : " + "\n0- C: \n1-D:\n2-E:\n3-F:\n4-G:\n5-H:\n6-I:\n7-ALL" );
		driveIndex = scan.nextInt();
	}

	public void fileSearch()
	{
		if(driveIndex!=7)
		{
			f1= new File(drives[driveIndex]);
			files = f1.list();

			try
			{
				do
				{
					for(i=0; files[i]!=""; i++)
					{
						if(fileName.equalsIgnoreCase(files[i]))
						{
							flag++;
							break;
						}

						for(m=0; m<files[i].length(); m++)
						{
							if(files[l].charAt(m)=='.')
							flag2++;
						}
						if(flag2==0)
						{
							f3= new File(drives[driveIndex]+files[i]);
							files = f3.list();
						}

					}
				}while()


			}catch(Exception e){}


		}

		if(driveIndex==7)
		{
			for(k=0; k<=6; k++)
			{
				f2 = new File(drives[k]);
				files = f2.list();
				try
				{
					for(j=0; files[j]!=""; j++)
					{
						if(fileName.equalsIgnoreCase(files[j]))
						{
							flag++;
							break;
						}
					}
				}catch(Exception e) { continue;}
				if(flag==1)
				break;

			}
		}
	}
	public void advancedSearch()
	{
		for(l=0; files[l]="";l++)
		{
			if(flag2==1)
			{
				f3 =








	public void display()
	{
		try{if(flag==0)
		System.out.println("FILE NOT FOUND ");
		else
		System.out.println("FILE FOUND "+ "\nIN "+ drives[k] );
		}catch(Exception e) {}
	}

	public static void main(String args [])
	{
		SearchMachine s= new SearchMachine();

		s.getFileName();
		s.getLocation();
		s.fileSearch();
		s.display();

	}


}