package patters.structure.proxy;

/**
 * Created by Alex on 22.01.2018.
 */
public class ProxyProject implements Project {
	String url;
	RealProject realProject;

	public ProxyProject(String url) {
		this.url = url;
	}


	@Override
	public void run() {
		if(realProject == null){
			realProject = new RealProject(url);
		}
		realProject.run();
	}
}
