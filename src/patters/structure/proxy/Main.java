package patters.structure.proxy;

/**
 * Created by Alex on 22.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		ProxyProject proxyProject = new ProxyProject("http://vcom.www");
		proxyProject.run();
	}
}
