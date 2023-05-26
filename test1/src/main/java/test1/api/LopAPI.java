package test1.api;

import java.io.ObjectOutputStream.PutField;
import java.util.List;

import javax.print.attribute.standard.Severity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test1.entity.Lop;
import test1.service.LopService;

@RestController
@RequestMapping("/api")
public class LopAPI {
	@Autowired
	LopService service;
	
	@GetMapping("/lop")
	public List<Lop> find(){
		return service.findAll();
	}
	
	@PostMapping("/lop")
	public void add(@RequestBody Lop lop) {
		service.save(lop);
		
	}
	@PutMapping("/lop")
	public void update(@RequestBody Lop lop ) {
		service.update(lop);
	}
	@DeleteMapping("/lop/{id}")
	public void delete(@PathVariable int id ) {
		service.delete(id);
	}
	@GetMapping("/lop/{id}")
	public Lop findById(@PathVariable int id) {
		return service.getById(id);
	}
	
}
