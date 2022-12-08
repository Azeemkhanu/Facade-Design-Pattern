public class Main {
    public static void main(String[] args) {
        CPU cpu=new CPU();
        Memory memory=new Memory();
        HardDrive hd=new HardDrive();

        ComputerFacade computerfacade=new ComputerFacade(cpu, hd, memory);
        computerfacade.start();
    }
    
}
