package com.state;

import javax.swing.ImageIcon;

import com.util.ImageUtil;


public class Connecting extends AbstractState {
	private static final long serialVersionUID = 3809806692238829565L;

	@Override
	public ImageIcon getIcon() {
		return ImageUtil.CONNECTING_IMAGE;
	}
	
	public String getState() {
		return "connecting";
	}

	
}
