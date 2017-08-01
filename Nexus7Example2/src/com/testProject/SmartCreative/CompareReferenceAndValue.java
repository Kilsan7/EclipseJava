/**********************************************************************************
 * 
 * Sololearn Java 예제 중에서 equal 기능 예제(Animal Class 이용)
 * CompareReferenceAndValue Class를 보라
 * 두 개의 Animal Type의 Object를 생성하여 비교한다.
 * System.out.println("a1.name == a2.name : "+ (a1.name == a2.name));
 * System.out.println("a1 == a2 equal test using equals method : "+ a1.equals(a2));
 * 즉, a1.equals(a2)로 비교해야 하는 것을 a1.name == a2.name 식으로 직관적으로 비교한다.
 * 
 **********************************************************************************/
package com.testProject.SmartCreative;

class Animal {
    String name;
    Animal(String n) {
        name = n;
    }
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj) {
			System.out.println("\"this == obj\"");
			return true;
		}
		if (getClass() != obj.getClass())
			return false;
		
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		System.out.println("\"this.name == obj.name\"!");
		return true;
	}	
}
public class CompareReferenceAndValue {

	public static void main(String[] args) {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println("a1==a2 : "+ (a1==a2));
        System.out.println("a1.name == a2.name : "+ (a1.name == a2.name));
        System.out.println("a1 == a2 equal test using equals method : "+ a1.equals(a2));
	}

}
