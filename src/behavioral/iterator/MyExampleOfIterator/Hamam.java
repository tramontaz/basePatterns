package behavioral.iterator.MyExampleOfIterator;

import behavioral.iterator.Iterator;

public class Hamam implements BathСomplex{

    private String name;
    private String[] girsl;

    Hamam(String name, String[] girsl) {
        this.name = name;
        this.girsl = girsl;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getGirsl() {
        return girsl;
    }

    public void setGirsl(String[] girsl) {
        this.girsl = girsl;
    }

    @Override
    public Iterator getIterator() {
        return new GirlsIterator();
    }

    private class GirlsIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < girsl.length;
        }

        @Override
        public Object next() {
            return girsl[index++];
        }
    }
}
