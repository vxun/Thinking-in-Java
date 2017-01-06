package chapter13;
import java.math.*;
import java.util.*;
public class Conversion {

	public static void main(String[] args){
		Formatter f = new Formatter(System.out);
		try {
			
			/**************** 字符 *****************/
			char u = 'a';
			System.out.println("u = 'a' ");
			f.format(" s: %s\n ", u); // a
//			f.format(" d: %d\n ", u); java.util.IllegalFormatConversionException: d != java.lang.Character
			f.format(" c: %c\n ", u); // a
			f.format(" b: %b\n ", u); // true
//			f.format(" f: %f\n ", u); java.util.IllegalFormatConversionException: f != java.lang.Character
//			f.format(" e: %e\n ", u); java.util.IllegalFormatConversionException: e != java.lang.Character
//			f.format(" x: %x\n ", u); java.util.IllegalFormatConversionException: x != java.lang.Character
			f.format(" h: %h\n ", u); // 61
			
			/**************** 整数 *****************/
			int v = 121;
			System.out.println(v);
			f.format(" s: %s\n ", v); // 121
			f.format(" d: %d\n ", v); // 121
			f.format(" b: %b\n ", v); // true
 			f.format(" c: %c\n ", v); // y
//			f.format(" f: %f\n ", v); java.util.IllegalFormatConversionException: f != java.lang.Integer
//			f.format(" e: %e\n ", v); java.util.IllegalFormatConversionException: e != java.lang.Integer
			f.format(" x: %x\n ", v); // 79
			f.format(" h: %h\n ", v); // 79
 			
			/**************** BigInteger *****************/
			BigInteger w = new BigInteger("50000000000000");
			System.out.println("w = new BigInteger(\"5000000000000\")");
			f.format(" s: %s\n ", w); // 121
			f.format(" d: %d\n ", w); // 121
			f.format(" b: %b\n ", w); // true
// 			f.format(" c: %c\n ", w);  java.util.IllegalFormatConversionException: c != java.math.BigInteger
//			f.format(" f: %f\n ", w); java.util.IllegalFormatConversionException: f != java.math.BigInteger
//			f.format(" e: %e\n ", w); java.util.IllegalFormatConversionException: e != java.math.BigInteger
			f.format(" x: %x\n ", w); // 79
			f.format(" h: %h\n ", w); // 79
			
			
			/**************** Double *****************/
			double x = 179.543;
			System.out.println(" x = 179.543 ");
			f.format(" s: %s\n ", x); // 121
//			f.format(" d: %d\n ", x); java.util.IllegalFormatConversionException: d != java.lang.Double
			f.format(" b: %b\n ", x); // true
// 			f.format(" c: %c\n ", x); java.util.IllegalFormatConversionException: c != java.lang.Double
			f.format(" f: %f\n ", x);  // 179.543000
			f.format(" e: %e\n ", x); 
//			f.format(" x: %x\n ", x); java.util.IllegalFormatConversionException: x != java.lang.Double
			f.format(" h: %h\n ", x); // 79
			
			/**************** Object *****************/
			Conversion y = new Conversion();
			System.out.println(" y = new Conversion() ");
			f.format(" s: %s\n ", y); //  s: chapter13.Conversion@28d93b30
//			f.format(" d: %d\n ", y); java.util.IllegalFormatConversionException: d != chapter13.Conversion
			f.format(" b: %b\n ", y); // true
// 			f.format(" c: %c\n ", y); java.util.IllegalFormatConversionException: c != chapter13.Conversion
//			f.format(" f: %f\n ", y); java.util.IllegalFormatConversionException: f != chapter13.Conversion
//			f.format(" e: %e\n ", y);  java.util.IllegalFormatConversionException: e != chapter13.Conversion
//			f.format(" x: %x\n ", y); java.util.IllegalFormatConversionException: x != chapter13.Conversion
			f.format(" h: %h\n ", y); // 79
			
			/**************** Object *****************/
			boolean z = false;
			System.out.println(" z = false ");
			f.format(" s: %s\n ", z); // 121
//			f.format(" d: %d\n ", z);  java.util.IllegalFormatConversionException: d != java.lang.Boolean
			f.format(" b: %b\n ", z); // false
// 			f.format(" c: %c\n ", z); java.util.IllegalFormatConversionException: c != java.lang.Boolean
//			f.format(" f: %f\n ", z); java.util.IllegalFormatConversionException: f != java.lang.Boolean
//			f.format(" e: %e\n ", z);  java.util.IllegalFormatConversionException: e != java.lang.Boolean
//			f.format(" x: %x\n ", z); java.util.IllegalFormatConversionException: x != java.lang.Boolean
			f.format(" h: %h\n ", z); // 79
			
		} finally {
			f.close();
		}
		
	}
	
}

/****
 u = 'a' 
 s: a
  c: a
  b: true
  h: 61
 121
 s: 121
  d: 121
  b: true
  c: y
  x: 79
  h: 79
 w = new BigInteger("5000000000000")
 s: 50000000000000
  d: 50000000000000
  b: true
  x: 2d79883d2000
  h: 8842a1a7
  x = 179.543 
 s: 179.543
  b: true
  f: 179.543000
  e: 1.795430e+02
  h: 1ef462c
  y = new Conversion() 
 s: chapter13.Conversion@28d93b30
  b: true
  h: 28d93b30
  z = false 
 s: false
  b: false
  h: 4d5
 
 * 
 * 
 * 
 * ****/



