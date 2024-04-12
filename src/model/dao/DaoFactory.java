package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	//classe auxiliar responsavel por instanciar os daos
	//tem operaçoes estaticas para a instanciaçao
	
	public static SellerDao createSellerDao() { //expoe um metodo q retorna o tipo da interface
		return new SellerDaoJDBC(); //mas q internamente ele instancia uma implementaçao
	}

}
