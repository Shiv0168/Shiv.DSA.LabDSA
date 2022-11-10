package greatLearning.iitr.dsa.labsession3.balancedBrackets;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import greatLearning.iitr.dsa.labsession3.balancedBrackets.BalancedBracketsChecker;

public class BalancedBracketsChecker {
	
	private String brackets;

	private Set<Character> openBracketsSet;
	private Set<Character> closedBracketsSet;

	private Stack<Character> bracketsStack;

	public BalancedBracketsChecker(String brackets) {

		this.brackets = brackets;

		closedBracketsSet = new HashSet<>();
		openBracketsSet = new HashSet<>();

		closedBracketsSet = new HashSet<>();
		closedBracketsSet.add(')');
		closedBracketsSet.add(']');
		closedBracketsSet.add('}');

	}

	public boolean check() {

		if (brackets.length() %2 != 0) {
			return false;
		}

		openBracketsSet = BracketsUtils.getOpenBrackets();
		closedBracketsSet = BracketsUtils.getCloseBrackets();

		for (int index = 0; index < brackets.length(); index++) {

			char aCharacter = brackets.charAt(index);

			if (openBracketsSet.contains(aCharacter)) {

				bracketsStack.push(aCharacter);
				
			} else if (closedBracketsSet.contains(aCharacter)) {

				BracketPair bracketPairObj = BracketsUtils.getBracketPair(aCharacter);

				Character openBracketCharFromStack = bracketsStack.pop();

				if (bracketPairObj.getOpenChar().equals(openBracketCharFromStack)) {

				} else {
					return false;
				}

			} else {
				System.out.println("Invalid character ->" + aCharacter);
			}
		}

		boolean successCondition = bracketsStack.isEmpty();
		if (successCondition) {
			return true;
		} else {
			return false;
		}
	}

}