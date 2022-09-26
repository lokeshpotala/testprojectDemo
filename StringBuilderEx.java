package Lab18;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder strb = new StringBuilder("One fine monday morning!");
		strb.append("\nI wokeup and rushed to work");
		strb.append("\nI was late for the bus");
		System.out.println(strb.length());
		strb.append("\nI reached just in time");
		System.out.println(strb);
		System.out.println(strb.capacity());
		strb.insert(75, "\nI was worried");
		System.out.println(strb);
		strb.delete(100,104);
		strb.replace(9, 15, "friday");
		System.out.println(strb);

	}

}
