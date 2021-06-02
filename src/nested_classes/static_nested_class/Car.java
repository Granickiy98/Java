package nested_classes.static_nested_class;

public class Car {
    String color ;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method(){
        System.out.println(Engine.countOfObjects);
        Engine engine = new Engine(200);
        System.out.println(engine.horsePower);
    }

    @Override
    public String toString() {
        return "My car : {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public  static  class Engine {
       private int horsePower;
       static int countOfObjects;

        public Engine(int hoursePower) {
            System.out.println(a);
            this.horsePower = hoursePower;
            countOfObjects++;
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
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

    }
}
