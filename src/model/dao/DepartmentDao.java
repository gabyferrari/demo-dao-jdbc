package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	//A ideia do dao é q para cada entidade do seu negocio, tera um obj responsavel por fazer acesso a dados relacionado-
	//a esta entidade. O dao é responsavel por pegar os dados do banco de dados relacional e transformar em objs associados
	//O model ele nao so compreende as entidades mas tambem as classes que fazem transformaçoes nessas entidades
	//e o dao tbm faz parte do model.
	
	void insert(Department obj); //responsavel por inserir no banco de dados esse obj como parametro de entrada
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id); //reponsavel por pegar esse id e consultar no banco um obj com esse id, se existir retorna senao retorna nulo
	List<Department> findAll(); //retorna todos os departamentos

}
