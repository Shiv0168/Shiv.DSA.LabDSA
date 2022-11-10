package greatLearning.iitr.dsa.labsession3.findsuminBST;

public class BinarySearchTreePairFinderTest {

	public static void main(String[] args) {

		pairFinderTest(130);
		pairFinderTest(120);
		pairFinderTest(80);
		pairFinderTest(83);
		pairFinderTest(110);
		pairFinderTest(97);
		pairFinderTest(90);
	}

	static void pairFinderTest(int sum) {

		BinarySearchTree sampleTree = BinarySearchTreeTest.sampleBinaryTree1();
		BinarySearchTreePairFinder finder = new BinarySearchTreePairFinder(sampleTree);

		finder.findpair(sum);
		System.out.println("-------------------------");

	}

}
