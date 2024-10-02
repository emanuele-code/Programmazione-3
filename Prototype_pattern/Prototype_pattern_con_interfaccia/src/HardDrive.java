// questa classe mi serve solo per spiegare il deep copy
public class HardDrive {

    private float  capacita;

    HardDrive(float capacita) {
        this.capacita = capacita;
    }

    public HardDrive(HardDrive hardDrive) {
        this.capacita = hardDrive.capacita;
    }

    @Override
    public String toString() {
        return " " + this.capacita;
    }

}
