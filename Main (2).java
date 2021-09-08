class Main {
  	public static void main(String[] args) {
		
		//instantiated a Course object
		Course csc119 = new Course("Intro to Programming");

		// added some students
		csc119.addStudent("Tim");
		csc119.addStudent("Dylan");
		csc119.addStudent("Austin");
		csc119.addStudent("Kurtis");

		// made a variable to hold a copy of the students data field
		String[] copyOfStudents = new String[csc119.getNumberOfStudents()];

		// get a copy of the students data field
		copyOfStudents = csc119.getStudents();

		// output the number of students
		System.out.println(csc119.getNumberOfStudents());
  	}
}