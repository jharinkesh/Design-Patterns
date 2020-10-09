package structural;

public class AdapterDemo {

    public static void main(String[] args) {
	Celsius cs = new CelsiusScale(4);
	Kelvin kl = new ScaleAdapter(cs);
	System.out.println(kl.getValueInKelvin());
    }
}

interface Celsius {
    float getValueInCelcius();
}

interface Kelvin {
    float getValueInKelvin();
}

class CelsiusScale implements Celsius {

    float val;

    CelsiusScale(float val) {
	this.val = val;
    }

    @Override
    public float getValueInCelcius() {
	return val;
    }
}

class ScaleAdapter implements Kelvin {

    Celsius scale;

    ScaleAdapter(Celsius scale) {
	this.scale = scale;
    }

    @Override
    public float getValueInKelvin() {
	return scale.getValueInCelcius() + 273;
    }

}
