package cn.ck.factory.abstractfactory;

/**
 * ±¦Âí¹¤³§
 */
public class BWMFactory extends AbstractFactory {
    @Override
    public Car createCar() {
        return new BWM();
    }

    @Override
    public Wheel createWheel() {
        return new BWMWheel();
    }
}
