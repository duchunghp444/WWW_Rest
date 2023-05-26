package test1.service;

import java.util.List;

import test1.entity.Lop;

public interface LopService {

	public List<Lop> findAll();
	
	public void save (Lop lop);
	public void update (Lop lop);
	
	public void delete(int id );
	public Lop getById(int id);
}
