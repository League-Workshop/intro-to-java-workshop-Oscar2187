package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot click=new Robot ();
		click.penDown();
		click.setSpeed(100);
		for(int i=0; i<4; i++) {
			click.move(100);
			click.turn(90);
		}
	}   
}
