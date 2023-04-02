//ROTATE ARRAY K TIMES
package practice;
import java.util.*;
public class Leetcode1 {
	void reverse(int[] arr,int low,int high) {
		while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
	}
	public static void main(String[] args) {
		 int arr[]= {1,2,3,4,5,6,7};                                                                             //   1 , 2 , 3 , 4 , 5 , 6 , 7
		 int k=3;												//                   <---k------>   step1
		 int len=arr.length;									//                                      reverse
		 Leetcode1 obj=new Leetcode1();							//                            <--len-k----->                step2
		 obj.reverse(arr,0,len-k-1);							//                               reverse
	       obj. reverse(arr,len-k,len-1);  						//                                       reverse whole array        step3
	        obj.reverse(arr,0,len-1);
	        for(int i=0;i<len;i++) {
	        	System.out.print(arr[i]+" ");
	        }
	}
	}

