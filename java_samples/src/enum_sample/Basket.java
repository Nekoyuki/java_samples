package enum_sample;

public class Basket {
    public static void main(String[] args) {

        Fruit flt = Fruit.APPLE;
        System.out.println( flt.getLabel() );       //りんご

        System.out.println( Fruit.PEACH.getId() );  //3
    }
}
