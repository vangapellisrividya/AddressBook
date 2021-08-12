package com.bl.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bl.Addressbook.Person;

public class AddressBook {
	Scanner SC = new Scanner(System.in);
	List<Person> addressBookList = new ArrayList<Person>();
	Person person;
	private String phonenumber;
	private String street;
	private String city;
	private String state;

	public void add() {
		person = new Person();
		System.out.println(" Enter the Firstname");
		String Firstname = SC.next();
		person.setFirstname(Firstname);

		System.out.println(" Enter the Lastname ");
		String Lastname = SC.next();
		person.setLastname(Lastname);

		System.out.println(" Enter the temporary address");
		String Tempaddress = SC.next();
		person.setTempAddress(Tempaddress);

		System.out.println(" Enter the street ");
		String Street = SC.next();
		person.setStreet(Street);

		System.out.println(" Enter the city  ");
		String City = SC.next();
		person.setCity(City);

		System.out.println(" Enter the state ");
		String State = SC.next();
		person.setState(State);

		System.out.println(" Enter the zip ");
		String Zip = SC.next();
		person.setZip(Zip);

		System.out.println(" Enter the phonenumber ");
		String PhoneNumber = SC.next();
		person.setPhoneNumber(PhoneNumber);

		System.out.println(" Enter the email ");
		String email = SC.next();
		person.setEmail(email);

		addressBookList.add(person);
		System.out.println(addressBookList);

	}

	public void remove() {
		System.out.println(" Enter the Firstname");
		String Firstname = SC.next();
		for (int i = 0; i < addressBookList.size(); i++) {
			System.out.println(addressBookList.get(i));
			if (addressBookList.get(i).getFirstname().equals(Firstname)) {
				addressBookList.remove(i);
				System.out.println(" successfully removed ");
			}

		}
		System.out.println(addressBookList.size());
		System.out.println(addressBookList);

	}


		public String getPhoneNumber() {
			return getPhoneNumber();
		}

		public void setPhoneNumber(String PhoneNumber) {
			this.phonenumber = PhoneNumber;
		}

		public String getStreet() {
			return getStreet();
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return getCity();
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return getState();
		}

		public void setState(String state) {
			this.state = state;
		}

	}


