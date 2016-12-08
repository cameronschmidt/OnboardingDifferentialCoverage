package example;

public class One {
  String message = "foo";
  String message2 = "toto";

  public String foo() {
    return message;
  }

  public String toto() {
  if (message == "foo") {
      	return message2;
      }
	else {
	System.out.println("Will never get here");
	System.out.println("And will definitely never get here");
	return message;
	}
  }

  public void uncoveredMethod() {
    System.out.println(foo());
  }
}
