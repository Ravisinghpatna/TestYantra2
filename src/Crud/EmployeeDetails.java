package Crud;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class EmployeeDetails {
	private int empno;
	private String ename;
	private int salary;

	public EmployeeDetails(int empno, String ename, int salary) {
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
	}

	public int getempno(){
		return empno;
	}
	public String getename() {
		return ename;
	}

	public int getsalary() {
		return salary;
	}


	public  String toString() {
		return empno+" "+ename+" "+salary;	
	}
}

class CrudOperation{
	public static void main(String[] args) {

		

		List<EmployeeDetails> c=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		Scanner st=new Scanner(System.in);
		int ch;
		do {

			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Search");
			System.out.println("4. Delete");
			System.out.println("5. Update");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");

			ch=sc.nextInt();

			switch(ch) {
			case 1: System.out.print("Enter emp no");
			int eno = sc.nextInt();
			System.out.print("Enter ename ");
			String ename = st.nextLine();
			System.out.print("Enter salary");
			int sal =sc.nextInt();
			System.out.println("----------------------------");

			c.add(new EmployeeDetails(eno, ename, sal));
			break;

			case 2:
				Iterator<EmployeeDetails> i=c.iterator();
				while(i.hasNext()) {
					EmployeeDetails e=i.next();
					System.out.println(e);
				}
				System.out.println("----------------------------");
				break;


			case 3:
				boolean found=false;
				System.out.println("Enter emp no");
				int empno=sc.nextInt();
				i=c.iterator();
				while(i.hasNext()) {
					EmployeeDetails e=i.next();
					if(e.getempno()==empno) {

						System.out.println(e);
						found=true;
					}
				}
				if(!found)
				{
					System.out.println("Record not matching");
				}
				System.out.println("----------------------------");
				break;


			case 4:
				found=false;
				System.out.println("Enter empno to Delete ");
				empno=sc.nextInt();
				i=c.iterator();
				while(i.hasNext()) {
					EmployeeDetails e=i.next();
					if(e.getempno()==empno) {
						i.remove();
						found=true;
					}
				}
				if(!found)
				{
					System.out.println("Record not matching");
				}
				else {
					System.out.println("Record is deleted Successfully");
				}
				System.out.println("----------------------------");
				break;

			case 5:
				found=false;
				System.out.println("Enter empno to update ");
				empno=sc.nextInt();
				ListIterator<EmployeeDetails>li=c.listIterator();
				while(li.hasNext()) {
					EmployeeDetails e=li.next();
					if(e.getempno()==empno) {
						System.out.println("Enter new Name");
						ename=st.nextLine();

						System.out.println("enter new salary");
						sal=sc.nextInt();

						li.set(new EmployeeDetails(empno, ename, sal));
						found=true;
					}
				}
				if(!found)
				{
					System.out.println("Record not matching");
				}
				else {
					System.out.println("Record is Updated Successfully");
				}
				System.out.println("----------------------------");
				break;
				
			}

		}
		while(ch!=0);

	}
	
}

