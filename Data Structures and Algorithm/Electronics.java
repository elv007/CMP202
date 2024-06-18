package class4;

//electronics 

public interface Electronics {

    boolean onOrOff = false;
    
    boolean on();

    boolean off();

    default void main() {
        if (onOrOff){
            System.out.println("default status is off");
        }
    }
}
