package newAProject;

public class testDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1 = new Student();
		student1.setName("tom");
		System.out.println(student1);
		System.out.println(student1.hashCode());
		test t = new test();
		System.out.println(t.hashCode());
		test t1 = t.clone();
		System.out.println(t1.hashCode());
		try{
			Student student2 = student1.clone();
			System.out.println(student2);
			System.out.println(student2.hashCode());
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
