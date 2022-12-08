public class ComputerFacade {
    private CPU processsor;
    private HardDrive hd;
    private Memory ram;

    public ComputerFacade(CPU processsor, HardDrive hd, Memory ram) {
        this.processsor = processsor;
        this.hd = hd;
        this.ram = ram;
    }

    public void start(){
        processsor.freeze();
        ram.load(132, hd.read(3456, 86));
        processsor.jump(132);
        processsor.execute();
    }

    
}
