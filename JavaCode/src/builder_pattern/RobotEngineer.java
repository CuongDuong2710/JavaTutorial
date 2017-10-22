package builder_pattern;

/**
 * The director / engineer class creates a Robot using the
 * builder interface that is defined (OldRobotBuilder).
 * The Director needing to know which methods of the Builder to call.
 * @author QUOC CUONG
 *
 */
public class RobotEngineer {
	
	private RobotBuilder robotBuilder;
	
	// OldRobotBuilder specification is sent to the engineer
	public RobotEngineer(RobotBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}
	
	public Robot getRobot() {
		return this.robotBuilder.getRobot();
	}
	
	public void makeRobot() {
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
	}

}
