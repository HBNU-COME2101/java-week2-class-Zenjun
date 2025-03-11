package week2_pre_20237143;

import java.util.Scanner;

public class chapter2_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("여행지 >> ");
	        String destination = scanner.nextLine();
	        
	        System.out.print("인원수 >> ");
	        int numberOfPeople = scanner.nextInt();
	        
	        System.out.print("숙박일 >> ");
	        int numberOfNights = scanner.nextInt();
	        
	        System.out.print("1인당 항공료 >> ");
	        int airfarePerPerson = scanner.nextInt();
	        
	        System.out.print("1방 숙박비 >> ");
	        int roomCostPerNight = scanner.nextInt();
	      
	        int numberOfRooms = (numberOfPeople + 1) / 2;
	        
	        int totalAirfare = numberOfPeople * airfarePerPerson;  
	        int totalRoomCost = numberOfRooms * roomCostPerNight * numberOfNights;  
	        int totalCost = totalAirfare + totalRoomCost;  
	        
	        System.out.println(numberOfPeople + "명의 " + destination + " " + numberOfNights + "박 " + (numberOfNights + 1) + "일 여행에는 " + numberOfRooms + "개 방이 필요하며 경비는 " + totalCost + " 원입니다.");
	        
	        scanner.close();
	}

}
