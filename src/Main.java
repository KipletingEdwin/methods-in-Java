//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //method- a block of code that is executed whenever it is called upon

        String name = "Bro";
        int age = 21;

        hello(name, age);

    }

    static void hello(String name, int age){
        System.out.println("Hello  " + name + ",  your age is "+age);
    }
}