package patters.goF.factoryMethod;

import java.util.Date;

/**
 * Created by Alex on 22.01.2018.
 */
public class DigitalWatch implements Watch {
	@Override
	public void showTime() {
		System.out.println(new Date());
	}
}
