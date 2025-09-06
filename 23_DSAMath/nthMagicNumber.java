public class nthMagicNumber {
    public static void main(String[] args) {
        //magic number is : convert number binary ,and then convert it ibto a number with some base and add.
        int num=5;  //5: 101=1*5^3 + 0*5^2 + 1*5^1 = 130;
        int base=5;
        int magicNum=0;

        while(num>0){
            int last=(num&1);  //gives the last binary digit
            num=num>>1; //right shift of number remove the last digit from the number
            magicNum+=last*base;
            base=base*5;   //each time base increase in powers 
        }

        System.out.println(magicNum);
    }
}
