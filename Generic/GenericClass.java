public class GenericClass<T> {
    private T bag_element;
    GenericClass(){
        System.out.println("Generic class 생성");
    }

    GenericClass(T data){
        if(data instanceof  String){
            System.out.println("String class가 생성되었습니다.");
        }
        else if(data instanceof Integer){
            System.out.println("Integer class가 생성되었습니다.");
        }
        else{
            System.out.println("Integer나 String이 아닌 class가 생성되었습니다.");
        }
    }
}



