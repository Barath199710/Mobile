package com.Mobile.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Mobile.Entity.MobileEntity;

public interface MobileRepositary extends JpaRepository<MobileEntity, Integer> {

	@Query(value = "select max(price)from mobiledb.mobiletable", nativeQuery = true)
	public Integer getMaxi();
 
	@Query(value = "select*from mobiledb.mobiletable where price=?1", nativeQuery = true)
	public MobileEntity getPriceValue(Integer a);

	@Query(value = "select*from mobiledb.mobiletable where price between  ?1 and ?2", nativeQuery = true)
	public List<MobileEntity> getPricevalue(Integer a, Integer b);

	@Query(value = "select e from MobileEntity e where e.brand=?1")
	public MobileEntity getAllValue(String a);

	@Query(value = "select f from MobileEntity f where f.price Between ?1 and ?2")
	public List<MobileEntity> getallValue(Integer a, Integer b);

	@Query(value = "select e from MobileEntity e where e.brand=?1")
	public List<MobileEntity> getExcept(String a);

	@Query(value = "select e from MobileEntity e where e.price=?1")
	public List<MobileEntity> getexcept(Integer a);

}
