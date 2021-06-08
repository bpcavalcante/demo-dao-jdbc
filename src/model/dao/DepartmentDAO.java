package model.dao;

import java.util.List;

import model.entites.Department;

public interface DepartmentDAO {

	void insert(Department obj);

	void update(Department onj);

	void deleteById(Integer id);

	// Será responsavel por pegar o id e consultar no banco de dados um objeto com
	// este id
	// Se existir vai retornar se não existir vai retonar nulo
	Department findById(Integer id);

	// Será responsavel por trazer todos departmento
	List<Department> findAll();

}
