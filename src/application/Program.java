package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exeptions.DomainExeption;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println("Room number ");

			int roomNumber = sc.nextInt();

			System.out.println("Check-in date (dd/MM/yyyy):");

			Date checkin = sdf.parse(sc.next());

			System.out.println("Check-out date (dd/MM/yyyy):");

			Date checkout = sdf.parse(sc.next());

			Reservation resvation = new Reservation(roomNumber, checkin, checkout);

			System.out.println(resvation);
			System.out.println();

			System.out.println("Enter data to update the reservation:");

			System.out.println("Check-in date (dd/MM/yyyy):");

			checkin = sdf.parse(sc.next());

			System.out.println("Check-out date (dd/MM/yyyy):");

			checkout = sdf.parse(sc.next());

			resvation.UpdateDate(checkin, checkout);

			System.out.println(resvation);

			sc.close();
		} catch (ParseException e) {
		} catch (DomainExeption e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpectd error");
		}
	}

}
