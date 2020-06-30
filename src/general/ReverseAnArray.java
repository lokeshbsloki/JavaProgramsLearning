package general;

public class ReverseAnArray {

	public static void main(String[] args) {

		//reverseArray();
		int[] ar= {1,2,3,4,5,6,7,8,9};
		int[] res=ArraySwift(ar, 3);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+",");
		}
	}

	
	public static void reverseArray() {
		
		int[] ar= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+",");
		}
		System.out.println();
		int temp=ar[0];
		for(int i=1;i<ar.length;i++) {
			ar[i-1]=ar[i];
		}
		ar[ar.length-1]=temp;
	
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+",");
		}
	}
	
	
	public static int[] ArraySwift(int[] ar,int n) {
		
		while(n!=0) {
			
			int temp=ar[0];
			for(int i=1;i<ar.length;i++) {
				ar[i-1]=ar[i];
			}
			ar[ar.length-1]=temp;
			n--;	
		}
		
		return ar;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
