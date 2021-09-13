package class27.EastCteamProject2;

public class Car {
    private String color;
    private double carPrice;


    public Car (String color,double carPrice){
        this.color=color;
        this.carPrice=carPrice;


    }
    public double getSalePrice(){
        return carPrice;

    }
}
class Truck extends Car{
    private int weight;

    public Truck (String color, double carPrice,int weight){
        super(color,carPrice);
        this.weight=weight;

    }
    public double getSalePrice(){
        return super.getSalePrice() * (weight>2000 ? 0.80 : 0.70);
    }
}
class Sedan extends  Car{

private int lenghth;

public Sedan(String color,double carPrice,int lenghth){
    super(color,carPrice);
    this.lenghth=lenghth;

}
    public double getSalePrice(){
    return super.getSalePrice() * (lenghth< 20 ? 0.4 : 0.80);

    }
        }

