package application;

import entities.Mounth;
import entities.enums.MouthState;
import entities.exceptions.StoveException;

public class Application {

	public static void main(String[] args) throws StoveException {
		
		Mounth mounth1 = new Mounth();
		
		mounth1.increaseTemperature(15);
		
		System.out.println("temperatura: " + mounth1.getTemperature());

	}

}
