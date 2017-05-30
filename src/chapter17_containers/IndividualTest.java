package chapter17_containers;
import java.util.*;
import com.zhangxiuwu.typeinfo.pets.*;

public class IndividualTest {

	public static void main(String[] args) {
		Set<Individual> set = new HashSet<Individual>();
		PairT t = new PairT(1, "->");
		Comparator cp =  Map.Entry.comparingByKey();
	}
	
	
	
	static class PairT implements Map.Entry<Integer, String>
	{
		private int k;
		private String v;
		public PairT(int k, String v){
			this.k = k;
			this.v = v;
		}
		
		@Override
		public Integer getKey() {
			return k;
		}
		@Override
		public String getValue() {
			return v;
		}
		@Override
		public String setValue(String value) {
			String tmp = this.v;
			this.v = value;
			return tmp;
		}
	}
	
}
