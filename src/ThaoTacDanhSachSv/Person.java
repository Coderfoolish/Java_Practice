package ThaoTacDanhSachSv;

public class Person {
    private String name;
    private String tuoi;
    private String phai;

    public Person(String name, String tuoi, String phai) {
        this.name = name;
        this.tuoi = tuoi;
        this.phai = phai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }
}
