package com.Mobile.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.GlobalExceptionHandler.AgeNotFoundException;
import com.GlobalExceptionHandler.NameNotFoundException;
import com.Mobile.Entity.MobileEntity;
import com.Mobile.Service.MobileService;

@RestController
@RequestMapping(value = "/mob/api")

public class MobileController {
	@Autowired
	MobileService ms;

	@PostMapping(value = "/postvalue")
	public String postAll(@RequestBody List<MobileEntity> a) {
		return ms.postAll(a);
	}

	@GetMapping(value = "/getvalue")
	public List<MobileEntity> getAll() {
		return ms.getAll();
	}

	@GetMapping(value = "/getValues/{id}")
	public Optional<MobileEntity> getId(@PathVariable Integer id) {
		return ms.getId(id);
	}

	@GetMapping(value = "getDetails/{id}")
	public MobileEntity getID(@PathVariable Integer id) {
		return ms.getID(id);
	}

	@PutMapping(value = "getId/{id}")
	public String putValue(@RequestBody MobileEntity m, @PathVariable Integer id) {
		return ms.putValue(m, id);
	}

	@PatchMapping(value = "/changeValue/{id}")
	public String putId(@RequestBody MobileEntity n, @PathVariable Integer id) {
		return ms.putId(n, id);
	}

	@DeleteMapping(value = "/deleteValue/{id}")
	public String deleteId(@RequestBody MobileEntity j, @PathVariable Integer id) {
		return ms.deleteId(j, id);

	}

	@DeleteMapping(value = "/deleteAll")
	public String deleteAll() {
		return ms.deleteAll();
	}

//09.09.2025
	@GetMapping(value = "/getMax")
	public MobileEntity getMax() {
		return ms.getMax();
	}

	@GetMapping(value = "/getsorted")
	public List<MobileEntity> getSorted() {
		return ms.getSorted();
	}

	@GetMapping(value = "/getCount")
	public long getCount() {
		return ms.getCount();

	}

	@GetMapping(value = "getMaxi")
	public Integer getMAxi() {
		return ms.getMaxi();

	}

	@GetMapping(value = "/getpriceValue/{a}")
	public MobileEntity getPriceValue(@PathVariable Integer a) {
		return ms.getPriceValue(a);
	}

	@GetMapping(value = "/getPricevalue/{a}/{b}")
	public List<MobileEntity> getPricevalue(@PathVariable Integer a, @PathVariable Integer b) {
		return ms.getPricevalue(a, b);
	}

	@GetMapping(value = "getAllValue/{a}")
	public MobileEntity getAllValue(@PathVariable String a) {
		return ms.getAllValue(a);
	}

	@GetMapping(value = "getallValue/{a}/{b}")
	public List<MobileEntity> getallValue(@PathVariable Integer a, @PathVariable Integer b) {
		return ms.getallValue(a, b);
	}

	@GetMapping(value = "/getName/{a}")
	public List<MobileEntity> getExcept(@PathVariable String a) throws NameNotFoundException {
		return ms.getExcept(a);
	}

	@GetMapping(value = "getPrice/{a}")
	public List<MobileEntity> getexcept(@PathVariable Integer a) throws AgeNotFoundException {
		return ms.getexcept(a);
	}
}