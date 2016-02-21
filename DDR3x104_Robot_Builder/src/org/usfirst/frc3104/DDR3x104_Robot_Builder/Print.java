package org.usfirst.frc3104.DDR3x104_Robot_Builder;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Print {
	String clear = "                                  ";
	
	public void n(String key, double n) {
		SmartDashboard.putNumber(key, n);
	}
	
	public void s(String key, String txt){
		SmartDashboard.putString(key, txt);
	}
	
}
