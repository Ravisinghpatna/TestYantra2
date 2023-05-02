package testYantra;
public class IPattern {
	public static void main(String[] args) {
		int n = 7; // number of characters in each row
		int row=3;
		for (int i = 1; i <=row; i++) {

			if(i==row/2+1) {
				for (int j = 1; j <=n/2; j++) {
					System.out.print(" ");
				} 
				System.out.print("b");
			}
			else {
				for (int j = 1; j <=n; j++) {

					if ((i + j) % 2 == 0) {

						System.out.print("a");
					} 
					else {
						System.out.print("b");
					}
				}
			}
			System.out.println();
		}

	}
}

//
//
//public class OutputPattern {
//	  public static void main(String[] args) {
//	    int n = 7; // number of characters in each row
//	    for (int i = 0; i < n; i++) {
//	      if (i % 2 == 0) {
//	        for (int j = 0; j < n; j++) {
//	          if (j % 2 == 0) {
//	            System.out.print("a ");
//	          } else {
//	            System.out.print("b ");
//	          }
//	        }
//	        System.out.println();
//	      } else {
//	        System.out.println("      b");
//	      }
//	    }
//	    for (int i = 0; i < n; i++) {
//	      if (i % 2 == 0) {
//	        System.out.print("b ");
//	      } else {
//	        System.out.print("a ");
//	      }
//	    }
//	  }
//	}