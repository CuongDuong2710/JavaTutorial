package command_pattern;

import java.util.List;

public class TurnItAllOff implements Command{
	
	// list of all devices
	List<ElectronicDevice> theDevices;
	
	public TurnItAllOff(List<ElectronicDevice> newDevices) {
		
		theDevices = newDevices;
		
	}
	
	// Turn off all devices
	@Override
	public void execute() {
		
		for(ElectronicDevice device : theDevices) {
			
			device.off();
			
		}
		
	}

	@Override
	public void undo() {

		for(ElectronicDevice device : theDevices) {
			
			device.on();
			
		}
	}

}
