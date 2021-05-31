package co.yedam.test;

import java.util.Arrays;

/*
 *  기본데이터 8타입은 기본값 0으로 초기화
 *  참조변수(String, [])의 초기값은 null
 */

public class FieldInitValue {
	
	byte bytefield;
	short shortfield;
	int intField;
	long longFieldField;
	
	boolean booleanField;
	char charField;
	float floatField;
	double doubleField;
	
	int[] arrField;
	String referenceField;
	
	//생성자
	
	FieldInitValue(int intFd, double doubleFd) {
		intField = intFd;
		doubleField = doubleFd;
	}
	@Override
	public String toString() {
		return "FieldInitValue [bytefield=" + bytefield + ", shortfield=" + shortfield + ", intField=" + intField
				+ ", longFieldField=" + longFieldField + ", booleanField=" + booleanField + ", charField=" + charField
				+ ", floatField=" + floatField + ", doubleField=" + doubleField + ", arrField="
				+ Arrays.toString(arrField) + ", referenceField=" + referenceField + "]";
	}
}
