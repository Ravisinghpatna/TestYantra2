package modusSystems;

//public class PrimeNmber {
//	public static void main(String[] args) {
//		int n=5;
//		int count=0;
//			
//			for(int i=1;i<=n;i++) {
//				if(n%i==0) {
//					count++;
//				}
//			}
//		if(count==2) {
//			System.out.println("prime");
//		}
//		else
//			System.out.println("Not Prime");
//
//	}
//
//}

import java.util.Scanner;
public class PrimeNmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;
        
        // Check if the number is divisible by any number between 2 and num/2
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        
        
        
        
        
        
        int n=4, count=0;
        for(int i=1;i<=n;i++) {
        	if(n%i==0) {
        		count++;
        	}
        }
        if(count==2) {
        	System.out.print("Prime number without Scanner");
        }
        else {
        	System.out.println("Not Prime Number Scanner");
        }
    }
}

