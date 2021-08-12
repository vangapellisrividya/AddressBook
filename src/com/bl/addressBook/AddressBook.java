package com.bl.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bl.Addressbook.AddressBook1;
import com.bl.Addressbook.Person;
public class AddressBook {
	private char[] addressBookList;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		List<Person> addressBookList = new ArrayList<Person>();
		AddressBook address = new AddressBook();
		Scanner SC = new Scanner(System.in);
		System.out.println(" operation y / n)");
		String choose = "yes";
		char select = choose.charAt(0);
		System.out.println(select);
		int value;
		do {
			System.out.println("1.add\n2.delete\n3.edit\n4.print\n5.exit");
			value = SC.nextInt();
			switch (value) {
			case 1:
				address.add();
				break;
			case 2:
				address.remove();
				break;
			case 3:
				address.edit();
				break;
			case 4:
				System.out.println(address.addressBookList);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("choose any one");

			}
		} while (select == 'y' || select == 'Y');
		System.out.println(" Thank you for the participation ");

	}

	
}
