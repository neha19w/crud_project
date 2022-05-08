package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bill")
public class Bill {
		
	@Id
	private int bill_id;
	public int getBill_id() {
		return bill_id;
	}
	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}
	private String bill_name;
	private String bill_price;
	private String bill_details;
	private String bill_image_url;
	
	
	public String getBill_name() {
		return bill_name;
	}
	public void setBill_name(String bill_name) {
		this.bill_name = bill_name;
	}
	public String getBill_price() {
		return bill_price;
	}
	public void setBill_price(String bill_price) {
		this.bill_price = bill_price;
	}
	public String getBill_details() {
		return bill_details;
	}
	public void setBill_details(String bill_details) {
		this.bill_details = bill_details;
	}
	public String getBill_image_url() {
		return bill_image_url;
	}
	public void setBill_image_url(String bill_image_url) {
		this.bill_image_url = bill_image_url;
	}
	
	
}
