package Service;

import java.util.List;

import Model.Bill;
import Model.Items;
import Model.Student;

public interface Item_Service {

	
	
	public boolean saveItems(Items item);
	public List<Items> getItems();
	public boolean deleteItem(Items item);
	public List<Items> getItemByID(Items item);
	public boolean updateItem(Items item);

	public List<Bill>getBills( );
	
	
	public List<Student>getStudent();
	public boolean saveStudentData(Student student);
	public boolean deleteStudentData(Student student);
	
}
