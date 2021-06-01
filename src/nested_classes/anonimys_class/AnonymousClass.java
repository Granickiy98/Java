package nested_classes.anonimys_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperator(int a, int b) {
                return a + b ;
            }
        };

        Math m2 = new Math() {
            @Override
            public int doOperator(int a, int b) {
                return a*b;
            }
        };

        System.out.println(m.doOperator(6,7));
        System.out.println(m2.doOperator(3,4));
    }
}


interface Math{
    int doOperator(int a,int b);
}