package command_pattern;

/**
 * Declares an interface for executing an operation.
 * Each command you want to issue will implement the Command interface.
 * @author QUOC CUONG
 *
 */
public interface Command {

	public void execute();
	
	public void undo();
	
}
