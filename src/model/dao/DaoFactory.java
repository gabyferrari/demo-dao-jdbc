package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	//classe auxiliar responsavel por instanciar os daos
	//tem operaçoes estaticas para a instanciaçao
	
	public static SellerDao createSellerDao() { //expoe um metodo q retorna o tipo da interface
		return new SellerDaoJDBC(DB.getConnection()); //mas q internamente ele instancia uma implementaçao
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
