package Iterator_pattern.CE1;

public class ArrayIterator implements MyIterator{
    private ArrayAggregate array;
    int index = -1;

    public ArrayIterator(ArrayAggregate array) {
        this.array = array;
    }

    @Override
    public Object fist() {
        if (!inDone()) {
            index = 0;
            return array.getItem(index);
        }
        return null;
    }

    @Override
    public Object next() {
        return array.getItem(++index);
    }

    @Override
    public boolean inDone() {
        return index == array.count()-1;
    }

    @Override
    public Object currentItem() {
        if (index >= 0)
            return array.getItem(index);
        return null;
    }
}
