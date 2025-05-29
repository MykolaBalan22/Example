import test.Shape;

import java.util.Comparator;

public class Demo implements Cloneable, Comparator {
    private String line = "text";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

