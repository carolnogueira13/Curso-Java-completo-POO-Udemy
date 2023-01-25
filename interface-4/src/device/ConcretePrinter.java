package device;

public class ConcretePrinter extends Device implements Printer{

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) { // veio de Device
		System.out.println("Printer processing: " + doc);
		
	}
	
	@Override
	public void print(String doc) { // veio da Interface Printer
		System.out.println("Printing: " + doc);
	}

}
