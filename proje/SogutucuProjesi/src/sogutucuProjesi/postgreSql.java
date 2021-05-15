package sogutucuProjesi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public  class postgreSql implements IVeritabaniYonetim {//Dependency Inversion
	static Connection connection=null;
	@Override
	public void baglan() {
		String url="jdbc:postgresql://localhost:5432/SogutucuProjesi";
		try {
			connection=DriverManager.getConnection(url,"postgres","12345");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void ekranaYaz() {
		System.out.println("PostreSQL sunucusuna baglanildi.");
	}
	static ResultSet sorgula(String sql_sorgu) {
		try {
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery(sql_sorgu);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override 
 	public void baglantiKes() {
			try {
				connection.close();
			}catch (SQLException e) {
				System.out.println("Baðlanti kesilmedi");
			}
	}
	boolean dogrula(String kullaniciAdi,String parola) {
		try {
			String sql_sorgu="SELECT * FROM \"kullanicilar\" WHERE \"ad\"='"+kullaniciAdi+"' AND \"sifre\"='"+ parola+"'";
			baglan();
			ResultSet rs=sorgula(sql_sorgu);
			if(!rs.next()) {
				return false;
			}
			else {
				baglantiKes();
				return true;
			}
		} catch (SQLException e) {
			return false;
		}
	}
	
}
