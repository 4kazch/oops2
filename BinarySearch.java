import java.util.*;
public class BinarySearch{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter sorted array: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter number to search: ");
		int key=sc.nextInt();
		int result=binarysearch(arr,0,n,key);
		if(result!=-1){
			System.out.println(key+" found at index "+result);
		}
		else{
			System.out.println(key+" not found");
		}
	}
	public static int binarysearch(int arr[],int low,int high,int key){
		while(low<high){
			int mid=(low+high)/2;
			if(arr[mid]==key){
				return mid;
			}
			else if(arr[mid]<key){
				low=mid+1;
			}
			else if(arr[mid]>key){
				high=mid-1;
			}
		}
		return -1;
	} 
}
