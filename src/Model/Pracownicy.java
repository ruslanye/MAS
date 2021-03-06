package Model;

import java.sql.SQLException;
import java.util.ArrayList;

public class Pracownicy implements Table {

	@Override
	public ArrayList<ArrayList<String>> getContents(int...args) throws SQLException {	
		
		String sql = "SELECT * FROM pracownicy";
		
		if (args.length > 0)
			sql += " ORDER BY ";
				
		for (int i = 0; i < args.length; ++ i) {
			sql += args [i];
			if (i != args.length - 1)
				sql += ", ";
		}
		sql += ";";
	
		return Database.executeQuery(sql);
	}

	public boolean deleteItem (String id) throws SQLException {
		return Database.executeUpdate("DELETE FROM pracownicy WHERE id_pracownika = " + id + ";") != 0;
	}
	
	public boolean updateItem (String id, String newName, String newSurname, String newPesel, String newZatrudniony_od, String newZatrudniony_do) throws SQLException {
		String sql = "UPDATE pracownicy SET (imie, nazwisko, pesel, zatrudniony_od, zatrudniony_do) = ("
				+ Tables.nullCheck(newName) + ", "
				+ Tables.nullCheck(newSurname) + ", "
				+ Tables.nullCheck(newPesel) + ", " 
				+ Tables.nullCheck(newZatrudniony_od) + ", " 
				+ Tables.nullCheck(newZatrudniony_do) + ") WHERE id_pracownika = " + id + ";";
		return Database.executeUpdate(sql) != 0;
	}
		
	public boolean insertItem (String name, String surname, String pesel) throws SQLException {
		String sql = "INSERT INTO pracownicy VALUES ("
				+ "DEFAULT, "
				+ Tables.nullCheck(name) + ", "
				+ Tables.nullCheck(surname) + ", "
				+ Tables.nullCheck(pesel) + ", "
				+ "now(), "
				+ "NULL);";
		return Database.executeUpdate(sql) != 0;
	}
}
