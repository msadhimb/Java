package myException;

public class OverdriveException extends Exception {
    // eksepsi sendiri
    private double deficit = 0;

    public OverdriveException(String msg, double deficit) {
        super(msg);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}
