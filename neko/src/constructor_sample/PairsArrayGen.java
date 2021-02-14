package constructor_sample;

import java.util.ArrayList;

public class PairsArrayGen {
	public static PairsArray createPairsArray(String name, Integer... values) {
		ArrayList<Pairs> m = new ArrayList();
		for(int value: values) {
			m.add(new Pairs(name, value));
		}
			return new PairsArray(m);
		}
}
