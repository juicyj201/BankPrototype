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

	public AccountHolder(AccountHolderBuilder builder){
		this.accountNumber = builder.accountNumber;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.address = builder.address;
		this.email = this.email;
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
		Pattern research = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]+$", Pattern.CASE_INSENSITIVE);
		Matcher searchm = research.matcher(email);
		if (!searchm.find()){
			this.email = email;
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AccountHolder that = (AccountHolder) o;
		return Objects.equals(accountNumber, that.accountNumber) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(address, that.address) && Objects.equals(email, that.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, firstName, lastName, address, email);
	}

	@Override
	public String toString() {
		return "AccountHolder{" +
				"accountNumber='" + accountNumber + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", address='" + address + '\'' +
				", email='" + email + '\'' +
				'}';
	}

	public static class AccountHolderBuilder{
		public static String accountNumber;
		public static String firstName;
		public static String lastName;
		public static String address;
		public static String email;

		public AccountHolderBuilder(){
			this.accountNumber = accountNumber;
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.email = email;
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

		public AccountHolder build(){
			return new AccountHolder(this);
		}
	}
}
