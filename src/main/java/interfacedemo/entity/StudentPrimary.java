package interfacedemo.entity;

public class StudentPrimary extends Person implements IStudy, IPerson{
    private String mssv;

    public StudentPrimary(String name, int age, String mssv) {
        super(name, age);
        this.mssv = mssv;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    @Override
    public void doHomework() {
        System.out.println("StudentPrimary doHomework");
    }

    @Override
    public void run() {
        System.out.println("StudentPrimary run");
    }
}
