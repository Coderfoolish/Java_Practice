package ThaoTacDanhSachSv;

public class SinhVien extends Person {
    public int mssv;
    public String major;

    public SinhVien(String name, String tuoi, String phai, int mssv, String major) {
        super(name, tuoi, phai);
        this.mssv = mssv;
        this.major = major;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return "-------------------\n" + "TenSV: " + this.getName() + "\nMSSV: " + this.mssv +
                "\nTuoi: " + this.getTuoi() + "\nGioi tinh sv: " + this.getPhai() + "\nNganh theo hoc : "
                + this.getMajor() + "\n--------------";
    }
}
