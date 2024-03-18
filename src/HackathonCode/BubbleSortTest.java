package HackathonCode;

public class BubbleSortTest {
	
	static int[] a= {5,4,3,88,22,44,11,43,12,99,101,87,301,403};
	
	//static int[] a= {5,4,3,7};

	

	public static int[] processSorting(int[] a) {
		int temp=0;
		for(int i=0;i<a.length;i++) {
			//below logic would take time , it will keep on sort till last element
			for(int j=0;j<a.length-1;j++) {
				
				if(a[j]>a[j+1]) {
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		
		return a;
	}
	
	public static void main(String args[]) {
		
		 int[] output = processSorting(a);
		
		  for (int number : output) {
	            System.out.println(number);
	        }
		
	}

}
