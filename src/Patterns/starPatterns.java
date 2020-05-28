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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
