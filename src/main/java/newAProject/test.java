package newAProject;

public class test implements Cloneable{
	@Override
    protected test clone() throws CloneNotSupportedException {
        return (test) super.clone();
    }
}
