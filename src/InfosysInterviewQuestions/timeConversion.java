package InfosysInterviewQuestions;

import java.util.Scanner;

public class timeConversion {



	public static String Result(String s) {

		String period = s.substring(8);
		String minute = s.substring(3,5);
		String second = s.substring(6,8);
		String hour = s.substring(0,2);
		int hour1 = Integer.parseInt(hour);

		if(period=="AM") {
			if(hour1==12) {
				hour1=0;
			}
		}
		else {
			if(hour1!=12) {
				hour1+=12;
			}
		}

		String hourformat = String.format("%02d", hour1);

		return hourformat+":"+minute+":"+second;

	}


	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		String time = scanner.nextLine();

		String result = Result(time);
		
		System.out.println(result);


	}

}
