package test;

public class Account {
 private String owner;
 private long balance;

public Account(long balance){
	super();
	this.owner=owner;
	this.balance=balance;
}
public Account(String owner,long balance){
	super();
	this.owner=owner;
	this.balance=balance;
}
public String getOwner(){
	return owner;
}
public void setOnwer(String owner){
	this.owner=owner;
}
public long getBalance(){
	return balance;
}
public void setBalance(long balance){
	this.balance=balance;
}
}
