import java.util.Scanner;

public class courier
{
    private String name;
    private double weight;
    private String address;
    private double bill;
    private char type;
    
    public void accept() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter customer's name: ");
        name = in.nextLine();
        
        System.out.print("Enter recipient's address: ");
        address = in.nextLine();

        System.out.print("Enter parcel weight (in Kgs): ");
        weight = in.nextDouble();

        System.out.println("Enter courier type");
        System.out.print("D (Domestic), I (International): ");
        type = in.next().charAt(0);
    }
    
    public void calculate() {
        if (weight <= 5) {
            bill = weight * 800;
        } else if (weight <= 10) {
            bill = (5 * 800) + ((weight - 5) * 700);
        } else {
            bill = (5 * 800) + (5 * 700) + ((weight - 10) * 500);
        }

        if (type == 'I') {
            bill += 1500;
        }
    }
    
    public void print() {
        System.out.println("Customer's Name: " + name);
        System.out.println("Parcel Weight: " + weight + " Kgs");
        System.out.println("Recipient's Address: " + address);
        System.out.println("Type of Courier: " + type);
        System.out.println("Bill Amount: Rs." + bill);
    }

    public static void main(String[] args) {
        courier obj = new courier();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}