package javaClass.Programs_st2;

public class TextBlockExample {
	   public static void main(String[] args) {
		      String string = "{\n" 
		      + "   \"Name\" : \"Mahesh\",\n" 
		      + "   \"RollNO\" : \"32\"\n" 
		      + "}";  
 
		      System.out.println(string);

		      String textString = """
		      {
		         "Name" : "Mahesh",
		         "RollNO" : "32"
		      } 
		      """;
		      System.out.println(textString);
		   }   
		}
