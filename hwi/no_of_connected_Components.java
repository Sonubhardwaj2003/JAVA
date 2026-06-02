package hwi;
import java.util.Scanner;

public class no_of_connected_Components {
    static int findSet(int a,int[] parent){
        while(a!=parent[a]){
            a=parent[a];
        }
        
        return a;
    }
    static void union(int a,int b,int[] parent){
        while(a!=parent[a]){
            a=parent[a];
        }
        
        while(b!=parent[b]){
            b=parent[b];
        }
        
        if (a != b) {
            parent[b] = a;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no. of vertices :");
		int n=sc.nextInt();
		
		//makeSet
		int parent[]=new int[n];
		for(int i=0;i<n;i++){
		    parent[i]=i;
		}
		
		System.out.println("Enter no. of edges :");
		int e=sc.nextInt();

        int comp=n;
		
		for(int i=0;i<e;i++){
		    System.out.println("Enter edge points");
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    
		    
		    if(findSet(a,parent)!=findSet(b,parent)){
		        union(a,b,parent);
		        comp--;
		    }
		}

        System.out.println("Number of connected components: " + comp);
    }
}
