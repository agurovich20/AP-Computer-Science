public class BankAccount {
	String Name;
	String Password;
	int PIN;
	int AccountNumber;
	double Balance;
	public void SetName(String NameInput){
		Name = NameInput;
	}
	public void main(String[] args){
		SetName("Tater Tots");
		System.out.println(Name);
	}
}

