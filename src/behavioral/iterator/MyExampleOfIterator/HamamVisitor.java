package behavioral.iterator.MyExampleOfIterator;

import behavioral.iterator.Iterator;

public class HamamVisitor {
    public static void main(String[] args) {
        String[] girls = {"Brunette", "Blonde", "Redhead", "Brown-haired woman"};
        Hamam hamam = new Hamam("Hamam for kings", girls);
        Iterator iterator = hamam.getIterator();

        System.out.println("Bath complex: " + hamam.getName());
        System.out.print("Girls here: ");
        while (iterator.hasNext()) System.out.print(iterator.next().toString() + " | ");
    }
}
