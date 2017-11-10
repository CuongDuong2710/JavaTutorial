package command_pattern;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
	
	public static void main(String[] args) {
		
		// get television
		ElectronicDevice newDevice = TVRemote.getDevice();
		
		// ----------TURN ON------------
		
		// command turn on
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		
		// invoker
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		// action
		onPressed.press();
		
		// -----------TURN OFF-----------
		
		// command turn off
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		
		// invoker
		onPressed = new DeviceButton(offCommand);
		
		// action
		onPressed.press();
		
		// -----------VOLUME UP-----------
		
		// command volume up
		TurnTVUp volUpCommand = new TurnTVUp(newDevice);
		
		// invoker
		onPressed = new DeviceButton(volUpCommand);
		
		// action
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
		// -----------TURN IT ALL OFF-----------
		
		Television theTV = new Television();
		
		Radio theRadio = new Radio();
		
		List<ElectronicDevice> allDevices = new ArrayList<>();
		
		allDevices.add(theTV);
		allDevices.add(theRadio);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
		
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		
		turnThemOff.press();
		
		// -----------UNDO----------
		
		turnThemOff.pressUndo();
		
	}

}
