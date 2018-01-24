package patters.grasp;

/**
 * Created by Alex on 19.01.2018.
 */
public class Program {
	public static void main(String[] args) {
//		DeveloperFactory developerFactory = createDeveloperFactory("java");
		Developer d = Factory.getDeveloper("c++");
		d.writeCode();
	}
//	static DeveloperFactory createDeveloperFactory(String s){
//		if(s.equalsIgnoreCase("java")){
//			return new JavaDeveloperFactory();
//		}else if(s.equalsIgnoreCase("c++")){
//			return new CppDeveloperFactory();
//		}else {
//			throw new RuntimeException(s +" no such specialiti");
//		}
//	}
}
