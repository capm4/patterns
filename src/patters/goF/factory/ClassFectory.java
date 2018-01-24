package patters.goF.factory;

/**
 * Created by Alex on 22.01.2018.
 */
public class ClassFectory {
	public static Base gerBase(int id){
		if(id == 1){
			return new First();
		}
		else if(id == 2){
			return new Second();
		}else throw new RuntimeException("No such id: "+ id);
	}
}
