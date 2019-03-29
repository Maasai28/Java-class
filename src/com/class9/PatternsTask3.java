package com.class9;

public class PatternsTask3 {

	public static void main(String[] args) {
		/* Print the following pattern:
			1                    row=5
			12                 column<=row
			123                 1 12 123 1234 12345k
			1234
			12345*/
       for ( int i = 1; i<=5; i++) {
    	   for (int y=1; y<=i; y++) {
    		   System.out.print(y);
    	   }
      System.out.println();
       }   //------------------------------------------------------------------------
       /* Print the following pattern:
    	   *
    	   **
    	   ***
    	   ****
    	   *****
    	   ****
    	   ***
    	   **
    	   *  */
       for (int i = 1; i<=5; i++) {
    	   for (int y = 1; y < i; y++) {
    		   System.out.print("*");
    	   }
             System.out.println();  
       }
    		for (int i =6; i>1; i--) {               //for (int i=1; i<=4; i++) {
    			   for (int y =0; y<i; y++) {        //for (int y=4; y>=i; y--) {
    				                                 //system.out.print("*")
    				   System.out.print("*");         // }
    			   }                                   //  System.out.println();
    			  System.out.println();
    		}
//---------------------------------------------------------------------------   
	/*    ******
	       *****
	        ****
	         ***
	          **
	           */
	
	for (int i=6; i>0; i--) {
		for (int spc=6-i; spc>0; spc--) {
			System.out.print(" ");
		}
		 for (int j = 0; j<i; j++) {
			 System.out.print("*");
		 }
		System.out.println();	
	}//-------------------------------------------------------------------------------------
//	                                           *
//	                                           ***
//	                                          *****
//	                                         *******
//	                                        *********
//	                                       ***********
//	                                      *************
//	                                      *************
//	                                       ************
//	                                        **********
//	                                         ********
//	                                          ******
//	                                           ****
//	                                            **
//	                                             *
	                                         
	                                           
	int i,j; int r = 7; // half of the diamond
	for(i=0;i<=r;i++) {
		for (j=1; j<=r-1;j++) {
			System.out.println(" ");
			for (j=1;j<=2*i-1; j++) {
				System.out.print("*");
			}
				System.out.println();
			}
			for (i=r-1; i>=1;i--) {
				for(j=1; j<=2*i-1; j++) {
					System.out.print(" ");
					for (j=1; j<=2*i-1; j++) {
						
					
					System.out.print("*");
				}
			  System.out.println();
			}
		}
	}
	}                                           
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


