package threading;
// Create a class TaxCalculator that includes a final method calculateGST(double amount) which returns 18% GST.
// Now design a subclass OnlineTaxCalculator that:
// Adds an internet handling fee.
// Uses the final GST calculation method.
// Ensure GST logic is fixed and cannot be overridden.

class taxcal{
    public final double calculateGST(double amount){
        return amount;
    }
}

class OnlineTaxCalculator extends taxcal{
    private double intenetHandlingFee;
    public OnlineTaxCalculator(double intenetHandlingFee){
        this.intenetHandlingFee=intenetHandlingFee;
    }

    public double GST(double amount){
        double gst=calculateGST(amount);
        return gst+intenetHandlingFee;
    }
}

public class TaxCalculater {
    public static void main(String[] args) {
        OnlineTaxCalculator cal=new OnlineTaxCalculator(100);
        double amt=1000;
        System.out.println(cal.GST(amt));
    }
}
