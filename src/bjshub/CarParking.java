package bjshub;

import java.util.Scanner;

public class CarParking {
	String vehicle_no;
	String vehicle_type;
	String vehicle_model;
	long phone_no;
	String customer_name;
	String checkIn_time;

	CarParking(String vehicle_no,String vehicle_type,String vehicle_model,long phone_no,String customer_name,String checkIn_time)
	{
		this.vehicle_no=vehicle_no;
		this.vehicle_type=vehicle_type;
		this.vehicle_model=vehicle_model;
		this.phone_no=phone_no;
		this.customer_name=customer_name;
		this.checkIn_time=checkIn_time;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CarParking bike1=new CarParking("BR01XX7702", "PERTOL", "IGNITOR",9908906112L ,"AKASH","23:12" );
		CarParking bike2=new CarParking("BR01DX7002", "DIESEL", "R15",9908465466L ,"PRITAM","10:15" );
		CarParking bike3=new CarParking("BR0TTX8002", "ETHANOL", "RS200",9908943560L ,"PANDAY","12:20" );
		CarParking bike4=new CarParking("BR01CY7362", "DIESEL", "LIVO",9908945678L ,"SANTOSH","11:30" );
		CarParking bike5=new CarParking("BR01PX7710", "ETHANOL", "DISCOVER125",9568906112L ,"RAVI","22:43" );

		CarParking parkinglist[]= {bike1,bike2,bike3,bike4,bike5};

		String checkInTime;
		String currentTime=String.valueOf(java.time.LocalTime.now());

		String checkOutTime=currentTime.substring(0, 5);
		System.out.println("Please enter the vehicle number");

		String st=sc.nextLine();

		Boolean flag=false;
		for(int i=0;i<parkinglist.length;i++)
		{
			if(st.equalsIgnoreCase(parkinglist[i].vehicle_no))
			{
				System.out.println("Hi Dear Customer");
				System.out.println("Your Vehicle no :"+parkinglist[i].vehicle_no);
				System.out.println("Your Vehicle type :"+parkinglist[i].vehicle_type);
				System.out.println("Your Vehicle model :"+parkinglist[i].vehicle_model);
				System.out.println("Your phone no :"+parkinglist[i].phone_no);
				System.out.println("Your Customer name :"+parkinglist[i].customer_name);
				System.out.println("Your CheckIn Time :"+parkinglist[i].checkIn_time);
				System.out.println("Your CheckOut Time :"+checkOutTime);
				checkInTime=parkinglist[i].checkIn_time;

				flag=true;

				String hourStart=checkInTime.substring(0, 2);
				String hourEnd=checkOutTime.substring(0, 2);
				int totalHour=Integer.parseInt(hourEnd)-Integer.parseInt(hourStart);

				String minuteStart=checkInTime.substring(3, 5);
				String minuteEnd=checkOutTime.substring(3, 5);
				int totalMinute = Integer.parseInt(minuteEnd)-Integer.parseInt(minuteStart);

				int totalAmount=((totalHour*60 +totalMinute-1)/30)*10+10;
				
				System.out.println("Total amount need to pay "+totalAmount);
				break;

			}
		}

		if(flag==false)
		{
			System.out.println("Please Enter a valid input");
		}

	}
}

