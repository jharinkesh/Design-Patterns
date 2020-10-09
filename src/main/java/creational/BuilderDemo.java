package creational;

public class BuilderDemo {
    public static void main(String[] args) {
	Car.CarBuilder builder = new Car.CarBuilder("V-8", 4);
	builder.music("jbl");
	Car car = builder.build();
    }
}

class Car {
    // mandatory
    private String engine;
    private int wheels;
    // optional
    private String music;

    private Car(CarBuilder builder) {
	this.engine = builder.engine;
	this.wheels = builder.wheels;
	this.music = builder.music;
    }

    public static class CarBuilder {
	private String engine;
	private int wheels;
	private String music;

	public CarBuilder(String engine, int wheels) {
	    this.engine = engine;
	    this.wheels = wheels;
	}

	public CarBuilder music(String music) {
	    this.music = music;
	    return this;
	}

	public Car build() {
	    return new Car(this);
	}
    }
}