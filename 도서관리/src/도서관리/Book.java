package ��������;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

class Book {
	private static int booknumber;
	private String author;
	private String title;
	private String company;
	
	
	
	
	public Book(int booknumber, String author, String title, String company) {
		super();
		this.booknumber = booknumber;
		this.author = author;
		this.title = title;
		this.company = company;
	}




	public static Book addBookInfo() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ ������ �Է��ϼ���.");
		System.out.print("1.�̸�:");
		String title = s.nextLine();
		System.out.print("2.��ȣ:");
		String ISBN = s.nextLine();
		System.out.print("3.����:");
		String author = s.nextLine();
		System.out.print("4.ȸ��:");
		String company = s.nextLine();
		
		Book tmp= new Book(booknumber, author, title, company);
		
			
		return tmp;
	}




	




	public static int getBooknumber() {
		return booknumber;
	}




	public static void setBooknumber(int booknumber) {
		Book.booknumber = booknumber;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getCompany() {
		return company;
	}




	public void setCompany(String company) {
		this.company = company;
	}
	
	
  static int maxBookNum = 10;
	
	
	 static Book[] r = new Book[maxBookNum];
	 static int currentNum = 0;
	
	public static void addBook() {
		if(currentNum >= maxBookNum)
			{System.out.println("�ִ�ġ�ʰ�");
			return;}
		
		r[currentNum++] = Book.addBookInfo();
		System.out.println("����Ǿ����ϴ�.");
		
	}
	
	public static void bookListView() {
		if(currentNum == 0)
		{
		System.out.println("å�̾����ϴ�.");
		return;
		}
	
	
	for (int i =0; i<currentNum; i++)
		System.out.println(r[i].toString());
	return;
		
		
	}




	
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", company=" + company + "]";
	}

}
