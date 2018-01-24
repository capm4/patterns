package patters.grasp;

/**
 * Created by Alex on 19.01.2018.
 */
public class Factory {
	public static Developer getDeveloper(String s){
		if(s.equalsIgnoreCase("java")){
			return new JavaDeveloper();
		}else if(s.equalsIgnoreCase("c++")){
			return new CppDeveloper();
		}else {
			throw new RuntimeException(s +" no such specialiti");
		}
	}

}
