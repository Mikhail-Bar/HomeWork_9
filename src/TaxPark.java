import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TaxPark {

    private String TaxParkName;
    private ArrayList<Auto> autoList = new ArrayList<>();

    TaxPark(String taxParkName){
        this.TaxParkName = taxParkName;
    }


    public void appendList(Auto auto){
       autoList.add(auto);
    }

    public void printAuto(){
    for (Auto auto:autoList){
        auto.autoClass();
    }

    }
    public void printAutoWithSpeed(int maxSpeed, int minSpeed){
    for (Auto auto:autoList){
        if(auto.getMaxSpeed()> minSpeed && auto.getMaxSpeed()<maxSpeed){
            System.out.println("*** 4 ***");
            System.out.println(auto.toString());}
    }

    }

    public void sortByCons(){
      autoList.sort(Comparator.comparing(Auto::getCons));
      printAuto();
    }
    public void parkPrice(){
        int totalPrice = 0;
        for (Auto auto:
             autoList) {
        totalPrice=+totalPrice + auto.getPrice();

        }
        System.out.printf("\nTotal price of %s : %d$",TaxParkName,totalPrice);
    }
}

/*
10. Таксопарк. Определить иерархию легковых автомобилей. Создать таксо-
парк. Подсчитать стоимость автопарка. Провести сортировку автомобилей
парка по расходу топлива. Найти автомобиль в компании, соответствую-
щий заданному диапазону параметров скорости.
*/