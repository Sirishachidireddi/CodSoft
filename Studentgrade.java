import java.util.*;
class Read
{
    static int tel,hin,eng,math,sci,soc;
    void readdata()
	{
		System.out.println("enter marks of the subjects");
		System.out.print("Telugu"+" "+"Hindi"+" "+"English"+" "+"Maths"+" "+"Science"+" "+"Social");
		Scanner in=new Scanner(System.in);
		tel=in.nextInt();
		hin=in.nextInt();
		eng=in.nextInt();
		math=in.nextInt();
		sci=in.nextInt();
		soc=in.nextInt();
	}
}
class Sumdata extends Read
{
     int sum;
     void Summarks()
	{
		sum=tel+hin+eng+math+sci+soc;   
                System.out.println("Sum="+sum);
	}
}
class Findgrade extends Sumdata
{
	void averagemarks()
	{  
	   float average;
		average=(float)(sum)/6;
		System.out.println("Average="+average);
		
		if(average>=90)
		{
			System.out.println("A+");
		}
		else if((average<90)&&(average>=80))
		{
			System.out.println("A grade");
		}
		else if((average<80)&&(average>=70))
		{
			System.out.println("B grade");
		}
		else if((average<70)&&(average>=60))
		{
			System.out.println("C grade");
		}
		else if((average<60)&&(average>=50))
		{
			System.out.println("D grade");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
class Studentgrade
{
	public static void main(String args[])
	{
		
		Findgrade obj=new Findgrade();
		obj.readdata();
		obj.Summarks();
		obj.averagemarks();
		
	}
}