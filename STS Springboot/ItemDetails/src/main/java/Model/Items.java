package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Items {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int item_id;
	
	private String item_name;
	private String item_price;
	private String item_details;
	private String item_image_url;
	
	

	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setStudent_name(String item_name) {
		this.item_name = item_name;
	}
	
	
	public String getItem_price() {
		return item_price;
	}
	public void setItem_price(String item_price) {
		this.item_price = item_price;
	}
	public String getItem_details() {
		return item_details;
	}
	public void setItem_details(String item_details) {
		this.item_details = item_details;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_image_url() {
		return item_image_url;
	}
	public void setItem_image_url(String item_image_url) {
		this.item_image_url = item_image_url;
	}
	
	
	

	
}
