package command_pattern;

public class TurnTVUp implements Command{

	// TurnTVOn works on all electronic devices
	ElectronicDevice theDevice;
	
	public TurnTVUp(ElectronicDevice newDevice) {
		
		theDevice = newDevice;
		
	}
	
	@Override
	public void execute() {
		
		theDevice.volumeUp();
		
	}

	@Override
	public void undo() {
		
		theDevice.volumeDown();
		
	}

}
