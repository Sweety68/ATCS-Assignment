# ATCS-Assignment
import java.util.Scanner;

public class CountLettersInArray {
	static int n;
	 static char[] arr = new char[n];
	public static void createArray() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the length of array: ");
	     int n = sc.nextInt();
	     arr = sc.next().toCharArray();	
	     
		}
	
	
	
	 public static void display(char[] arr,int n) {
		
    	System.out.println("Display array: ");
    	for(int i= 0;i<arr.length;i++) {
    		System.out.print(arr[i]);
    	}
    	   }
	

   

 
   public static void main(String[] args) {
	   CountLettersInArray.createArray();
	   CountLettersInArray.display(arr,n);
	   
    }  

}
