package Model;

import java.util.ArrayList;

public class Skierowania implements Table {

	@Override
	public ArrayList<ArrayList<String>> getContents() {
		return Database.executeQuery("SELECT * FROM skierowania;");
	}
	
	public boolean deleteItem (int id) {
		return Database.executeUpdate("DELETE FROM skierowania WHERE nr_skierowania = " + id + ";") != 0;
	}
	
	public boolean updateItem (int id, int newWizytaId, int newSpecId, int newCelId, String newDesc) {
		String sql = "UPDATE skierowania SET (id_wizyty, id_specjalizacji, id_celu, opis) = ("
				+ newWizytaId + ", "
				+ newSpecId + ", "
				+ newCelId + ", "
				+ "'" + newDesc + "') WHERE nr_skierowania = " + id + ";";
		return Database.executeUpdate(sql) != 0;
	}
	
	public boolean insertItem (int wizytaId, int specjalizacjaId, int celId, String desc) {
		String sql = "INSERT INTO skierowania VALUES ("
				+ "DEFAULT, "
				+ wizytaId + ", "
				+ specjalizacjaId + ", "
				+ celId + ", "
				+ "'" + desc + "');";
		return Database.executeUpdate(sql) != 0;
	}

}
