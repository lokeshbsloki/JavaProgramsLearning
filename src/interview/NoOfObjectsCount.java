package interview;

public class NoOfObjectsCount {

	static int  noofobjectscount=0;
	
	{
		noofobjectscount++;
	}
	
	public NoOfObjectsCount() {
	}
	
	public NoOfObjectsCount(int n) {
		System.out.println(n);
	}
	public NoOfObjectsCount(String n) {
		System.out.println(n);
	}
	
	
	public static void main(String[] args) {
		
		NoOfObjectsCount test=new NoOfObjectsCount();
		NoOfObjectsCount test2=new NoOfObjectsCount(7);
		NoOfObjectsCount test3=new NoOfObjectsCount("hi anusha ok na ");
		
		System.out.println("no of objects created = "+NoOfObjectsCount.noofobjectscount);


	}
}
