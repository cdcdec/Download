package com.state;

import javax.swing.ImageIcon;

import com.cdc.download.ContextHolder;
import com.model.Resource;
import com.util.FileUtil;
import com.util.ImageUtil;


public class Finished extends AbstractState {
	private static final long serialVersionUID = 9162707108242179698L;

	@Override
	public ImageIcon getIcon() {
		return ImageUtil.FINISHED_IMAGE;
	}

	public String getState() {
		return "finished";
	}

	public void init(Resource resource) {
		//删除临时文件
		FileUtil.deletePartFiles(resource);
		//资源下载完成后取消任务
		ContextHolder.dh.stopTimer(resource);
	}
	
	
}