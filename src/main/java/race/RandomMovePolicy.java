package race;

import java.util.Random;

public class RandomMovePolicy implements MovePolicy {
	private static final int INCREASE_DISTANCE_NUMBER = 1;
	public static final int MOVE_POLICY_NUMBER = 4;
	public static final int MAX_RANDOM_NUMBER = 10;

	@Override
	public boolean move() {
		return randomNumber() >= MOVE_POLICY_NUMBER;
	}

	@Override
	public int distance() {
		return INCREASE_DISTANCE_NUMBER;
	}

	private int randomNumber() {
		return new Random().nextInt(MAX_RANDOM_NUMBER);
	}
}
