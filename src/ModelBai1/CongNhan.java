package Model;

public class CongNhan extends CanBo{
    private int Lever;

    @Override
    public String toString() {
        return "CongNhan{" +
                "Lever=" + Lever +
                '}';
    }

    public CongNhan(int lever) {
        Lever = lever;
    }

    public CongNhan(String hoten, int tuoi, String gioitinh, String diachi, int lever) {
        super(hoten, tuoi, gioitinh, diachi);
        Lever = lever;
    }

    public int getLever() {
        return Lever;
    }

    public void setLever(int lever) {
        Lever = lever;
    }
}
