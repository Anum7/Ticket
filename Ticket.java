// Anum Bhamani CSC 2310 Homework 2
public class Ticket {
	private int number;
	private double price;
	
	public Ticket(int num){
		this.number=num;
	}
	public double getPrice(){
		return price;
	}
	public String toString(){
		return "Number: "+ number + ", Price: "+ getPrice(); 
	}
}

class WalkupTicket extends Ticket{
	private double price;
	public WalkupTicket(int number){
		super(number);
		this.price =50.0;
	}
	public double getPrice(){
		return price;
	}
}

class AdvanceTicket extends Ticket {
	private int days;
	private double price;
	public AdvanceTicket(int number, int days){
		super(number);
		this.days=days;
	}
	public double getPrice(){
			if(days>=10){
				 price=30.0;
			} else {
				price = 40.0;
			}
			return price;
		}
	}

class StudentAdvanceTicket extends AdvanceTicket{
	public StudentAdvanceTicket(int number, int days){
		super(number,days);	
	}
	public double getPrice(){
		double price1= super.getPrice();
		return price1 / 2;
	}
	public String toString(){
		return super.toString() + " (ID Required) ";
	}
}




