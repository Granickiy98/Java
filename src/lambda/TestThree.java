package lambda;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class TestThree {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> al = new ArrayList<>();
        for (int i=0;i<3;i++){
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car,Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> carArrayList = createThreeCars(()->new Car("Opel Omega","Black",2.0));
        System.out.println("Our cars: "+carArrayList);

        changeCar(carArrayList.get(0)
                ,car -> {
            car.color = "Red";
            car.engine = 2.5;
                    System.out.println("Upgraded car :"+car);
        });

        System.out.println(carArrayList);
    }
}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
