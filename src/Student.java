/**
 *   File Name: StudentDetails.java<br>
 *
 *   Gajula, jayabhanu<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *   
 */

/**
 * StudentDetails //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class StudentDetails {

	int id;
	String name;

	StudentDetails(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		StudentDetails s1 = new StudentDetails(111, "Karan");
		StudentDetails s2 = new StudentDetails(222, "Aryan");
		s1.display();
		s2.display();
	}
}
