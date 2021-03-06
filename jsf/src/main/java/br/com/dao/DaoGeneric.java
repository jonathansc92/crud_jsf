package br.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.jpautil.JPAUtil;

public class DaoGeneric<OBJ> {

	public void save(OBJ entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.persist(entidade);

		entityTransaction.commit();
		entityManager.close();
	}

	public OBJ merge(OBJ entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		OBJ retorno = entityManager.merge(entidade);

		entityTransaction.commit();
		entityManager.close();

		return retorno;
	}

	public void delete(OBJ entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.remove(entidade);

		entityTransaction.commit();
		entityManager.close();
	}

	public void deleteById(OBJ entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		Object id = JPAUtil.getPrimaryKey(entidade);
		entityManager.createQuery(
				"delete from " + entidade.getClass().getCanonicalName()
						+ " where id = " + id).executeUpdate();

		entityTransaction.commit();
		entityManager.close();
	}

	public List<OBJ> getListEntity(Class<OBJ> entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		List<OBJ> retorno = entityManager.createQuery("from "+ entidade.getName()).getResultList();

		entityTransaction.commit();
		entityManager.close();
		
		return retorno;
	}
}
