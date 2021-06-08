package model.dao;

import java.util.List;

import model.entites.Seller;

public interface SellerDAO {

	void insert(Seller obj);

	void update(Seller onj);

	void deleteById(Integer id);

	// Será responsavel por pegar o id e consultar no banco de dados um objeto com
	// este id
	// Se existir vai retornar se não existir vai retonar nulo
	Seller findById(Integer id);

	// Será responsavel por trazer todos vendedores
	List<Seller> findAll();

	
}
