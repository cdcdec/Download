package com.state;

import javax.swing.ImageIcon;

import com.cdc.download.ContextHolder;
import com.model.Resource;
import com.util.ImageUtil;


public class Pause extends AbstractState {
	
	private static final long serialVersionUID = 4139280624781443355L;

	@Override
	public ImageIcon getIcon() {
		return ImageUtil.PAUSE_IMAGE;
	}

	@Override
	public String getState() {
		return "pause";
	}

	@Override
	public void init(Resource resource) {
		//资源暂停后取消任务
		ContextHolder.dh.stopTimer(resource);
	}

}
