public class TestGenericClass {
    public static void main(String[] args) {
        GenericClass class1 = new GenericClass("안녕");
        GenericClass class2 = new GenericClass(1);
        GenericClass<Integer> class3 = new GenericClass<Integer>();
        GenericClass<String> class4 = new GenericClass<String>();
    }
}
