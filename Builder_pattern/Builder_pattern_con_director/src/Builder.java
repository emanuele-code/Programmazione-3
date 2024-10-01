// interfaccia Builder
public interface Builder {
    Builder prezzo(float prezzo);
    Builder GPU(String GPU);
    Builder CPU(String CPU);
    Builder ram(int ram);
    ComputerProduct build();
}