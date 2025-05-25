package practice2025;

public class NextPermutation {
	public static void main(String[] args) {
		int inp[]= {1,4,3,2};
	     int arr[] = nextperm(inp);
	     for (int i=0;i<arr.length;i++) {
	    	 System.out.println(arr[i]);
	     }
	}
	
	public static int[] nextperm(int[] inp) {
		
		int ind=-1;
		int n=inp.length;
		for(int i=n-2;i>=0;i--) {
			if(inp[i]<inp[i+1]) {
				ind=i;
				break;
			}
		}
		if(ind == -1) {
			reverse(inp,0,n-1);
			return inp;
		}
		for(int i=n-1;i>ind;i--) {
			if(inp[i]>inp[ind]) {
				swap(inp,i,ind);
				break;
			}
		}
		reverse(inp,ind+1,n-1);
		
		return inp ;
		
	}
	public static int[] reverse(int[] inp, int start, int end) {
		while(start<end) {
			int temp= inp[start];
			inp[start]=inp[end];
			inp[end]=temp;
			start++;
			end--;
		}
		return inp;
	}
	public static int[] swap(int[] inp, int a, int b) {
		int temp=inp[a];
		inp[a]=inp[b];
		inp[b]=temp;
		return inp;
	}
}
