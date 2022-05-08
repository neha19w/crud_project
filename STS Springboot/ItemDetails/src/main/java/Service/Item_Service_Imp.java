package Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import DAO.Item_DAO_Imp;
import Model.Bill;
import Model.Items;
import Model.Student;

@Service
@Transactional
public class Item_Service_Imp implements Item_Service {
 
	@Autowired
	private Item_DAO_Imp studentdao;
	
	
	@Override
	public boolean saveItems(Items item) {
		return studentdao.saveStudent(item);
	}

	@Override
	public List<Items> getItems() {
		return studentdao.getStudents();
	}

	@Override
	public boolean deleteItem(Items item) {
		return studentdao.deleteItem(item);
	}

	@Override
	public List<Items> getItemByID(Items item) {
		return studentdao.getItemByID(item);
	}

	@Override
	public boolean updateItem(Items item) {
		return studentdao.updateItem(item);
	}

	

	@Override
	public List<Bill> getBills() {
		return studentdao.getBills();
	}

	@Override
	public List<Student> getStudent() {

		return studentdao.getStudent();
	}

	@Override
	public boolean saveStudentData(Student student) {
		
		return studentdao.saveStudentData(student);
	}

	@Override
	public boolean deleteStudentData(Student student) {
		
		return studentdao.deleteStudentData(student);
	}
	
	
}
