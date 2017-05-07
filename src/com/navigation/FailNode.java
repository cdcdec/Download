package com.navigation;

import javax.swing.ImageIcon;

import com.util.ImageUtil;
/**
 * 下载失败导航节点
 * @author aaron
 *
 */
public class FailNode implements DownloadNode {

	public ImageIcon getImageIcon() {
		return ImageUtil.FAIL_NODE_IMAGE;
	}

	public String getText() {
		return "下载失败";
	}

}

