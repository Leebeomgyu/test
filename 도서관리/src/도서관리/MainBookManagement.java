package ��������;
import java.util.Arrays;
import java.util.Scanner;

public class MainBookManagement {
	
	
	
	


	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		
		
		
			while(true)
			{
			
			System.out.println("�����������α׷��Դϴ�");
			System.out.println("1.�������");
			System.out.println("2.��������");
			
			
			int i = s.nextInt();
			switch (i) {
			case 1:
				Book.addBook();
				break;
				
				
				
			case 2:
				Book.bookListView();
				
				
				break;

			default:
				break;
			}
			
		}
		
	}

	}


