package za.ac.cput.Domain.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity
@Table(name="AccountHolder")
public class AccountHolder {
	@Id
	private String accountNumber;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String balance;

	public AccountHolder(AccountHolderBuilder builder){
		this.accountNumber = builder.accountNumber;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.address = builder.address;
		this.email = builder.email;
		this.balance = builder.balance;
	}

	public AccountHolder(){
		//empty constructor
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
//		Pattern research = Pattern.compile("^([A-Z0-9._%+-]+)@([A-Z0-9.-]+)\\.([A-Z]+)$", Pattern.CASE_INSENSITIVE);
//		Matcher searchm = research.matcher(email);
//		if (!searchm.find()){
//			this.email = email;
//		}
		//TODO - fix the regex pattern for validation on creation
		this.email = email;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AccountHolder that = (AccountHolder) o;
		return accountNumber.equals(that.accountNumber) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(address, that.address) && Objects.equals(email, that.email) && Objects.equals(balance, that.balance);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, firstName, lastName, address, email, balance);
	}

	@Override
	public String toString() {
		return "AccountHolder{" +
				"accountNumber='" + accountNumber + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", address='" + address + '\'' +
				", email='" + email + '\'' +
				", balance='" + balance + '\'' +
				'}';
	}

	public static class AccountHolderBuilder{
		public static String accountNumber;
		public static String firstName;
		public static String lastName;
		public static String address;
		public static String email;
		public static String balance;

		public AccountHolderBuilder(){
			this.accountNumber = accountNumber;
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.email = email;
			this.balance = balance;
		}

		public AccountHolderBuilder createAccountNumber(String accountNumber){
			this.accountNumber = accountNumber;
			return this;
		}

		public AccountHolderBuilder createFullName(String firstName, String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
			return this;
		}

		public AccountHolderBuilder createAddress(String address){
			this.address = address;
			return this;
		}

		public AccountHolderBuilder createEmail(String email){
			this.email = email;
			return this;
		}

		public AccountHolderBuilder createBalance(String balance){
			this.balance = balance;
			return this;
		}

		public AccountHolder build(){
			return new AccountHolder(this);
		}
	}
}
