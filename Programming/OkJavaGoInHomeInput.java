//입력 다이얼로그 창 이용
import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {

	public static void main(String[] args) {
		
		//다이얼로그 입력창 이용하는 매소드
		String id = JOptionPane.showInputDialog("Enter a ID");
		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
		//elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//밝기조절
		Lighting hallLamp = new Lighting(id+"/ Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+"/floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+"moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();

	}

}
