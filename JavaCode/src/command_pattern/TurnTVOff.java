package command_pattern;

public class TurnTVOff implements Command{

	// TurnTVOn works on all electronic devices
	ElectronicDevice theDevice;
	
	public TurnTVOff(ElectronicDevice newDevice) {
		
		theDevice = newDevice;
		
	}
	
	@Override
	public void execute() {
		
		theDevice.off();
		
	}

	@Override
	public void undo() {

		theDevice.on();
		
	}

}
