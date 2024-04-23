class Bank 
{
	public static void main(String[] args) 
	{
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();


		acc1.bankName = "HDFC";
		acc1.branchName = "Ameerpet";
		acc1.ifsc = "HD123AM";
		acc1.accNum = 5678567;
		acc1.accHName = "HK";
		acc1.balance = 2000L;
		System.out.println("acc1 instances are initialized");

		acc2.bankName = "HDFC";
		acc2.branchName = "Ameerpet";
		acc2.ifsc = "HD123AM";
		acc2.accNum = 5678568;
		acc2.accHName = "BK";
		acc2.balance = 200000L;
		System.out.println("acc2 instances are initialized");

		System.out.println("\nacc1 object values");
		System.out.println("acc1.bankName ="+acc1.bankName);
		System.out.println("acc1.branchName ="+acc1.branchName);
		System.out.println("acc1.ifsc ="+acc1.ifsc);
		System.out.println("acc1.accNum ="+acc1.accNum);
		System.out.println("acc1.accHName ="+acc1.accHName);
		System.out.println("acc1.balance ="+acc1.balance);

		
		System.out.println("\nacc2 object values");
		System.out.println("acc2.bankName ="+acc2.bankName);
		System.out.println("acc2.branchName ="+acc2.branchName);
		System.out.println("acc2.ifsc ="+acc2.ifsc);
		System.out.println("acc2.accNum ="+acc2.accNum);
		System.out.println("acc2.accHName ="+acc2.accHName);
		System.out.println("acc2.balance ="+acc2.balance);



	}
}

