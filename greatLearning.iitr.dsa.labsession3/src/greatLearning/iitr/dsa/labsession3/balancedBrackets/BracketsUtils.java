package greatLearning.iitr.dsa.labsession3.balancedBrackets;

import java.util.HashSet;
import java.util.Set;

public class BracketsUtils {

	static Set<BracketPair> bracketPairSet = new HashSet<>();

	static {

		BracketPair one = new BracketPair('(', ')');
		BracketPair two = new BracketPair('[', ']');
		BracketPair three = new BracketPair('{', '}');

		bracketPairSet.add(one);
		bracketPairSet.add(two);
		bracketPairSet.add(three);

	}

	static BracketPair getBracketPair(Character closeBracketPair) {

		for (BracketPair aBracketPair : bracketPairSet) {

			if (aBracketPair.getCloseChar().equals(closeBracketPair)) {
				return aBracketPair;
			}
		}
		return null;
	}

	static Set<Character> getOpenBrackets() {

		Set<Character> results = new HashSet<>();

		for (BracketPair aBracketPair : bracketPairSet) {

			results.add(aBracketPair.getOpenChar());
		}
		return results;
	}

	static Set<Character> getCloseBrackets() {

		Set<Character> results = new HashSet<>();

		for (BracketPair aBracketPair : bracketPairSet) {

			results.add(aBracketPair.getCloseChar());
		}
		return results;
	}

}
