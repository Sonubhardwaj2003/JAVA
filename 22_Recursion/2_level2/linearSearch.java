import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int arr[]={1,11,21,4,9,5,7,9,21};
        int target=9;

        // System.out.println(serach(arr, target, 0));

        // indexAllTarget(arr,target,0);
        // System.out.println(list);

        System.out.println(indexAllTarget2(arr, target, 0));
    }

    static int serach(int arr[],int target,int index){
        //base condition
        if(index==arr.length){
            return -1 ;
        } 

        if(arr[index]==target){
            return index;
        } else{
            return serach(arr, target, index+1);
        }
    }

    //this metohod retun all the index on which target is present
    static ArrayList<Integer> list=new ArrayList<>();
    static void indexAllTarget(int arr[],int target,int index){
        if(index==arr.length){
            return  ;
        } 

        if(arr[index]==target){
            list.add(index);
        }
        
        indexAllTarget(arr, target, index+1);
        
    }



    static ArrayList<Integer> indexAllTarget2(int arr[],int target,int index){
        ArrayList<Integer> list2=new ArrayList<>();

        if(index==arr.length){
            return  list2;
        } 

        if(arr[index]==target){
            // this list contain index of one call only
            list2.add(index);
        }
        
        //this array list create a new object for each call of function and store index
        ArrayList<Integer> indexAll=indexAllTarget2(arr, target, index+1);
        //after finishing the calling of above function it goes to the each call and add the imdex of all returns
        list2.addAll(indexAll);
        
        return list2;
    }


}
