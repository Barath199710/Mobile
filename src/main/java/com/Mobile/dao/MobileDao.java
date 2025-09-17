package com.Mobile.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Mobile.Entity.MobileEntity;
import com.Mobile.Repository.MobileRepositary;

@Repository

public class MobileDao {
	@Autowired
	MobileRepositary mr;

	public String postAll(List<MobileEntity> a) {
		mr.saveAll(a);
		return "Saved Successfully";

	}

	public List<MobileEntity> getAll() {
		return mr.findAll();

	}

	public Optional<MobileEntity> getId(Integer a) {
		return mr.findById(a);
	}

	public MobileEntity getID(Integer id) {
		return mr.findById(id).orElse(null);
	}

	public String putValue(MobileEntity m, Integer id) {
		MobileEntity x = mr.findById(id).get();
		x.setBrand(m.getBrand());
		x.setPrice(m.getPrice());
		x.setSize(m.getSize());
		x.setColor(m.getColor());
		mr.save(x);
		return "Updated Succesfully";
	}

	public String putId(MobileEntity n, Integer id) {
		MobileEntity y = mr.findById(id).get();
		y.setBrand(n.getBrand());
//	y.setPrice(n.getPrice());
//	y.setSize(n.getSize());
//	y.setColor(n.getColor());
		mr.save(y);
		return "Updated Successfully";

	}

	public String deleteId(MobileEntity j, Integer id) {
		MobileEntity h = mr.findById(id).get();
		h.setPrice(j.getPrice());
		mr.deleteById(id);
		return "Deleted Successfully";
	}

	public String deleteAll() {
//	MobileEntity l=mr.findById(id).get();
		mr.deleteAll();
		return "Deleted Successfully";
	}

	public Integer getMaxi() {
		return mr.getMaxi();
	}

	public MobileEntity getPriceValue(Integer a) {
		return mr.getPriceValue(a);
	}

	public List<MobileEntity> getPricevalue(Integer a, Integer b) {
		return mr.getPricevalue(a, b);
	}

	public MobileEntity getAllValue(String a) {
		return mr.getAllValue(a);
	}

	public List<MobileEntity> getallValue(Integer a, Integer b) {
		return mr.getallValue(a, b);
	}

	public List<MobileEntity> getExcept(String a) {
		return mr.getExcept(a);
	}

	public List<MobileEntity> getexcept(Integer a) {
		return mr.getexcept(a);
	}
}