package nested_classes.local_inner_class;

public class LocalInnerTwo {
    public static void main(String[] args) {
        class Slojenie implements MathTwo{

            @Override
            public int doOperator(int a, int b) {
                return a+b;
            }
        }
        Slojenie slojenie = new Slojenie();
        System.out.println(slojenie.doOperator(5,3));
    }
}

interface MathTwo{
    int doOperator(int a,int b);
}
