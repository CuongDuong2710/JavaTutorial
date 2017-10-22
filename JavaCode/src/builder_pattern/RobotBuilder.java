package builder_pattern;

/**
 * Defines what every Robot has
 * @author QUOC CUONG
 *
 */
public interface RobotBuilder {
	
	public void buildRobotHead();
	
	public void buildRobotTorso();
	
	public void buildRobotArms();
	
	public void buildRobotLegs();

	public Robot getRobot();

}
