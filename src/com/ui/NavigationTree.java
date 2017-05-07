package com.ui;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/**
 * 导航树
 * */
public class NavigationTree extends JTree {
	private static final long serialVersionUID = -3837777246350087690L;

	public NavigationTree(DefaultMutableTreeNode root) {
		super(root);
		this.setRootVisible(false);
		this.setShowsRootHandles(true);
		this.setCellRenderer(new NavigationTreeCellRender());
		//展开第一层节点
		for (int i = 0; i < root.getChildCount(); i++) {
			DefaultMutableTreeNode node = (DefaultMutableTreeNode)root.getChildAt(i);
			this.expandPath(new TreePath(node.getPath()));
		}
	}
}

