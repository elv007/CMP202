import class4.RAM;
import class4.Storage;
import class4.computer;
import class4.process;

public class main{
    void addNumber(int a, int b){
        System.out.println(a+b);
    }
    public static void main (String[]args){

        main main = new main();
        main.addNumber(6, 7);

        computer hp250 = new computer(new RAM(), new process(), new Storage());
        System.out.println(hp250);
    
    }
}
