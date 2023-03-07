import java.util.Scanner;
public class bai4{

  public static void main(String[] args){
    int n;
    Scanner sc= new Scanner(System.in);
    do{
      
      System.out.println(" Nhap thang : ");
			n = sc.nextInt();
			if(n < 1 || n > 12)
			System.out.println(" Moi ban nhap lai thang : ");
		}while(n < 1 || n > 12);
		System.out.println("Thang"+ n);
	}
}   
