package first;


public class test {
	public static void main(String[] args) {
		TestTtudengt stu = new TestTtudengt();
		
		System.out.println(stu.name);
		System.out.println(stu.age);
		System.out.println("===========");
		
		stu.name = "ยน๊ฯ";
		stu.age = 20;
		System.out.println(stu.name);
		System.out.println(stu.age);
		stu.eat();
		System.out.println(stu.sleep(20));
	}

}
