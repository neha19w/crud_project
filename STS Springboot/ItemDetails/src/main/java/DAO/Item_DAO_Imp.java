package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Bill;
import Model.Items;
import Model.Student;

@Repository
public class Item_DAO_Imp{

	@Autowired
	private SessionFactory sessionFactory;
	

	public boolean saveStudent(Items item) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(item);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}



	public List<Items> getStudents() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Items> query=currentSession.createQuery("from Items", Items.class);
		List<Items> list=query.getResultList();
		return list;
	}

	
	

	public boolean deleteItem(Items item) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(item);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	


	public List<Items> getItemByID(Items item) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Items> query=currentSession.createQuery("from Items where item_id=:item_id", Items.class);
		query.setParameter("item_id", item.getItem_id());
		List<Items> list=query.getResultList();
		return list;
	}


	public boolean updateItem(Items item) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(item);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}


	public List<Bill> getBills( ) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Bill> query=currentSession.createQuery("from Bill", Bill.class);
		List<Bill> list=query.getResultList();
		return list;
 	}

	
	
	public boolean saveStudentData(Student student) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(student);
			status=true;
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
	
	public boolean deleteStudentData(Student student) {
		boolean status= false;
		try {
			sessionFactory.getCurrentSession().delete(student);
			status=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	
	
	public List<Student>getStudent(){
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student>query=currentSession.createQuery("from Student",Student.class);
		
	//	Query<Student>query=currentSession.createQuery("from Student WHERE AGE LIKE '%2%' ",Student.class);

		List<Student> Studentlist=query.getResultList();
		
		for(Student list : Studentlist ) {
			
			list.getGender();
			
			//if(list.gender=="female") {
			if(list.gender.equals("female")) {
				list.setGender("F");
			}else if(list.gender.equals("male")) {
				list.setGender("M");
			}
		}
		for(Student listforresult :Studentlist) {
			listforresult.getAge();
			if(listforresult.age<=25) {
				listforresult.setResult("Fail");
			}else {
				listforresult.setResult("Pass");
			}
		}
		
		
		return Studentlist;
	}



	

}
