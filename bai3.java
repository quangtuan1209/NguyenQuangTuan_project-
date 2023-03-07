import java.util.Scanner;
public class bai3 {
public static void main(String[] args) {
	String name;
	int year, year=2023;
	Scanner sc= new Scanner (System.in);
	System.out.println("nhap ho va ten :");
	Name = sc.nextLine();
	System.out.println("nhap nam sinh :");
	namsinh = sc.nextInt();
	if ((year - namsinh) < 16)
	System.out.println("you " + ten +" o do tuoi vi thanh nien");
	else if ( (year - namsinh)>=16 || (year - namsinh)< 18)
		System.out.println ("you " + name + " o do tuoi truong thanh");
	else
		System.out.println("you " + name +" da gia");
	
   }
}
