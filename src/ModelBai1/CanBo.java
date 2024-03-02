package Model;

public class CanBo {
    private String Hoten;
    private int Tuoi;
    private String Gioitinh;
    private String Diachi;


    @Override
    public String toString() {
        return "CanBo{" +
                "Hoten='" + Hoten + '\'' +
                ", Tuoi=" + Tuoi +
                ", Gioitinh='" + Gioitinh + '\'' +
                ", Diachi='" + Diachi + '\'' +
                '}';
    }

    public CanBo(){

    }

    public CanBo(String hoten, int tuoi, String gioitinh, String diachi) {
        Hoten = hoten;
        Tuoi = tuoi;
        Gioitinh = gioitinh;
        Diachi = diachi;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
}
