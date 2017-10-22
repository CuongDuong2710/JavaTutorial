package builder_pattern;

/**
 * The Client is the only one that needs to know about the new types.
 * @author QUOC CUONG
 *
 */
public class TestRobotBuilder {

	public static void main(String[] args) {
		
		// Tell engineer blue-print of old type robot
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
		// Robot Engineer will make a robot base on old type robot specification
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		
		// call function makeRobot()
		robotEngineer.makeRobot();
		
		// get a real robot
		Robot firstRobot = robotEngineer.getRobot();
		
		System.out.println("Robot Built");
		
		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
		System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
		System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());
	}
}
