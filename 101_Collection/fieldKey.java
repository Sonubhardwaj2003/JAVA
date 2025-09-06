
public class fieldKey {
    public static void main(String[] args) {
        String day="Monday";
        String res=""; //we manully store the result
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thrusday":
            case "Friday":
                res="weekday";
                break;
            case "Sturday":
            case "Sunday":
                res="weekend";
                break;
            default:
                res="Invalid day";
                break;
            
        }
        System.out.println("It is "+res);
    }
}
