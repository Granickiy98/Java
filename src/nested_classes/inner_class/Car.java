package nested_classes.inner_class;

public class Car {
    String color ;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

   public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car : {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public  class Engine {
        private int horsePower;

        public Engine(int hoursePower) {
            this.horsePower = hoursePower;
        }

        @Override
        public String toString() {
            return "My engine : {" +
                    "hoursePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car car = new Car("Black",5);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(car);
        System.out.println(engine);

        Car.Engine engine3 = new Car("Red",3).new Engine(120);

    }
}
