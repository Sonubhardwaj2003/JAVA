import java.util.Arrays;

public class bubbleSortRec {
    public static void main(String[] args) {
        int arr[]={4,1,7,3,5,9,12,15,11,21,10};
        bubbleSort(arr,1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int arr[],int ind,int last){
        if(last==1) return;

        if(ind<=last){
            if(arr[ind]<arr[ind-1]){
                int temp=arr[ind];
                arr[ind]=arr[ind-1];
                arr[ind-1]=temp;
                bubbleSort(arr, ind+1, last);
            }else{
                bubbleSort(arr, ind+1, last);
            }
        }
        else{
            bubbleSort(arr, 1, last-1);
        }
        
        // System.out.println(Arrays.toString(arr));
    }
}
