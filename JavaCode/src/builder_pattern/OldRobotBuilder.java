package builder_pattern;

/**
 * Make a specific robot type base on RobotBuilder.
 * We can create new type robot by implementing RobotBuilder.
 * @author QUOC CUONG
 *
 */
public class OldRobotBuilder implements RobotBuilder {
	
	private Robot robot;
	
	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Blowtorch Arms");
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Roller Skates");
	}

	@Override
	public Robot getRobot() {
		return this.robot;
	}

}
