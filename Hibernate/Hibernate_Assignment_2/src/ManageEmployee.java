import java.util.*;
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageEmployee {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      
      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      ManageEmployee ME = new ManageEmployee();

      HashSet set1 = new HashSet();
      set1.add(new Employee("employee1", 100));
      set1.add(new Employee("employee2",200));
      set1.add(new Employee("employee3",300));
     

      Integer DepID1 = ME.addDepartment("MCA", set1);

    
      HashSet set2 = new HashSet();
      set2.add(new Employee("employee4",400));
      set2.add(new Employee("employee5",300));

   
      Integer DepID2 = ME.addDepartment("MBA", set2);
      HashSet set3 = new HashSet();
      set2.add(new Employee("employee6",400));
 
  
      ME.listDepartments();
ME.updateDepartment(1,set3 );
   

ME.listDepartments();  
ME.deleteDepartment(1);

ME.listDepartments();
   }


   public Integer addDepartment(String name, Set emp){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer DepID = null;
      
      try {
         tx = session.beginTransaction();
         DEPARTMENT department = new DEPARTMENT(name);
         department.setEmployees(emp);
         DepID = (Integer) session.save(department); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return  DepID;
   }

   public void listDepartments( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List Departments = session.createQuery("FROM Department").list(); 
         for (Iterator iterator1 = Departments.iterator(); iterator1.hasNext();){
            DEPARTMENT department = (DEPARTMENT) iterator1.next(); 
            System.out.print("name: " + department.getName()); 
            Set employees = department.getEmployees();
            for (Iterator iterator2 = employees.iterator(); iterator2.hasNext();){
               Employee empName = (Employee) iterator2.next(); 
               System.out.println("name: " + empName.getName()); 
            }
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }

   public void updateDepartment(Integer DepID, Set employee ){
      Session session = factory.openSession();
      Transaction tx = null;
      try {
         tx = session.beginTransaction();
         DEPARTMENT department = (DEPARTMENT)session.get(DEPARTMENT.class, DepID); 
         department.setEmployees( employee );
         session.update(department);
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   

   public void deleteDepartment(Integer DepID){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         DEPARTMENT department = (DEPARTMENT)session.get(DEPARTMENT.class, DepID); 
         session.delete(department); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
 
}