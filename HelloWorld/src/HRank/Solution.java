package HRank;

import java.util.ArrayList;
import java.util.*;
import java.text.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.*;
import java.util.regex.*;

import com.sun.prism.j2d.paint.MultipleGradientPaint.ColorSpaceType;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
	RED, GREEN
}

abstract class Tree {

	private int value;
	private Color color;
	private int depth;

	public Tree(int value, Color color, int depth) {
		this.value = value;
		this.color = color;
		this.depth = depth;
	}

	public Tree() {
		// TODO Auto-generated constructor stub
	}

	public int getValue() {
		return value;
	}

	public Color getColor() {
		return color;
	}

	public int getDepth() {
		return depth;
	}

	public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

	private ArrayList<Tree> children = new ArrayList<>();

	public TreeNode(int value, Color color, int depth) {
		super(value, color, depth);
	}

	public void accept(TreeVis visitor) {
		visitor.visitNode(this);

		for (Tree child : children) {
			child.accept(visitor);
		}
	}

	public void addChild(Tree child) {
		children.add(child);
	}
}

class TreeLeaf extends Tree {

	public TreeLeaf(int value, Color color, int depth) {
		super(value, color, depth);
	}

	public void accept(TreeVis visitor) {
		visitor.visitLeaf(this);
	}
}

abstract class TreeVis {
	public abstract int getResult();

	public abstract void visitNode(TreeNode node);

	public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
	private int result;

	public int getResult() {

		return result;
	}

	public void visitNode(TreeNode node) {
		// No Implement
	}

	public void visitLeaf(TreeLeaf leaf) {
		result += leaf.getValue();
	}
}

class ProductOfRedNodesVisitor extends TreeVis {
	private int result = 1;

	private void visitSth(Tree t) {
		if (t.getColor() == Color.RED)
			result *= t.getValue();
	}

	public int getResult() {
		return result;
	}

	public void visitNode(TreeNode node) {
		visitSth((Tree) node);
	}

	public void visitLeaf(TreeLeaf leaf) {
		visitSth(leaf);
	}
}

class FancyVisitor extends TreeVis {
	// returns the absolute difference between
	// the sum of the values of non-leaf nodes at even depth and
	// the sum of the values of green leaf nodes
	private int sumValuesNodesEvenDepth;
	private int sumValuesGreenLeafs;

	public int getResult() {

		return Math.abs(sumValuesNodesEvenDepth - sumValuesGreenLeafs);
	}

	public void visitNode(TreeNode node) {
		if ((node.getDepth() % 2) == 0)
			sumValuesNodesEvenDepth += node.getValue();
	}

	public void visitLeaf(TreeLeaf leaf) {
		if((leaf.getColor()==Color.GREEN))
			sumValuesGreenLeafs +=leaf.getValue();
	}

}

public class Solution {

	public static Tree solve() {
		Tree tr = null;
		FileReader f;
		try {
			f = new FileReader("inp.txt");
			System.out.println("Start reading");
			Scanner sc = new Scanner(f);
			int num = sc.nextInt();
			if (num > 0) {

				int[] weights = new int[num];
				// read weights
				for (int i = 0; i < num; i++) {
					weights[i] = sc.nextInt();
				}
				sc.nextLine();
				int[] colors = new int[num];
				for (int i = 0; i < num; i++) {
					colors[i] = sc.nextInt();
				}
				int[] depth = new int[num];
				int[] fathers = new int[num];
				boolean[] notleafs = new boolean[num];
				for (int i = 0; i < num - 1; i++) {
					sc.nextLine();
					int first = sc.nextInt();
					int second = sc.nextInt();
					notleafs[first - 1] = true;
					depth[second - 1] = depth[first - 1] + 1;
					fathers[second - 1] = first - 1;

				}
				tr = new TreeNode(weights[0], Color.values()[colors[0]], 0);
				ArrayList<Tree> elems = new ArrayList<Tree>();
				elems.add(tr);
				for (int i = 1; i < notleafs.length; i++) {
					boolean b = notleafs[i];
					if (b) {
						elems.add(new TreeNode(weights[i], Color.values()[colors[i]], depth[i]));
					} else {
						elems.add(new TreeLeaf(weights[i], Color.values()[colors[i]], depth[i]));
					}
				}
				for (int i = 1; i < num; i++) {
					((TreeNode) elems.get(fathers[i])).addChild(elems.get(i));
				}
				System.out.println("Done reading");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// tr.ac;
		return tr;
	}

	public static void main(String[] args) {

		Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
		ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
		FancyVisitor vis3 = new FancyVisitor();

		root.accept(vis1);
		root.accept(vis2);
		root.accept(vis3);

		int res1 = vis1.getResult();
		int res2 = vis2.getResult();
		int res3 = vis3.getResult();

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}
}