package DesignPatterns.factory;

public class ProfessionFactory {
	public Profession getProfession(String typeofProfession) {
		if (typeofProfession == null) {
			return null;
		}
		if (typeofProfession.equalsIgnoreCase("Doctor")) {
			return new Doctor();

		} else if (typeofProfession.equalsIgnoreCase("Engineer")) {

			return new Engineer();
		}
		return null;
	}
}
