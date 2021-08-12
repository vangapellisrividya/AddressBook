package com.bl.addressBook;

import java.util.Scanner;

public class AddressBook {
	public class Person {
		private String Firstname;
		private String Lastname;
		private String TempAddress;
		private String street;
		private String city;
		private String state;
		private String zip;
		private String phonenumber;
		private String email;

		public String getFirstname() {
			return Firstname;
		}

		public void setFirstname(String firstname) {
			this.Firstname = firstname;
		}

		public String getTempAddress() {
			return TempAddress;
		}

		public void setTempAddress(String TempAddress) {
			this.TempAddress = TempAddress;
		}

		public String getLastname() {
			return Lastname;
		}

		public void setLastname(String lastname) {
			this.Lastname = lastname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}


		@Override
		public String toString() {
			return "InputUtilities [Firstname=" + Firstname + ", Lastname=" + Lastname + ", TempAddress=" + TempAddress
					+ ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phonenumber="
					+ phonenumber + ", email=" + email + "]\n";
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		public String getPhoneNumber() {
			return phonenumber;
		}

		public void setPhoneNumber(String PhoneNumber) {
			this.phonenumber = PhoneNumber;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

	}

}
