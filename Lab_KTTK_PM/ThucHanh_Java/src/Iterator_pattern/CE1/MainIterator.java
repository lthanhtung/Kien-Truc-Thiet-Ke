package Iterator_pattern.CE1;

public class MainIterator {
    public static void main(String[] args) {
        ArrayAggregate arrayAggregate = new ArrayAggregate();
        MyIterator myIterator = arrayAggregate.createIterator();
        while (!myIterator.inDone())
        {
            System.out.println(myIterator.next());
        }
    }
}
