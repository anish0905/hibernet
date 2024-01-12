package com.Car;

import java.util.List;
import java.util.Scanner;

public class CarView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarController car = new CarController();
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter 1 to save \n  2 to update\n 3 to findById\n 4 to delete\n 5 to fetchall\n 6 to exist");

			int option = sc.nextInt();

			switch (option) {
			case 1: {
				System.out.println("Enter the car name");
				String name = sc.next();
				System.out.println("Enter the car color");
				String color = sc.next();
				System.out.println("Enter the cost");
				double cost = sc.nextDouble();

				Car c = new Car(name, color, cost);

				car.saveCar(c);
				break;

			}
			
			case 2:{
				System.out.println("Enter the car id");
				int id = sc.nextInt();
				System.out.println("Enter the car cost");
				double cost = sc.nextDouble();
				car.update(cost, id);
			
			}
			
			case 3:{
				
				System.out.println("Enter the car id");
				int id = sc.nextInt();
				Car c = car.findById(id);
				System.out.println(c);
	
				
				
			}
			
case 4:{
				
				System.out.println("Enter the car id");
				int id = sc.nextInt();
				Car c = car.delete(id);
				System.out.println(c +"Deleted");
		
			}


case 5:{
	List<Car> cars = car.fetchAll();
	for(Car car1:cars) {
		System.out.println(car1);
	}
	
}
			default:
				break;
			
			
			
			
			}

		}

	}

}
