package DesignPatterns.prototype;

public class client {
	public static void main(String[] args) throws CloneNotSupportedException {
		ProfessionCache.loadprofessionCache();
		Profession docProfession= ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession);
		Profession engProfession= ProfessionCache.getCloneNewProfession(1);
		System.out.println(engProfession);
		Profession docProfession2= ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession2);
	}
}
