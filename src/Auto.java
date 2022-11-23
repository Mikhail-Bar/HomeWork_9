public class Auto {

    private String mark,model;
    private int weight, length, width, maxSpeed, tankVol, Price;

    private double cons;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getTankVol() {
        return tankVol;
    }

    public void setTankVol(int tankVol) {
        tankVol = tankVol;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
    public double getCons() {
        return cons;
    }

    public void setCons(double cons) {
        this.cons = cons;
    }

    @Override
    public String toString() {
        return "Mark auto: " + mark +
                ", model: " + model +
                ", weight: " + weight +
                ", length: " + length +
                ", width: " + width +
                ", max speed: " + maxSpeed +
                ", tank: " + tankVol +
                ", consumption: " + cons +
                ", price: " + Price +"$"+
                "}";
    }
    public void autoClass(){
        System.out.print( toString() + " - Classic\n");
    }
    public Auto(String mark, String model, int weight, int length, int width, int maxSpeed, int tankVol , int price, double cons) {
        this.mark = mark;
        this.model = model;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.maxSpeed = maxSpeed;
        this.tankVol = tankVol;
        this.Price = price;
        this.cons = cons;
    }



}
/*
10. Таксопарк. Определить иерархию легковых автомобилей. Создать таксо-
парк. Подсчитать стоимость автопарка. Провести сортировку автомобилей
парка по расходу топлива. Найти автомобиль в компании, соответствую-
щий заданному диапазону параметров скорости.
*/