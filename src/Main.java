
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StudentList studentlist = new StudentList(4);
		studentlist.appendStudent(new Student("aika","スノーボード"));
		studentlist.appendStudent(new Student("bbb","music"));
		studentlist.appendStudent(new Student("ccc","game"));
		studentlist.appendStudent(new Student("ddd","shopping"));
		
		Iterator it = studentlist.iterator();
		
		while (it.hasNext()) {
			Student student = (Student)it.next();
			System.out.println("はじめまして、" + student.getName() + "です。趣味は" + student.getHobby() + "です。");
		}

	}

}
