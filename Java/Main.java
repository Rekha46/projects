
import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
data ob=new data();
ob.RoomAllocate();
	Boolean isvalid=true;
	while(isvalid)
	{
		System.out.println("-----------VR HOTEL-----------");
		System.out.println("	1.Room Rent");
		System.out.println("	2.Check In");
		System.out.println("	3.Food");
		System.out.println("	4.Your Bil");
		System.out.println("	5.Check Out");
		System.out.println("	6.Exit");
			Boolean isChoice=true;
			int a=0;
			while(isChoice)
			{
			try
			{
			 Scanner sc1=new Scanner(System.in);
			System.out.println("Enter Your choice: ");
			a=sc1.nextInt();isChoice=false;
			}
			catch(Exception e)
			{
			System.out.println("Please Check Your Choice!");isChoice=true;
			}
			}
	switch(a)
	{
	case 1:
		ob.RoomRent();
		break;
      
	case 2:
                                   ob.checkIn();
		break;
	case 3:
		ob.Food();
		break;
	case 4:
		ob.YourBill();
		break;
	case 5:
		ob.checkOut();
		break;
	case 6:
		isvalid=false;
		System.out.println("*------------- Thank You -----------*");
		break;
	default:
		System.out.println("Please Enter Correct Option!");
		break;
	}
		}//while loop
}//main class
}//class name

