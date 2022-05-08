package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Bill;
import Model.Items;
import Model.Student;
import Service.Item_Service;

@RestController
//@CrossOrigin(origins="http://localhost:4200")
@CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
@RequestMapping(value = "/api")
public class Controller {

	@Autowired
	private Item_Service itemservice;

	@PostMapping("save-item")
	public boolean saveItem(@RequestBody Items item) {
		return itemservice.saveItems(item);

	}

	@GetMapping("item-list")
	public List<Items> allitems() {
		System.out.println("retriving data");
		return itemservice.getItems();
	}

	@DeleteMapping("delete-item/{item_id}")
	public boolean deleteItem(@PathVariable("item_id") int item_id, Items item) {
		item.setItem_id(item_id);
		return itemservice.deleteItem(item);
	}

	@GetMapping("item/{item_id}")
	public List<Items> allitemsByID(@PathVariable("item_id") int item_id, Items item) {
		item.setItem_id(item_id);

		List<Items> local = itemservice.getItemByID(item);
		System.out.println(local.get(0).getItem_name());
		return local;

	}

	@PostMapping("update-item/{item_id}")
	public boolean updateItem(@RequestBody Items item, @PathVariable("item_id") int item_id) {
		item.setItem_id(item_id);
		return itemservice.updateItem(item);

	}

	@GetMapping("bill-list")
	public List<Bill> allbills() {
		return itemservice.getBills();
	}

	@GetMapping("student-list")
	public List<Student> alldata() {
		return itemservice.getStudent();
	}

	@PostMapping("save-student-data")
	public boolean saveStudentData(@RequestBody Student student) {
		return itemservice.saveStudentData(student);
	}

	@DeleteMapping("delete-student-data/{id}")
	public boolean deleteStudentData(@PathVariable("id") int id, Student student) {
		student.setId(id);
		return itemservice.deleteStudentData(student);
	}

}
