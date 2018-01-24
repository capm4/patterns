package patters.шаблони_проектирования.Observe;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Alex on 23.01.2018.
 */
public class FileObserver implements Observer {
	@Override
	public void handlerEvend(List<String> vacancies) {
		File f;
		try{
			f = File.createTempFile("vacancie", "_txt");
			PrintWriter pw = new PrintWriter(f);
			pw.print(vacancies);
			pw.println();
			pw.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
