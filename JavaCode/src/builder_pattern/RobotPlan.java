package builder_pattern;

/**
 * Defines all the methods a Robot mus have
 * @author QUOC CUONG
 *
 */
public interface RobotPlan {
	
	public void setRobotHead(String head);
	
	public void setRobotTorso(String torso);
	
	public void setRobotArms(String arms);
	
	public void setRobotLegs(String legs);

}
