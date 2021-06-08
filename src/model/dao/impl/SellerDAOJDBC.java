package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.SellerDAO;
import model.entites.Department;
import model.entites.Seller;

public class SellerDAOJDBC implements SellerDAO {
	
	private Connection conn;
	
	public SellerDAOJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller onj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findById(Integer id) {

		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT SELLER.*,DEPARTMENT.NAME AS DEPNAME"
					+ "FROM SELLER INNER JOIN DEPARTMENT"
					+ "ON SELLER.DEPARTMENTID = DEPARTMENT.ID"
					+ "WHERE SELLER.ID = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			
			if(rs.next()) {
				Department dep = new Department();
				dep.setId(rs.getInt("DEPARTMENTID"));
				dep.setName(rs.getString("DEPNAME"));
				Seller obj = new Seller();
				obj.setId(rs.getInt("ID"));
				obj.setName(rs.getString("NAME"));
				obj.setEmail(rs.getString("EMAIL"));
				obj.setBaseSalary(rs.getDouble("BASESALARY"));
				obj.setBirthDate(rs.getDate("BIRTHDATE"));
				obj.setDepartment(dep);
				return obj;
				
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		
		
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
