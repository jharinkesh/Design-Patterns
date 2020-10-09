package creational;

public class Singleton {

    public static void main(String[] args) {
	Main.getInstance().doStuff();
    }
}

class Main {
    private static Main main;

    private Main() {
    }

    public static Main getInstance() {
	if (main == null)
	    main = new Main();
	return main;
    }

    void doStuff() {
	System.out.println("doStuff()");
    }
}
