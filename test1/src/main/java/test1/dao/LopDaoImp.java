package test1.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import test1.entity.Lop;

@Repository
@Transactional
public class LopDaoImp implements LopDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Lop> findAll() {
	
		return sessionFactory.getCurrentSession().createQuery("from Lop c").list();
	}

	public void save(Lop lop) {
		
		sessionFactory.getCurrentSession().persist(lop);
	}

	public void update(Lop lop) {
		sessionFactory.getCurrentSession().merge(lop);
		
	}

	public void delete(int id) {
		sessionFactory.getCurrentSession().delete(getById(id));
		
	}

	public Lop getById(int id) {
		
		return sessionFactory.getCurrentSession().find(Lop.class,id);
	}

}
