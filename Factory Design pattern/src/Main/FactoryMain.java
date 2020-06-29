package Main;

import Laptop.Buy;
import Laptop.LaptopFactory;

public class FactoryMain {

	public static void main(String[] args) {
		LaptopFactory f=new LaptopFactory();
		Buy b=f.getInstance("Normal Man");
		b.spec();
		Buy b2=f.getInstance("Rich Man");
		b2.spec();
		Buy b3=f.getInstance("jhvjhd");
		b3.spec();
		

	}

}
