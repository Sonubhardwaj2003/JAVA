package javaClass.Programs_st2;

public class SwitchExample {
	public static void main(String args[]) {
	String day="MONDAY";

	int numOfLetters = switch (day)
	{
	  case "MONDAY", "FRIDAY", "SUNDAY" ->  6;
	  case "TUESDAY"                -> 7;
	  case "THURSDAY", "SATURDAY"     -> 8;
	  case "WEDNESDAY"              -> 9;
	  default ->10;
	};
	System.out.println(numOfLetters);
	}
}
