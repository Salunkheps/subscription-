package in.subscription.springjdbc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscription_Package {
	private Integer sub_pack_id;
	private String sub_pack_name;
	private String feature;
	private float price;
	private Integer validity;
	private Integer sub_pack_type;
	private Integer status;
	private Integer is_deleted;

	public Subscription_Package() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subscription_Package(Integer sub_pack_id, String sub_pack_name, String feature, float price,
			Integer validity, Integer sub_pack_type, Integer status, Integer is_deleted) {
		super();
		this.sub_pack_id = sub_pack_id;
		this.sub_pack_name = sub_pack_name;
		this.feature = feature;
		this.price = price;
		this.validity = validity;
		this.sub_pack_type = sub_pack_type;
		this.status = status;
		this.is_deleted = is_deleted;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getSub_pack_id() {
		return sub_pack_id;
	}

	public void setSub_pack_id(Integer sub_pack_id) {
		this.sub_pack_id = sub_pack_id;
	}

	public String getSub_pack_name() {
		return sub_pack_name;
	}

	public void setSub_pack_name(String sub_pack_name) {
		this.sub_pack_name = sub_pack_name;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getValidity() {
		return validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
	}

	public Integer getSub_pack_type() {
		return sub_pack_type;
	}

	public void setSub_pack_type(Integer sub_pack_type) {
		this.sub_pack_type = sub_pack_type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(Integer is_deleted) {
		this.is_deleted = is_deleted;
	}

}
