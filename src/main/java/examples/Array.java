package examples;

public class Array {

	public static void main(String[] args) {
	int arr[]= {10,50,30,20,40};
	int arr1[]= {3,5,7,4,1};
	int a[]= {10,30,60,80,40};
	int b[]= {10,60,80,30,40};
	int a1[]= {10,20};
	
	System.out.println("Reverse an array");
	for (int i=arr.length-1; i>=0;i--) {
		System.out.println(arr[i]);
	}
	
	System.out.println("Sort an array as ascending order");
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			int dummy =0;
			if(arr[i]>arr[j]) {
				dummy= arr[i];
				arr[i]=arr[j];
				arr[j]=dummy;
				
			}
	
		}
		System.out.println(arr[i]);
	}
	
	System.out.println("Descending of above array");
	for(int i=arr.length-1; i>=0; i--) {
		System.out.println(arr[i]);
	}
		
	System.out.println("Sort second array as descending order");
	for (int i=0; i<arr1.length ; i++) {
		for(int j=i+1; j<arr1.length; j++) {
			int temp=0;
			if(arr1[i]<arr1[j]) {
				temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
				
			}
		}
	System.out.println(arr1[i]);
	}

System.out.println("Compare two array");
if(a.length!=b.length) {
	System.out.println("Enter array not equal");
	}
else
	for(int i=0;i<a.length;i++) {
		for (int j=i;j<a.length ;j++) {
			if(a[i]==b[j])
			
		
			System.out.println( a[i]);
		}
	}


System.out.println("Swap two numbers");
int temp=0;
if (a1[0]!=a1[1]) {
temp=a1[0];
a1[0]=a1[1];
a1[1]=temp;

System.out.println(a1[0]);
System.out.println(a1[1]);

		
	}
	  
	}
	
	}


