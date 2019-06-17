package Hib_jpa;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.query.Query;

public class Utility_jpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("axelor");
		EntityManager entitymanager = emfactory.createEntityManager();

		entitymanager.getTransaction().begin();
		Student student = new Student();

		// Student student = new Student( );

		// Creating
		/*
		 * Random random=new Random(); for(int i=1;i<=20;i++) { Student student = new
		 * Student( ); student.setStudent_name( "Student"+""+i );
		 * student.setStudent_marks(random.nextInt(100));
		 * 
		 * 
		 * entitymanager.persist( student );
		 * 
		 * }
		 */

		// Update and find
		// Student student=entitymanager.find(Student.class, 3);
		// System.out.println(student);

		// Deleting
		// entitymanager.remove(student);
		// student.setStudent_name("Rohan");

		// Scalar function
		/*
		 * List<String> list =
		 * entitymanager.createQuery("Select UPPER(s.student_name) from Student s").
		 * getResultList();
		 * 
		 * 
		 * for(String e:list) { System.out.println("STUDENT NAME :"+e); }
		 */

		// Aggregate function
		/*
		 * int result = (int)
		 * entitymanager.createQuery("Select MAX(s.student_marks) from Student s").
		 * getSingleResult();
		 * 
		 * System.out.println("Max Employee Salary :" + result);
		 */

		// Between
		/*
		 * List<Student> list= entitymanager.createQuery( "from Student s " +
		 * "where s.student_marks " + "Between 70 and 100" ).getResultList( );
		 * 
		 * // List<Employee> list=(List<Employee>)query.getResultList( );
		 * 
		 * for( Student s:list ){ System.out.print("Student ID :" + s.getStudent_id());
		 * System.out.println("\t Student marks :" + s.getStudent_marks()); }
		 */

		// Like
		/*
		 * List<Student> list1 = (List<Student>)
		 * entitymanager.createQuery("from Student s " +
		 * "where s.student_name LIKE 'S%'").getResultList( );
		 * 
		 * 
		 * for( Student s:list1 ) { System.out.print("Student ID :"+s.getStudent_id());
		 * System.out.println("\tStudent name :"+s.getStudent_name()); }
		 */

		// entitymanager.persist(student);

		    entitymanager.getTransaction().commit();

		// entitymanager.close( );
		// emfactory.close( );

	}

}
