package patters.шаблони_проектирования.TemplateMethod;

/**
 * Created by Alex on 24.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		WebSiteTemp news = new NewsPage();
		WebSiteTemp welcome = new WelcomePage();
		news.showPage();
		System.out.println("\n");
		System.out.println("\n");
		welcome.showPage();
	}
}
