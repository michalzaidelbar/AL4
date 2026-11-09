package il.ac.tau.cs.software1.pacman;

import il.ac.tau.cs.software1.components.*;

public class PacmanCherry extends PacmanBonus {

	public PacmanCherry(PacmanGridComponent initialPosition) {
		super(initialPosition);
		this.imageComponent = new ImageComponent("bonus-cherry");
		this.bonusScore = 30;
	}
}
