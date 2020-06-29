package Laptop;

public class LaptopFactory {
	public  Buy getInstance(String s) {
		if(s.equals("Normal Man")) 
			return new Dell();
		else if(s.equals("Rich Man"))
			return new Apple();
		else
			return new GovtLaptop();
		
	}

}
