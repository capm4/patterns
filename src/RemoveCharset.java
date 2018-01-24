/**
 * Created by Alex on 10.01.2018.
 */
public class RemoveCharset {
	static class Remove {
		public String removeC(String str, char ch){
			return str.replaceAll(Character.toString(ch), "");
		}
	}

	public static void main(String[] args) {
		Remove remove = new Remove();
		char c = 'ш';
		String s = remove.removeC("Кашашаша",c);
		System.out.println(s);
	}
}
