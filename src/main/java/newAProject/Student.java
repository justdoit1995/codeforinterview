package newAProject;

public class Student implements Cloneable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	@Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
	
}
