
public class Main {

	public static void main(String[] args) {
		
		BooleanNetwork nw = new BooleanNetwork(5, 3);
		
		nw.setFunction(1, "01110111");
		nw.setFunction(2, "01100111");
		nw.setFunction(3, "01101101");
		nw.setFunction(4, "00010111");
		nw.setFunction(5, "00000001");
		
		nw.setParams(1, 5, 2, 4);
		nw.setParams(2, 3, 5, 4);
		nw.setParams(3, 3, 1, 5);
		nw.setParams(4, 3, 4, 4);
		nw.setParams(5, 5, 4, 1);
		
		String states[] = new String[32];
		for (int i = 0; i < 32; i++) {
			String state = Integer.toBinaryString(i);
			int zerosC = 5 - state.length();
			String zerosS = "";
			for (int j = 0; j < zerosC; j++)
				zerosS += "0";
			state = zerosS + state;
			states[i] = state;
		}
		
		System.out.println("digraph G {");
		for (String s : states) {
			System.out.println("    " + s + " -> " + nw.step(s) + ";");
		}
		System.out.println("}");
	}
}
