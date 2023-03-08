import java.util.Scanner;

public class bai 8 {
  
  public static void main (String[] args) {
    Scanner sc= new Scanner(System.in);
    int n,i, tbc=0;
    System.out.println("nhap so phan tu cua mang:");
    n=sc.nextInt();
    int A[] = new int[n];
    System.out.println("nhap gia tri cua tung phan tu:");
    for (i=0; i<n; i++)
	{
		System.out.println("nhap phan tu thu "+i+": ");
	A[i]= sc.nextInt();
	tbc+= A[i];
    } 
      System.out.println("Trung binh cong cua so nguyen la:"+tbc/n);
    }
  }
    
    
