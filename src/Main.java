public class Main {
    public static void main(String[] args) {

        String[] name = {"Ronaldo","Messi","Neymar","Mbappe"};
        Integer[] num = {7,30,11,10};

        method(name);
        method(num);

    }
    public static <T> void method (T [] value){
        if(value.length == 0){
            System.out.println("Массив бош");
        }
        System.out.println("First elements: "+value[0]);
        System.out.println("Last elements: "+value[value.length-1]);
        for (T a : value) {
            System.out.println("Все елементы: "+a);
        }
    }
}