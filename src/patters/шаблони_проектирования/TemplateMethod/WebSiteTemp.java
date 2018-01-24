package patters.шаблони_проектирования.TemplateMethod;

/**
 * Created by Alex on 24.01.2018.
 */
public abstract class WebSiteTemp {
	public void showPage(){
		System.out.println("Header");
		showPageContent();
		System.out.println("Footer");
	}

	protected abstract void showPageContent();
}
