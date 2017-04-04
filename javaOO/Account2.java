package test;

public class Account2 {
private String owner;
private long balance;

public Account2(){super();}
public Account2(String owner){this.owner=owner;}
public Account2(long balance){this.balance=balance;}
public Account2(String owner, long balance){
	this.owner=owner;
	this.balance=balance;
}
public String getOwner(){return owner;}
public void setOwner(String owner){this.owner=owner;}
public long getBalance(){return balance;}
public void setBalance(long balance){this.balance=balance;}

public long deposit(long amount){
	long bal=this.balance+amount;
	this.balance=bal;
	System.out.println(amount+"원 입금하였습니다.\n잔액: "+(int)bal);
	return bal;
}
public long withdraw(long amount){
	long bal=this.balance-amount;
	System.out.println(amount+"원 출금하였습니다.\n잔액:"+(int)bal);
	this.balance=bal;
	return bal;
}
public static void main(String[] args){
	Account2 A1=new Account2(1000000);
	A1.withdraw(37000);
	A1.deposit(83000);
	A1.withdraw(500000);
	System.out.println(A1.getBalance());
}
}
