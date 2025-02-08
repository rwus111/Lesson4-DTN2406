package interfacedemo.entity;

public class StudentSecond implements IStudy{
    @Override
    public void doHomework() {
        System.out.println("StudentSecond doHomework");
    }

    @Override
    public void run() {
        System.out.println("StudentSecond run");
    }
}
