package model.dao;

import java.util.List;

import model.entites.Department;

public interface DepartmentDAO {

	void insert(Department obj);

	void update(Department onj);

	void deleteById(Integer id);

	// Ser� responsavel por pegar o id e consultar no banco de dados um objeto com
	// este id
	// Se existir vai retornar se n�o existir vai retonar nulo
	Department findById(Integer id);

	// Ser� responsavel por trazer todos departmento
	List<Department> findAll();

}
