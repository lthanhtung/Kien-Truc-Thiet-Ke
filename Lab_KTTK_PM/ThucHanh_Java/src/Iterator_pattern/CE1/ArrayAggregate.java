package Iterator_pattern.CE1;

public class ArrayAggregate extends Aggregate{
    private int[] array = {1,2,3,4,5,6,8};
    public int getItem(int i)
    {
        return array[i];
    }
    public int count()
    {
        return array.length;
    }

    @Override
    public MyIterator createIterator() {
        return new ArrayIterator(this);
    }
}
