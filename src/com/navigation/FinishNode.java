package com.navigation;

import javax.swing.ImageIcon;

import com.util.ImageUtil;

/**
 * 下载完成节点
 * @author aaron
 *
 */
public class FinishNode implements DownloadNode {

	public ImageIcon getImageIcon() {
		return ImageUtil.FINISH_NODE_IMAGE;
	}

	public String getText() {
		return "下载完成";
	}

}

