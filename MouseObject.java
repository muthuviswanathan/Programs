package inheritance.simple;

public class MouseObject extends InputDevice{

	public static void main(String[] args) {
		MouseObject mouseObject = new MouseObject();
		mouseObject.inputDev = "Mouse is an input device";
		System.out.println(mouseObject.inputDev);
		mouseObject.actionsPerformed();
	}
}