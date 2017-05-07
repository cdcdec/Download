package com.ui;

import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

import com.navigation.DownloadNode;


public class NavigationTreeCellRender extends DefaultTreeCellRenderer {
	private static final long serialVersionUID = -4849537594130302059L;

	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean sel, boolean expanded, boolean leaf, int row,
			boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, sel, 
				expanded, leaf, row, hasFocus);
		//得到树节点
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)value;
		//得到节点对象
		DownloadNode obj = (DownloadNode)node.getUserObject();
		//设置文本与图片
		if (obj != null) {
			this.setIcon(obj.getImageIcon());
			this.setText(obj.getText());
		}
		return this;
	}
}

