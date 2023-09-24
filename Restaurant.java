/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

/**
 *
 * @author Ghifari
 */

public class Restaurant {

		private Makanan[] makanan_resto;		
		private static byte id=0;
		
		public Restaurant() {
			makanan_resto = new Makanan[10];	
			
		}

		public void tambahMenuMakanan(String nama, double harga, int stok) {
			makanan_resto[id] = new Makanan();
			makanan_resto[id].setMakanan(nama);
			makanan_resto[id].setStok(stok);
			makanan_resto[id].setHarga(harga);
		}
		
		public void tampilMenuMakanan() {
			System.out.println("====================");
			System.out.println("MENU YANG TERSEDIA");
			System.out.println("====================");
			for(int i =0; i<=id;i++) {
				int a = i;
				if(!isOutOfStock(i)) {
					a++;
					System.out.println(a + ". " + makanan_resto[i].getMakanan() + "[" + makanan_resto[i].getStok() + "]" + "\tRp." + makanan_resto[i].getHarga());
				}else {
					a++;
					System.out.println(a + ". " + makanan_resto[i].getMakanan() + "\t\t Stock Habis");
				}			
			}
			
		}
		
		public void beliMakanan(int inputan, int quantity) {	
			if(!isOutOfStock(inputan)) {		
				makanan_resto[inputan].setStok(makanan_resto[inputan].getStok() - quantity);
				System.out.println(makanan_resto[inputan].getMakanan() + "\t\t" + makanan_resto[inputan].getStok() );
				TotalHarga(inputan,quantity);
			}else {
			
			}
		}
		
		public void TotalHarga(int id_harga, int jumlahbeli) {
			double TotalBayar = makanan_resto[id_harga].getHarga() * jumlahbeli;
			System.out.println("Total Harga :" + TotalBayar);
		}
		
		public boolean isOutOfStock(int id) {
			if(makanan_resto[id].getStok() == 0) {
				return true;
			}else {
				return false;
			}
		}		
		
		public void tambahMakanan() {
			this.tambahMenuMakanan("Nasi Goreng", 15000,10);
			Restaurant.nextId();
			this.tambahMenuMakanan("Mie Goreng", 10000, 0);
			Restaurant.nextId();
			this.tambahMenuMakanan("Telur Balado", 7000, 5);
			Restaurant.nextId();
			this.tambahMenuMakanan("Sayur Asem", 5000, 7);		
			Restaurant.nextId();
			this.tambahMenuMakanan("Ayam Bakar", 20000, 0);
			Restaurant.nextId();
			this.tambahMenuMakanan("Sayur Sop", 7000, 7);		
			Restaurant.nextId();
			this.tambahMenuMakanan("Tumis Kangkung", 5000, 10);
			Restaurant.nextId();
			this.tambahMenuMakanan("Pindang", 5000, 7);		
			Restaurant.nextId();
			this.tambahMenuMakanan("Tempe Goreng", 3000, 20);
			Restaurant.nextId();
			this.tambahMenuMakanan("Tahu Goreng", 3000, 20);
		}
		
		public static void nextId() {
			id++;
		}
}
