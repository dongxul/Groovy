import java.util.ArrayList

public class Generics {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1)
		list.add(2.0)
		list.add("hello")

		println "List populated"
		for (int i in list) {
			println i
		}
	}
}