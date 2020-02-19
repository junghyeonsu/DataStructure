public class TestArrayBag {
    public static void main(String[] args) {
        ArrayBag<Integer> test1 = new ArrayBag<Integer>(50);

        System.out.println("사이즈 : " + test1.size());
        System.out.println("현재 배열이 비어있나요? : "+ test1.isEmpty());

        test1.add(1);
        test1.add(5);
        test1.add(10);
        test1.add(15);

        System.out.println("사이즈 : " + test1.size());
        System.out.println("현재 배열이 비어있나요? : "+ test1.isEmpty());

        System.out.println(test1.doesContain(1));

        test1.remove(5);
        test1.remove(10);

        System.out.println("사이즈 : " + test1.getSize());

        test1.clear();

        System.out.println("사이즈 : "+ test1.getSize());

    }
}
