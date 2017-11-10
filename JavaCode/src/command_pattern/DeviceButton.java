package command_pattern;

/**
 * Invoker - asks the command to carry out the request
 * It doesn't know what device or command is being used
 * @author QUOC CUONG
 *
 */
public class DeviceButton {
	
	Command theCommand;
	
	public DeviceButton(Command newCommand) {
		
		theCommand = newCommand;
		
	}
	
	public void press() {
		
		theCommand.execute();
		
	}
	
	public void pressUndo() {
		
		theCommand.undo();
		
	}

}
