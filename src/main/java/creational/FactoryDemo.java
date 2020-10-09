package creational;

public class FactoryDemo {

}

abstract class Gadget {
    int screen;

    abstract int getScreen();
}

class GadgetFactory {
    public static Gadget getInstance(String name, int screen) {
	if (name.equals("phone"))
	    return new Phone(screen);
	else if (name.equals("tablet"))
	    return new Tablet(screen);
	return null;
    }
}

class Phone extends Gadget {

    Phone(int screen) {
	this.screen = screen;
    }

    @Override
    int getScreen() {
	return this.screen;
    }
}

class Tablet extends Gadget {
    Tablet(int screen) {
	this.screen = screen;
    }

    @Override
    int getScreen() {
	return this.screen;
    }
}