public class Bmw extends Auto {


    public Bmw(String mark, String model, int weight, int length, int width, int maxSpeed, int tankVol, int price, double cons) {
        super(mark, model, weight, length, width, maxSpeed, tankVol, price, cons);
    }

    @Override
    public void autoClass() {
        System.out.print(toString() + " - Business - 1");
    }
}
