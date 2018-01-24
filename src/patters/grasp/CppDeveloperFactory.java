package patters.grasp;

/**
 * Created by Alex on 19.01.2018.
 */
public class CppDeveloperFactory implements DeveloperFactory {
	@Override
	public Developer createDeveloper() {
		return new CppDeveloper();
	}
}
