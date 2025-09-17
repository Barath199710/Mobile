package com.Mobile.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GlobalExceptionHandler.AgeNotFoundException;
import com.GlobalExceptionHandler.NameNotFoundException;
import com.Mobile.Entity.MobileEntity;
import com.Mobile.dao.MobileDao;

@Service

public class MobileService {
@Autowired
MobileDao md;
public String postAll(List<MobileEntity>a)
{
	return md.postAll(a);
}
public List<MobileEntity> getAll() {
	return md.getAll();
}
public Optional<MobileEntity>getId(Integer id){
	return md.getId(id);
}
public MobileEntity getID(Integer id){
	return md.getID(id);

}
public String putValue(MobileEntity m,Integer id) {
	return md.putValue(m,id);
}
public String putId(MobileEntity n,Integer id) {
	return md.putId(n,id); 
}
public String deleteId(MobileEntity j,Integer id) {
return md.deleteId(j, id);
}
public String deleteAll() {
	md.deleteAll();
	return "All Records Deleted Successfully";
			
}
public MobileEntity  getMax() {
	List<MobileEntity> x=md.getAll();
	return x.stream().max(Comparator.comparing(MobileEntity::getPrice)).get();
}
public List<MobileEntity> getSorted() {
	List<MobileEntity> y=md.getAll();
	return y.stream().sorted(Comparator.comparing(MobileEntity::getBrand)).collect(Collectors.toList());
	//return y;
} 
public long getCount () {
	List<MobileEntity> z=md.getAll();
	return z.stream().map(x->x.getColor()).distinct().count();
}
public Integer getMaxi() {
	return md.getMaxi();
}
public MobileEntity getPriceValue(Integer a) {
	return md.getPriceValue(a);
}
public List<MobileEntity> getPricevalue(Integer a,Integer b){
	return md.getPricevalue(a,b);
}
public MobileEntity getAllValue(String a) {
	return md.getAllValue(a);
}
public List<MobileEntity> getallValue(Integer a,Integer b){
	return md.getallValue(a,b);
}
public List<MobileEntity> getExcept(String a) throws NameNotFoundException {
	List<MobileEntity> x=md.getExcept(a);
	if(x.isEmpty()) {
		throw new NameNotFoundException("Not Found");
	}
	else {
		return md.getExcept(a);
	}

}
public List<MobileEntity>getexcept(Integer a) throws AgeNotFoundException {
	List<MobileEntity> y=md.getexcept(a);
	if(y.isEmpty()) {
		throw new AgeNotFoundException("Not Found");
	}
	else {
		return md.getexcept(a);
	
	}
}
}
