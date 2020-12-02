package com.situ.filemanagementsystem.dao.impl;

import com.situ.filemanagementsystem.dao.FileMessageDao;
import com.situ.filemanagementsystem.pojo.FileMessage;
import com.situ.filemanagementsystem.util.JDBCUtil;

public class FileMessageDaoImpl implements FileMessageDao {

	@Override
	public boolean fileUploadOne(FileMessage fileMessage) {
		String sql = "INSERT INTO `test`.`TB_FILE` (`FILE_NAME`, `FILE_TYPE`, `FILE_SIZE`, `FILE_PATH`, `FILE_LASTMODEFY`, `ACTIVE_FLAG`, `CREATE_BY`, `CREATE_DATE`, `UPDATE_BY`, `UPDATE_DATE`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";
		int num = JDBCUtil.executeUpdate(sql, fileMessage.getFileName(), fileMessage.getFileType(),
				fileMessage.getFileSize(), fileMessage.getFilePath(), fileMessage.getFileLastModefy(),
				fileMessage.getActiveFlag(), fileMessage.getCreateBy(), fileMessage.getCreateDate(),
				fileMessage.getUpdateBy(), fileMessage.getUpdateDate());
		if (num > 0) {
			return true;
		}
		return false;
	}

}
