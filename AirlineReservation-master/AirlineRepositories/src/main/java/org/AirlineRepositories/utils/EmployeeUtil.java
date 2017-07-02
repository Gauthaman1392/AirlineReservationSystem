package org.AirlineRepositories.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.AirlineRepositories.entity.Flight;

public class EmployeeUtil {
	
	private static Scanner scanner ;//= new Scanner(System.in);

	public static int chooseOperation() throws InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("   MENU   ");
		System.out.println("1. Create Profile");
		System.out.println("2. Read(View) Profile");
		System.out.println("3. Update Profile");
		System.out.println("4. Delete Profile");
		System.out.println("5. Exit");


		System.out.print("Select a choice :");

		int id=scanner.nextInt();
		return id;
	}

	public static Flight readPassanger() throws Exception{
		scanner = new Scanner(System.in);
		boolean flag=true;
		while(flag==true){

			try{
				System.out.print("Enter flight id:");
				int airlineid = scanner.nextInt();
				
				System.out.print("Enter airline name:");
				String airline_name = scanner.next();

				System.out.print("Enter from location:");
				String from_location = scanner.next();

				System.out.print("Enter to location:");
				String to_location = scanner.next();

				System.out.print("Enter departure time: ");
				String dept_time = scanner.next();
				
				System.out.print("Enter arrival time: ");
				String arrival_time = scanner.next();

				System.out.print("Enter duration ");
				String duration = scanner.next();
				
				System.out.println("Enter the number of seats");
				Integer seats = scanner.nextInt();

				
			return new Flight(airlineid, airline_name, from_location, to_location, dept_time, arrival_time, duration,seats);
			}
			catch(InputMismatchException e){
				throw new Exception("Please enter valid data ");
			}

		}
		return null;
	}

}
