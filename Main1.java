package Question3;

public class Main1 {

	public static void main(String[] args) {
		//create the instance of employee class and enter the value
		Address ad=new Address("N0037","Jotkeshab","Paschim Medinipur","West Bengal","721146");
		Department d=new Department("ABCD1999","EE","Employee");
		Employee ep=new Employee("Suman Chowdhury",(byte)23,"8016303050",ad,"ABC_007",20000,d);
	
		 
		ep.displayemp();

	}

}