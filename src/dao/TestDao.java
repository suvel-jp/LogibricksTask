package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.Patiant;

public class TestDao {


	
	public static int save(Patiant bean){
		int status=0;
		
		Connection con=DB.getCon();
		try {
			PreparedStatement ps= con.prepareStatement("insert into Patiants values(?,?,?,?,?,?,?,?,?)");
		    ps.setString(1, bean.getFname());
            ps.setString(2, bean.getLname());
            ps.setString(3, bean.getCity());
            ps.setString(4, bean.getHospital());
            ps.setInt(5, bean.getAge());
            ps.setDouble(6, bean.getTotal());
            ps.setDate(7, (Date) bean.getAdmission());
            ps.setDate(8, (Date) bean.getDob());
            ps.setDate(9, (Date) bean.getDischarge());
            
            
            status=ps.executeUpdate();
		}
		
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		return status;
		
		
		
	}
	
	
	
	
}
