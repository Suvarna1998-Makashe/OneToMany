package com.radha.krishna.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cource_TBL")
public class Cource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name = "Abbrevation")
	private String abbrevation;
	@Column(name = "Module")
	private int module;
	@Column(name = "Fee")
	private double fee;

	@OneToMany(targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk", referencedColumnName = "id")
	private List<Student> student;

	public Cource() {

	}

	public Cource(int id, String abbrevation, int module, double fee) {
		super();
		this.id = id;
		this.abbrevation = abbrevation;
		this.module = module;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAbbrevation() {
		return abbrevation;
	}

	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	public int getModule() {
		return module;
	}

	public void setModule(int module) {
		this.module = module;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
//    
//	@ManyToMany(mappedBy="cource",fetch=FetchType.LAZY)
//	private Set<Student> student;
//
//
//	public Set<Student> getStudent() {
//		return student;
//	}
//
//
//	public void setStudent(Set<Student> student) {
//		this.student = student;
//	}

}
