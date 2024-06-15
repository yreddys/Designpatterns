package DesignPatterns.factory;

public class client {
	public static void main(String[] args) {
		ProfessionFactory ProfessionFactory = new ProfessionFactory();
		Profession doc = ProfessionFactory.getProfession("Doctor");
		doc.print();
	}
}
