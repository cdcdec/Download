package com.state;

import javax.swing.ImageIcon;

import com.util.ImageUtil;

public class Downloading extends AbstractState {
	private static final long serialVersionUID = -7449062409686426278L;
	@Override
	public ImageIcon getIcon() {
		return ImageUtil.DOWNLOADING_IMAGE;
	}
	public String getState() {
		return "downloading";
	}
}
