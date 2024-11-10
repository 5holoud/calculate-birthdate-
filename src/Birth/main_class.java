package Birth;

import java.util.Scanner;
import java.time.LocalDateTime;

public class main_class {
	public static void main(String[] args) {
		//Call up the current date and time
		int CurrentYear=LocalDateTime.now().getYear();
		int currentMonth=LocalDateTime.now().getMonthValue();
		int currentDay= LocalDateTime.now().getDayOfMonth();
		int currentHour=LocalDateTime.now().getHour();
		int currentMinute=LocalDateTime.now().getMinute();
		int currentSecond=LocalDateTime.now().getSecond();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your full name : ");
		String fullName = scanner.nextLine();
		
		//input from user about birth year,month,day,hour ,minute,second
		System.out.println("Enter your Birth Year :");
		int BirthYear= scanner.nextInt();
		
		System.out.println("Enter your Birth Month :");
		int BirthMonth =scanner.nextInt();
		
		System.out.println("Enter your Birth Day :");
		int BirthDay =scanner.nextInt();
		
		System.out.println("Enter your Birth hour :");
		int BirthHour =scanner.nextInt();
		
		System.out.println("Enter your Birth minute :");
		int Birthminute =scanner.nextInt();
		
		System.out.println("Enter your Birth second :");
		int Birthsecond =scanner.nextInt();
		
		boolean isValid = true;
		if(BirthYear>CurrentYear||BirthYear<0) {
			System.out.println("invaild year .");
			isValid=false;
		}
		if((BirthMonth<0||BirthMonth>12)) {
			System.out.println("invaild month .");
			isValid=false;
		}
		if((BirthDay<0||BirthDay>31)) {
			System.out.println("invaild day.");
			isValid=false;
		}
		if(BirthHour<0||BirthHour>24) {
			System.out.println("invaild hour.");
			isValid=false;
		}
		if(Birthminute<0||Birthminute>60) {
			System.out.println("invaild minute.");
			isValid=false;
		}
		if(Birthsecond<0||Birthsecond>60) {
			System.out.println("invaild second.");
			isValid=false;
		}

		if(isValid) {
		int years = CurrentYear - BirthYear;
		int months = currentMonth - BirthMonth;
		int days = currentDay - BirthDay;
		int hours = currentHour-BirthHour;
		int minutes =currentMinute -Birthminute;
		int seconds =currentSecond-Birthsecond;

        if (seconds < 0) {
            seconds += 60;
            minutes -= 1;
        }
        if (minutes < 0) {
            minutes += 60;
            hours -= 1;
        }
        if (hours < 0) {
            hours += 24;
            days -= 1;
        }
			if(days<0) {
				if(currentMonth == 4 || currentMonth == 6 || currentMonth == 9 || currentMonth == 11) {
					days+=30;
				}
				else if(currentMonth == 1 || currentMonth == 3 || currentMonth ==5 || currentMonth == 7 || currentMonth == 8 || currentMonth == 10 || currentMonth==12) {
					days+=31;
				}
				else {
					if(CurrentYear % 4 == 0 && (CurrentYear % 100 !=0 || CurrentYear % 400==0)) {
						days+=29;
					}
					else {
						days+=28;
					}
				}
				months -=1;
			 }
		  
		
		if(months < 0) {
			years -= 1;
			months +=  12;
		}

		System.out.print("You have " + years+" years , "+months+ " months , "+days+" days , "+hours +" hours , "+minutes +" minutes , "+ seconds+" and seconds");
	 }
	}
}
