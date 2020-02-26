package Java.List;

import java.sql.SQLOutput;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>(50);

        System.out.println(array.isEmpty());
        array.printElements();

        array.addToFirst("hi");
        array.addTo("my",1);
        array.addTo("name",2);
        array.addTo("is",3);
        array.addTo("hyeonSu",4);
        array.printElements();
        array.addToLast("i'm");
        array.printElements();
        array.add("good at programming");
        array.printElements();
        array.removeFrom(2);
        array.printElements();
        array.removeLast();
        array.printElements();
        array.replaceAt("name",1);
        array.printElements();
        array.clear();
        array.printElements();
    }
}
