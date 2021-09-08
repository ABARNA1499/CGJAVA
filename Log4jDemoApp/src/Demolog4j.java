import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Level;

public class Demolog4j {
	public static void main (String[] args) {
		Logger mylogger = Logger.getLogger(Demolog4j.class.getName());
		PropertyConfigurator.configure("resources/log4j.properties");
		int a=-1;
		boolean flag = false;
		mylogger.setLevel((Level)Priority.WARN);
		mylogger.info("logging information for log4j");
		mylogger.debug("code debugging started");
		if(a<0)
		{
			mylogger.warn("This is last time warning");
			
		}
		if (flag==false)
				{
			mylogger.error("Error occured due to false value");
				}
		
	}
}

	