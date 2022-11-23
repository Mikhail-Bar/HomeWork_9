public class Audi extends Auto{

    public Audi(String mark, String model, int weight, int length,
                int width, int maxSpeed, int tankVol, int price, double cons) {
        super(mark, model, weight, length, width, maxSpeed, tankVol, price, cons);
    }

    @Override
    public void autoClass() {
        System.out.print(toString() + " - Business - 2\n");
    }
}
