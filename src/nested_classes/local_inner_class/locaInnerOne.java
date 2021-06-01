package nested_classes.local_inner_class;

public class locaInnerOne {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21,4);
    }
}

class Math{
    private int a=10;
    public void getResult(int delimoe, int delitel ){
        class Delenie{
            public int getChastnoe(){
                return delimoe/delitel;
            }
            public int getOstatok(){
                return delimoe%delitel;
            }

        }

        Delenie delenie = new Delenie();

        System.out.println("Delimoe = "+delimoe);
        System.out.println("Delitel = "+delitel);
        System.out.println("Chastnoe = "+delenie.getChastnoe());
        System.out.println("Ostatok = "+delenie.getOstatok());
    }
}


