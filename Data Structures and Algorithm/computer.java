package class4;

public class computer implements Electronics {
    
    RAM ram;
    process process;
    Storage storage;

    public computer(RAM ram, process process, Storage storage){
        this.ram = ram;
        this.process = process;
        this.storage = storage;
    }
    @Override
    public String toString(){
        return "Computer{" +
        "ram=" + ram+
        ", cpu=" + process +
        ",storage=" + storage + 
        '}';
    }




    @Override
    public boolean on() {
        return true;
    }
    @Override //override functions to force the method in this file
    public boolean off(){
        return false;
    }
}