import java.util.*;
public class QuickSort{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] names=new String[n];
		for(int i=0;i<n;i++){
			names[i]=sc.next();
		}
		quicksort(names,0,n-1);
		for(int i=0;i<n;i++){
			System.out.print(names[i]+" ");
		}
	}
	public static void quicksort(String arr[],int low,int high){
		if(low<=high){
			int pivotindex=partition(arr,low,high);
			quicksort(arr,low,pivotindex-1);
			quicksort(arr,pivotindex+1,high);
		}
	}
	public static int partition(String arr[],int low,int high){
		String pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++){
			if(arr[j].compareTo(pivot)<=0){
				i++;
				String temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		String temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
}