class data 
{
HashMap<Integer,HotelManagement> sinAc=new HashMap<Integer,HotelManagement>();
ArrayList<Integer> f1=new ArrayList<Integer>();
ArrayList<Integer> s1=new ArrayList<Integer>();
ArrayList<Integer> f2=new ArrayList<Integer>();
ArrayList<Integer> s2=new ArrayList<Integer>();
ArrayList<Integer> f3=new ArrayList<Integer>();
ArrayList<Integer> s3=new ArrayList<Integer>();
ArrayList<Integer> f4=new ArrayList<Integer>();
ArrayList<Integer> s4=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
HotelManagement x;
public void RoomAllocate()
{
	f1.add(201);f1.add(202);f1.add(203);f1.add(204);f1.add(205);f1.add(206);f1.add(207);f1.add(208);f1.add(209);f1.add(210);
	f2.add(211);f2.add(212);f2.add(213);f2.add(214);f2.add(215);f2.add(216);f2.add(217);f2.add(218);f2.add(219);f2.add(220);
	f3.add(221);f3.add(222);f3.add(223);f3.add(224);f3.add(225);f3.add(226);f3.add(227);f3.add(228);f3.add(229);f3.add(230);
	f4.add(231);f4.add(232);f4.add(233);f4.add(234);f4.add(235);f4.add(236);f4.add(237);f4.add(238);f4.add(239);f4.add(240);
}
public void checkIn()
{
boolean isroom=true;
	while(isroom)
	{
      		System.out.println("	1.Single Bed With A/C ("+f1.size()+") Rooms are available");
      		System.out.println("	2.Double Bed With A/C ("+f2.size()+") Rooms are available");
      		System.out.println("	3.Single Bed Without A/C ("+f3.size()+") Rooms are available");
     		 System.out.println("	4.Double Bed Without A/C ("+f4.size()+") Rooms are available");
      		System.out.println("	5.Exit");
  			 Boolean isChoice=true;
			int choice=0;
			while(isChoice)
			{
			try
			{
			 Scanner sc1=new Scanner(System.in);
			System.out.println("Enter Your choice: ");
			choice=sc1.nextInt();isChoice=false;
			}
			catch(Exception e)
			{
			System.out.println("Please Enter Correct Choice!");isChoice=true;
			}
			}
      	switch(choice)
      	{
      		 case 1:       
           		{	
			if(f1.size()!=0)
			{
			System.out.println("1 day payment is $5000 in the Room");
			System.out.println("Check in the Room (Y/ N: )");
			String booking=sc.next().toUpperCase();
			if(booking.equals("YES"))
			{
			System.out.println("Enter the Room Count: ");
			int room=sc.nextInt();
				if(f1.size()>=room)
				{
				System.out.println("Enter the Name: ");
				String name=sc.next();
				System.out.println("Enter the Mobile Number: ");
				Long mob=sc.nextLong();
				while(Long.toString(mob).length()!=10)
				{
				System.out.println("      Please Enter the Correct Mobile Number:");
				Long NewMob=sc.nextLong();
				mob=NewMob;
				}
				System.out.println("Enter the Aadhar Number: ");
				Long Aadhar=sc.nextLong();
				while(Long.toString(Aadhar).length()!=12)
				{
				System.out.println("      Please Enter the Correct Aadhar Number:");
				Long NewAano=sc.nextLong();
				Aadhar=NewAano;
				}
				System.out.println("Enter the stay days ");
				int stay=sc.nextInt();	
				int amount=stay*5000;int food=0;int total=amount+food;
				System.out.println(" Your Room Number is: ");
				for(int i=0;i<room;i++)
				{
				s1.add(f1.get(i));
				sinAc.put(f1.get(i),new HotelManagement(name,mob,stay,amount,Aadhar,food,total));
				System.out.println(f1.get(i));
				}
				f1.removeAll(s1);
				System.out.println("---------------------Check In was Successfully-----------------------");
				}
				else
				{
				System.out.println((f1.size())+" Rooms are available in period!.");
				System.out.println("                   You have choose another better room            ");
				}
                  		//}
		//else
		//{
		//System.out.println("Ok");
		//}

			}
			else
			{
			System.out.println("This Type of Room is not avilable");
			}
                  break;
          }
       case 2:       
           {
	if(f2.size()!=0)
	{	
	System.out.println("	1 day payment is $4000 in the Room");
	/*System.out.println("Check in the Room (Yes (or) No: )");
	String booking=sc.next().toUpperCase();
		if(booking.equals("YES"))
		{*/
		System.out.println("Enter the Room Count: ");
		int room=sc.nextInt();
			if(f2.size()>=room)
			{
			System.out.println("Enter the Name: ");
			String name=sc.next();
			System.out.println("Enter the Mobile Number: ");
			Long mob=sc.nextLong();
			while(Long.toString(mob).length()!=10)
			{
			System.out.println("      Please Enter the Correct Mobile Number:");
			Long NewMob=sc.nextLong();
			mob=NewMob;
			}
			System.out.println("Enter the Aadhar Number: ");
			Long Aadhar=sc.nextLong();
			while(Long.toString(Aadhar).length()!=12)
			{
			System.out.println("      Please Enter the Correct Aadhar Number:");
			Long NewAano=sc.nextLong();
			Aadhar=NewAano;
			}
			System.out.println("Enter the stay days ");
			int stay=sc.nextInt();	
			int amount=stay*4000;int food=0;int total=amount+food;
			System.out.println(" Your Room Number is: ");
			for(int i=0;i<room;i++)
			{
			s2.add(f2.get(i));
			sinAc.put(f2.get(i),new HotelManagement(name,mob,stay,amount,Aadhar,food,total));
			System.out.println(f2.get(i));
			}
			f2.removeAll(s2);
			System.out.println("---------------Check In was Successfully------------------");
			}
			else
			{
			System.out.println((f2.size())+" Rooms are available in period!.");
			System.out.println("                   You have choose another better room            ");
			}
                		/*}
		else
		{
		System.out.println("OK");
		}*/
	}
	else
	{
	System.out.println("This Type of Room is not available");

	}
          break;
           }
       case 3:       
           {
	if(f3.size()!=0)
	{	
	System.out.println("	1 day payment is $3000 in the Room");
	/*System.out.println("Check in the Room (Yes (or) No: )");
	String booking=sc.next().toUpperCase();
		if(booking.equals("YES"))
		{*/
		System.out.println("Enter the Room Count: ");
		int room=sc.nextInt();
			if(f3.size()>=room)
			{
			System.out.println("Enter the Name: ");
			String name=sc.next();
			System.out.println("Enter the Mobile Number: ");
			Long mob=sc.nextLong();
			while(Long.toString(mob).length()!=10)
			{
			System.out.println("      Please Enter the Correct Mobile Number:");
			Long NewMob=sc.nextLong();
			mob=NewMob;
			}
			System.out.println("Enter the Aadhar Number: ");
			Long Aadhar=sc.nextLong();
			while(Long.toString(Aadhar).length()!=12)
			{
			System.out.println("      Please Enter the Correct Aadhar Number:");
			Long NewAano=sc.nextLong();
			Aadhar=NewAano;
			}
			System.out.println("Enter the stay days ");
			int stay=sc.nextInt();	
			int amount=stay*3000;int food=0;int total=amount+food;
			System.out.println(" Your Room Number is: ");
			for(int i=0;i<room;i++)
			{
			s3.add(f3.get(i));
			sinAc.put(f3.get(i),new HotelManagement(name,mob,stay,amount,Aadhar,food,total));
			System.out.println(f3.get(i));
			}
			f3.removeAll(s3);
			System.out.println("-------------------Check In was Successfully-------------");
			}
			else
			{
			System.out.println((f3.size())+" Rooms are available in period!.");
			System.out.println("                   You have choose another better room            ");
			}
		/*}
		else
		{
		System.out.println("OK");
		}*/
	}
	else
	{
	System.out.println("This Type of Room is not available");
	}
	break;
          }
       case 4:       
           {
	if(f4.size()!=0)
	{	
	System.out.println("	1 day payment is $2000 in the Room");
	/*System.out.println("Check in the Room (Yes (or) No: )");
	String booking=sc.next().toUpperCase();
		if(booking.equals("YES"))
		{*/
		System.out.println("Enter the Room Count: ");
		int room=sc.nextInt();
			if(f4.size()>=room)
			{
			System.out.println("Enter the Name: ");
			String name=sc.next();
			System.out.println("Enter the Mobile Number: ");
			Long mob=sc.nextLong();
			while(Long.toString(mob).length()!=10)
			{
			System.out.println("      Please Enter the Correct Mobile Number:");
			Long NewMob=sc.nextLong();
			mob=NewMob;
			}
			System.out.println("Enter the Aadhar Number: ");
			Long Aadhar=sc.nextLong();
			while(Long.toString(Aadhar).length()!=12)
			{
			System.out.println("      Please Enter the Correct Aadhar Number:");
			Long NewAano=sc.nextLong();
			Aadhar=NewAano;
			}
			System.out.println("Enter the stay days ");
			int stay=sc.nextInt();	
			int amount=stay*2000;int food=0;int total=amount+food;
			System.out.println(" Your Room Number is: ");
			for(int i=0;i<room;i++)
			{
			s4.add(f4.get(i));
			sinAc.put(f4.get(i),new HotelManagement(name,mob,stay,amount,Aadhar,food,total));
			System.out.println(f4.get(i));
			}
			f4.removeAll(s4);
			System.out.println("-------------Check In was Successfully--------------");
			}
			else
			{
			System.out.println((f4.size())+" Rooms are available in period!.");
			}
		/*}
		else
		{
		System.out.println("Ok");
		}*/
	}
	else
	{
	System.out.println("This Type of Room is not available ");
	System.out.println("                   You have choose another better room            ");

	}
	break;
          }
          case 5:
	{
	System.out.println("----------------Exit------------------");
	isroom=false;
	break;
	}
	default:
	System.out.println("             Please check the option     ");
       }//switch cse
}//while loop
}//checkIn Method close

public void checkOut()
{
	System.out.println("Enter the Room Number");
	int input=sc.nextInt();
	if(sinAc.containsKey(input))
	{
	 x=sinAc.get(input);
	System.out.println("Total Bill: "+x.total+"   Name: "+x.name);
	System.out.println("Enter the amount:");
	int cheout=sc.nextInt();
		if(x.total<=cheout)
		{
			if(201<=input&&210>=input)
			{
			f1.add(Integer.valueOf(input));
			System.out.println("Your Remainng Balance: "+(cheout-(x.total)));
			sinAc.remove(input);
			System.out.println("payed SuccessFully!!\n--------Welcome !----------");
			}
			else if(211<=input&&220>=input)
			{
			f2.add(Integer.valueOf(input));
			System.out.println("Your Remainng Balance: "+(cheout-(x.total)));
			sinAc.remove(input);
			System.out.println("payed SuccessFully!!\n-----------Welcome !----------");
			}
			else if(221<=input&&230>=input)
			{
			f3.add(Integer.valueOf(input));
			System.out.println("Your Remainng Balance: "+(cheout-(x.total)));
			sinAc.remove(input);
			System.out.println("payed SuccessFully!!\n------------Welcome !----------");
			}
			else if(231<=input&&240>=input)
			{
			f4.add(Integer.valueOf(input));
			System.out.println("Your Remainng Balance: "+(cheout-(x.total)));
			sinAc.remove(input);
			System.out.println("payed SuccessFully!!\n----------Welcome !---------");
			}
                  	 	}
		else if(x.total>cheout)
		{
			x.total=x.total-cheout;
			System.out.println("Your payed balance is:"+x.total);
		}
	}
else if(input>=201 && input<=240)
{
System.out.println(" This Room is Not Booked please first chekIn process");
}
	else
	{
	System.out.println("Please correct RoomNumber");
	}

}

public void YourBill()
{
Boolean isChoice=true;
int bal=0;
while(isChoice)
{
try
{
 Scanner sc1=new Scanner(System.in);
System.out.println("Enter Your RoomNumber: ");
bal=sc1.nextInt();isChoice=false;
}
catch(Exception e)
{
System.out.println("	please check the correct input opertion  ");isChoice=true;
}
}
		if(sinAc.containsKey(bal))
		{
		HotelManagement val=sinAc.get(bal);
		System.out.println("*********SRGAM Hotel Bill***********");
		System.out.println("------------Customer Details------------");
		System.out.println("Customer Name: "+val.name);
		System.out.println("Customer Mobile Number: "+val.mob);
		System.out.println("Customer Aadhar Number: "+val.Aadhar);
		System.out.println("Customer Room Number: "+bal);
		System.out.println("Your Room Rent: "+val.amount);
		System.out.println("Your food Balance: "+val.food);
		System.out.println("Your Total Bill Amount: "+val.total);
		System.out.println("--------Thank You ! Visit again ---------");
		}
		else
		{
		System.out.println("Please check Room Number");
		}
}

public void RoomRent()
{
System.out.println("------------------SRM HOTEL------------------");
      System.out.println("I-Single Bed with A/C Rooms are avilable in--------->"+f1.size()+" Rooms");
System.out.println("	One day payment is $5000     \n");
      System.out.println("II-Double Bed With A/C Rooms are available in------->"+f2.size()+" Rooms");
System.out.println("	One day payment is $4000 \n");
      System.out.println("III-Single Bed Without A/C Rooms are available in-------->"+f3.size()+" Rooms");
System.out.println("	One day payment is $3000 \n");
      System.out.println("IV-Double Bed Without A/C Rooms are available in------->"+f4.size()+" Rooms");
System.out.println("	One day payment is $2000 \n");
System.out.println("----------------------------X-------------------------");
}

public void Food()
{

	Boolean isChoice=true;
	int fono=0;
	while(isChoice)
	{
	try
	{
	 Scanner sc1=new Scanner(System.in);
	System.out.println("Enter the Room Number: ");
	fono=sc1.nextInt();isChoice=false;
	}
	catch(Exception e)
	{
	System.out.println("	please choose the correct operation");isChoice=true;
	}
	}

HotelManagement fod=sinAc.get(fono);
boolean isood=true;
while(isood)
{
	if(sinAc.containsKey(fono))
	{
	System.out.println("1.BreakFast-------->$200");
	System.out.println("2.Launch-------->$400");
	System.out.println("3.Dinner-------->$300");
	System.out.println("4.Dessets-------->$100");
	System.out.println("5.Cool Drinks-------->$80");
	System.out.println("6.Coffee-------->$50");
	System.out.println("7.Exit");
	System.out.println("Enter your Food: ");
		int count=sc.nextInt();
		boolean isFood=true;
		switch(count)
		{
		case 1:
			System.out.println("Enter the number of items:");
			int bf=sc.nextInt();
			fod.food+=bf*200;
			fod.total=fod.amount+fod.food;
			break;
		case 2:
			System.out.println("Enter the number of items:");
			int la=sc.nextInt();
			fod.food+=la*400;
			fod.total=fod.amount+fod.food;
			break;
		case 3:
			System.out.println("Enter the number of items:");
			int Di=sc.nextInt();
			fod.food+=Di*300;
			fod.total=fod.amount+fod.food;
			break;
		case 4:
			System.out.println("Enter the number of items:");
			int De=sc.nextInt();
			fod.food+=De*100;
			fod.total=fod.amount+fod.food;
			break;
		case 5:
			System.out.println("Enter the number of items:");
			int cd=sc.nextInt();
			fod.food+=cd*80;
			fod.total=fod.amount+fod.food;
			break;
		case 6:
			System.out.println("Enter the number of items:");
			int co=sc.nextInt();
			fod.food+=co*50;
			fod.total=fod.amount+fod.food;
			break;
		case 7:
			isood=false;
			System.out.println("Your Food balance: "+fod.food);
			System.out.println("------------------------------------------");
			break;
		default:
			System.out.println("	Please Enter the correct choice!	");
		}
       
	}
	else
	{
	System.out.println("	This Room is not available in Hotal so not Food provide");
	isood=false;
	}
}//while loop
}//food method close
}//data class close


class HotelManagement
{
String name;
Long mob;
int stay;
int amount;
Long Aadhar;
int food;
int total;
HotelManagement(String name,Long mob,int stay,int amount,Long Aadhar,int food,int total)
{
this.name=name;
this.mob=mob;
this.stay=stay;
this.amount=amount;
this.Aadhar=Aadhar;
this.food=food;
this.total=total;
}
}