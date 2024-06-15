package DesignPatterns.prototype;

import java.util.Hashtable;

public class ProfessionCache {
	private static Hashtable<Integer, Profession> professionmap = new Hashtable<>();

	public static Profession getCloneNewProfession(int id) throws CloneNotSupportedException {
		Profession cachedProfessionInstance = professionmap.get(id);
		return (Profession) cachedProfessionInstance.cloningMethod();
	}

	public static void loadprofessionCache() {
		Doctor doc = new Doctor();
		doc.id = 1;
		professionmap.put(doc.id, doc);
		Engineer en = new Engineer();
		en.id = 2;
		professionmap.put(en.id, en);
	}
}
