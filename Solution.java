public class Solution {
    public static void main(String[] args) {
        // int n=11; int h=n/2;
        // for(int i=0;i<=n/2;i++){
        //     for(int j=1;j<=i+1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=0;i<n/2 ;i++){
        //     for(int j=1;j<=h-i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // int n=5;
        // for(int i=0;i<2*n;i++){

        //     int totalCol= i>n?2*n-i:i;

        //     for(int j=0;j<totalCol;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }



        // int n=5;
        // for(int i=0;i<2*n;i++){

        //     int totalCol= i>n?2*n-i:i;

        //     int NoOfSpaces=n-totalCol;
        //     for(int k=0;k<NoOfSpaces;k++){
        //         System.out.print(" ");
        //     }

        //     for(int j=0;j<totalCol;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }



        // int n=5;
        // for(int i=1;i<=n;i++){
        //     int noOfSpaces=n-i;
        //     for(int j=1;j<=noOfSpaces;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=n-noOfSpaces;j>0;j--){
        //         System.out.print(j+" ");
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(j+1+" ");
        //     }
        //     System.out.println();
        // }




        // int n=4;
        // for(int i=1;i<=n;i++){
        //     int noOfSpaces=n-i;
        //     for(int j=1;j<=noOfSpaces;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=n-noOfSpaces;j>0;j--){
        //         System.out.print(j+" ");
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(j+1+" ");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<n;i++){
        //     int noOfCol=n-i;
        //     int noOfSpaces=n-noOfCol;
        //     for(int j=1;j<=noOfSpaces;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=n-noOfSpaces;j>0;j--){
        //         System.out.print(j+" ");
        //     }
        //     for(int j=1;j<=n-i-1;j++){
        //         System.out.print(j+1+" ");
        //     }
        //     System.out.println();
        // }




        int n=5;
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int valveAtEveryIndex=Math.min(Math.min(i, j),Math.min(n-i, n-j));
                System.out.print(valveAtEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
