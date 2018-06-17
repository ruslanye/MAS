package Model;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AnkietyLekarze implements Table {

	@Override
	public ArrayList<ArrayList<String>> getContents() {
		return Database.executeQuery("SELECT * FROM ankiety_lekarze;");
	}
	
	public boolean deleteItem (int id) {
		return Database.executeUpdate("DELETE FROM ankiety_lekarze WHERE id_ankiety = " + id + ";") != 0;
	}
	
	public boolean insertItem (int lekarzId, Date date, int uprzejmosc, int opanowanie, int informacyjnosc, int dokladnosc_badan) {
		String sql = "INSERT INTO ankiety_lekarze VALUES ("
				+ "DEFAULT,"
				+ lekarzId + ","
				+ date + ","
				+ uprzejmosc + ","
				+ opanowanie + ","
				+ informacyjnosc + ","
				+ dokladnosc_badan + ");";
		return Database.executeUpdate(sql) != 0;
	}
	
	public ArrayList<ArrayList<String>> alphabeticRanking (Date from, Date to, int specjalizacjaId) {
		return Database.executeQuery("SELECT * from ranking_alfabetyczny (" + from + ", " + to + ", " + specjalizacjaId + ");");
	}
	
	public ArrayList<ArrayList<String>> bestIn (Date from, Date to, String cecha) {
		return Database.executeQuery("SELECT * from ranking_cecha (" + from + ", " + to + ", " + cecha + ");");
	}
	
	public ArrayList<ArrayList<String>> bestAvg (Date from, Date to, int specjalizacjaId) {
		return Database.executeQuery("SELECT * from ranking_specjalizacje (" + from + ", " + to + ", " + specjalizacjaId + ");");
	}

}
