package com.navigation;

import javax.swing.ImageIcon;

import com.util.ImageUtil;

/**
 * 正在下载的导航节点
 * @author aaron
 *
 */
public class DownloadingNode implements DownloadNode {

	public ImageIcon getImageIcon() {
		return ImageUtil.DOWNLOADING_NODE_IMAGE;
	}

	public String getText() {
		return "正在下载";
	}

}
