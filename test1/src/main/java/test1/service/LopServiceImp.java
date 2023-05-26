package test1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import test1.dao.LopDAO;
import test1.entity.Lop;
@Service
@Transactional
public class LopServiceImp implements LopService{
@Autowired
	LopDAO lopDAO;
	public List<Lop> findAll() {
		// TODO Auto-generated method stub
		return  lopDAO.findAll();
	}

	public void save(Lop lop) {
		// TODO Auto-generated method stub
		lopDAO.save(lop);
	}

	public void update(Lop lop) {
		lopDAO.update(lop);
	}

	public void delete(int id) {
		lopDAO.delete(id);
		
	}

	public Lop getById(int id) {
		
		return lopDAO.getById(id);
	}

}
