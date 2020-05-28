package Patterns;

public class starPatterns {

	public static void main(String[] args) {

		star1();
		star2();
		star3();
		star4();
		star5();
		star6();
		star7();
		star8();
		star9();
		star10();
		star11();
		star12();
		star13();
		star14();
		star15();
	}

//	*
//	**
//	***
//	****
	public static void star1() {

		System.out.println("star1");

		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

//	****
//	***
//	**
//	*
	public static void star2() {

		System.out.println("star2");

		for (int i = 0; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

//	****
//	 ***
//	  **
//	   *
	public static void star3() {

		System.out.println("star3");

		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print("*");

			}
			System.out.println();
			for (int k = 0; k < i; k++) {
				System.out.print(" ");

			}
		}
	}

//	*
//	**
//	***
//	****
//	***
//	**
//	*

	public static void star4() {

		System.out.println("star4");

		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		for (int i = 0; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
	
//	     *
//	    **
//	   ***
//	  ****
	
	public static void star5() {

		System.out.println("star5");

		for (int i = 1; i <= 4; i++) {

			for (int k = 3; k >= i; k--) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	 
//	     *
//	    **
//	   ***
//	  ****
//	   ***
//	    **
//	     *
	
	public static void star6() {

		System.out.println("star6");

		for (int i = 1; i <= 4; i++) {

			for (int k = 3; k >= i; k--) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for (int i = 1; i <= 3; i++) {

			for (int k = 0; k < i; k++) {
				System.out.print(" ");

			}
			for (int j = 3; j >= i; j--) {
				System.out.print("*");

			}
			System.out.println();

		}
	}
	//pyramid
//	   *
//	  * *
//	 * * *
//	* * * * 
	
	public static void star7() {

		System.out.println("star7");

		for (int i = 1; i <= 4; i++) {

			for (int k = 3; k >= i; k--) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
			
		}
	}
	
//	     *
//	    ***
//	   *****
//	  ******* 
	public static void star8() {

		System.out.println("star8");

		for (int i = 1; i <= 4; i++) {

			for (int k = 3; k >= i; k--) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int k=2;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
//	*******
//	 *****
//	  ***
//	   *
	public static void star9() {

		System.out.println("star9");

		for (int i = 1; i <= 4; i++) {

			for (int k = 2; k <= i; k++) {
				System.out.print(" ");

			}
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			for(int k=3;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
//	* 
//	 * 
//	  *
//	   *
//	    *
	public static void star10() {

		System.out.println("star10");

		for (int i = 1; i <= 5; i++) {

			for (int k = 1; k <= 5; k++) {

				if(i==k) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
//	        *
//	       *
//	      *
//	     *
//	    * 
	public static void star11() {

		System.out.println("star11");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if(i+j==6) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
//	*   *
//	 * * 
//	  *  
//	 * * 
//	*   *
	public static void star12() {

		System.out.println("star12");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if(i+j==6 || i==j) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
//	    *
//	   * *
//	  *   *
//	 *     *
//	*       *
	public static void star13() {

		System.out.println("star13");

		for (int i = 1; i <= 5; i++) {

		for(int j=4;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<(i*2);k++) {
			
			if(k>1 && k<(i*2)-1) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}
			System.out.println();
		}
	}
	
//	*     *
//	 *   *
//	  * *
//	   *
	
	public static void star14() {

		System.out.println("star14");

		for (int i = 1; i <= 4; i++) {

			for (int k = 2; k <= i; k++) {
				System.out.print(" ");

			}
			for (int j = 4; j >= i; j--) {
				if(j<4) {
				System.out.print(" ");
				}else
					System.out.print("*");
			}
			for(int k=3;k>=i;k--) {
				if(k>i) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
	}
	
//	*****
//	*   *
//	*   *
//	*   *
//	*****
	public static void star15() {

		System.out.println("star15");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if(i==1 || i==5 ||j==1 ||j==5) {
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
