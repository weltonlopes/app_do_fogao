package entities;

import entities.enums.MouthState;
import entities.exceptions.StoveException;

public class Mounth {

	private double temperature;
	private MouthState mouthState;

	public Mounth() {
		mouthState = MouthState.OFF;
	}

	public void setMouthState(MouthState mouthState) {
		this.mouthState = mouthState;
	}

	public MouthState getMouthState() {
		return mouthState;
	}

	public double getTemperature() {
		return temperature;
	}

	public void increaseTemperature(double temperature) throws StoveException {
		if (mouthState == MouthState.ON) {
			this.temperature += temperature;
		} else throw new StoveException("Mounth is OFF");
	}
}
