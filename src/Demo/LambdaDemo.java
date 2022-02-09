package Demo;

interface Interface{
    void Print();
}

public class LambdaDemo {
    public void main (String args[]){
        Interface object;
//        object.Print(); gives error since no method defintion of print

//        object = new Interface() {
//            @Override
//            public void Print() {
//                System.out.println("Lambda Demo");
//            }
//        };
//        object.Print();

        object = () -> System.out.println("Lambda Demo");
        object.Print();
        };

}
