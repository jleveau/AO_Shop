package shop;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class ShopMain {

	public static void main(String[] args) {
		Stock stock = new Stock();
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, enter your commands here");
		while(true) {
			
			String command = sc.nextLine();

			if (command.equals("addFood")) {
				System.out.println("Add a new product");
				System.out.println("Name :");
				String name = sc.nextLine();
				System.out.println("Quantity:");
				int quantity = sc.nextInt();
				
				
				Product newProduct = new FoodProduct(name, quantity, ShopMain.getDateAfterNDays(3));
				stock.add(newProduct);
			}
			if (command.equals("display")) {
				System.out.println(stock.toString());
			}
		}
	}
	
	public static Date getDateAfterNDays(int n) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 3);
		return cal.getTime();
	}

}
