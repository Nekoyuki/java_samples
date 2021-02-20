package array_list_sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	    List<String> c = new ArrayList<>(Arrays.asList("赤","黄","青"));
	    c.add("オレンジ");
	    System.out.println(c); //[赤, 黄, 青, オレンジ]
	}
}
