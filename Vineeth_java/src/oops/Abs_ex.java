package oops;

abstract class Payment{
	abstract void pay(int amount);
	void showPaymentGateway() {
		System.out.println("Using Secure Payment Gateway...");
	}
}
class CreditCardPayment extends Payment{
	void pay(int amount) {
		System.out.println("Paid ₹"+amount+" in Credit Card");
		System.out.println(" ");
	}
}
class UPIPayment extends Payment{
	void pay(int amount) {
		System.out.println("Paid ₹"+amount+" in UPI");
		System.out.println(" ");
	}
}
class CashPayment extends Payment{
	void pay(int amount) {
		System.out.println("Paid ₹"+amount+" in Cash");
		System.out.println(" ");
	}
}
public class Abs_ex {
	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment();
		Payment p2 = new UPIPayment();
		Payment p3 = new CashPayment();
		p1.showPaymentGateway();
		p1.pay(5000);
		p2.showPaymentGateway();
		p2.pay(1000);
		p3.showPaymentGateway();
		p3.pay(500);
		
	}
}
