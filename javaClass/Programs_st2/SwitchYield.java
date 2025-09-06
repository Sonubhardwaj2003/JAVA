package javaClass.Programs_st2;

public class SwitchYield {
	public static void main(String args[]) {
		int number = 3;

		String msg = switch (number) {
			case 1:
				yield "got 1";
			case 2:
				yield "got 2";
			case 3:
				yield "got 3";
			case 4:
				yield "got 4";
			default:
				yield "got 5";
		};
		System.out.println(msg);
	}

}
