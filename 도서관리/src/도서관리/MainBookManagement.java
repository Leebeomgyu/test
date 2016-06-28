package 도서관리;
import java.util.Arrays;
import java.util.Scanner;

public class MainBookManagement {
	
	
	
	


	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		
		
		
			while(true)
			{
			
			System.out.println("도서관리프로그램입니다");
			System.out.println("1.도서등록");
			System.out.println("2.도서정렬");
			
			
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


