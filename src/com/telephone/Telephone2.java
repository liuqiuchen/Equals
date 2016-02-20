package com.telephone;

//Telephone2是继承父类Telephone1的子类
public class Telephone2 extends Telephone1 {
	public float screen = 5.5f;
	public float cpu = 4.0f;
	
	//重写equals()方法
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(cpu);
		result = prime * result + Float.floatToIntBits(screen);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telephone2 other = (Telephone2) obj;
		if (Float.floatToIntBits(cpu) != Float.floatToIntBits(other.cpu))
			return false;
		if (Float.floatToIntBits(screen) != Float.floatToIntBits(other.screen))
			return false;
		return true;
	}
	
}
