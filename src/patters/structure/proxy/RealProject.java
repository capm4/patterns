package patters.structure.proxy;

/**
 * Created by Alex on 22.01.2018.
 */
public class RealProject implements Project {
	String url;

	public RealProject(String url) {
		this.url = url;
		load();
	}
	private void load(){
		System.out.println("load url: "+ url+"....");
	}

	@Override
	public void run() {
		System.out.println("run projram "+ url+"....");
	}
}
