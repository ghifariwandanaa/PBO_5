/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Week5;

/**
 *
 * @author Ghifari
 */
import java.util.Scanner;

public class RestaurantMain {
	
	public static void main(String[] args) {
		Scanner Object = new Scanner(System.in);
		Restaurant menu = new Restaurant();
		menu.tambahMakanan();
		int temp = 0;
		while(temp != 1) {			
				menu.tampilMenuMakanan(); 				
				System.out.println();
				System.out.print("Pilih Makanan : ");
				int pilihan = Object.nextInt();
				menu.isOutOfStock(pilihan);
				System.out.print("Jumlah : ");
				int quantity = Object.nextInt();
				System.out.println();		
				pilihan = pilihan - 1;
				menu.beliMakanan(pilihan,quantity);				
		}
	}
}