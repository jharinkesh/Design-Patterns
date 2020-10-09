package creational;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

    public static void main(String[] args) {
	ClassRoom c1 = new ClassRoom(123);
	c1.fillData();
	System.out.println("sn: " + c1.sn);
	System.out.println("data: " + c1.students);

	ClassRoom c2 = (ClassRoom) c1.clone();
	System.out.println("sn: " + c2.sn);
	c2.students.remove(2);
	System.out.println("data: " + c2.students);
    }
}

class ClassRoom implements Cloneable {
    int sn;
    List<String> students;

    ClassRoom(int sn) {
	students = new ArrayList<String>();
	this.sn = sn;
    }

    ClassRoom(int sn, List<String> students) {
	this.students = students;
	this.sn = sn;
    }

    public void fillData() {
	students.add("ram");
	students.add("ravi");
	students.add("rajesh");
	students.add("ranjan");
    }

    @Override
    public Object clone() {
	List<String> st = new ArrayList<String>();
	for (String s : students) {
	    st.add(s);
	}
	return new ClassRoom(sn, st);
    }
}
