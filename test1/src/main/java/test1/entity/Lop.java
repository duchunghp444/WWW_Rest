package test1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Clazz")
public class Lop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name" , nullable = false)
	private String name;
	@Column(name = "block" , nullable = false)
	private String block;
	@Column(name = "type" , nullable = false)
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Lop(int id, String name, String block, String type) {
		super();
		this.id = id;
		this.name = name;
		this.block = block;
		this.type = type;
	}
	public Lop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
