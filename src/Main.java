public class Main {
    public static void main(String[] args) {
        TaxPark taxPark = new TaxPark("New York Taxi");
        taxPark.appendList(new Audi("Audi", "A4",1980,2200,1320,230,80, 66000,8.9));
        taxPark.appendList(new Auto("Audi", "A3",1520,2050,1560,210,55, 5500,6.5));
        taxPark.appendList(new Auto("Audi", "A2",1120,1820,1460,180,40, 6300,4.9));
        taxPark.appendList(new Bmw("BMW", "M3",1870,2100,1460,290,90, 133000,14.2));
        taxPark.appendList(new Bmw("BMW", "M5",2250,2250,1420,310,110, 145000,15.5));
        taxPark.appendList(new Bmw("BMW", "X3",2300,2130,1560,220,95,13500,11.3));
        taxPark.appendList(new Bmw("BMW", "X5",2240,2230,1610,240,120, 11500,12.9));

        System.out.print("**   Taxi fleet list   **\n");
        taxPark.printAuto();
        System.out.println("\n**   Total price   **");
        taxPark.parkPrice();
        System.out.println("\n**   List after sort by Cons   **");
        taxPark.sortByCons();
        System.out.println("\n***   List auto with maxSpeed   ***");
        taxPark.printAutoWithSpeed(220 , 100);
    }


}
/*
10. Таксопарк. Определить иерархию легковых автомобилей. Создать таксо-
парк. Подсчитать стоимость автопарка. Провести сортировку автомобилей
парка по расходу топлива. Найти автомобиль в компании, соответствую-
щий заданному диапазону параметров скорости.
*/