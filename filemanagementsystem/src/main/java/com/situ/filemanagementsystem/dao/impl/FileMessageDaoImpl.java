package com.situ.filemanagementsystem.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<FileMessage> findAll() {
		List<FileMessage> finAllList = new ArrayList<FileMessage>();
		String sql = "SELECT * FROM TB_FILE WHERE ACTIVE_FLAG=1";
		ResultSet findAllSet = JDBCUtil.executeQuery(sql);
		try {
			while (findAllSet.next()) {
				finAllList.add(getFileMessageFormSet(findAllSet));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return finAllList;
	}

	public FileMessage getFileMessageFormSet(ResultSet rs) {
		try {
			return new FileMessage(rs.getLong("ROW_ID"), rs.getString("FILE_NAME"), rs.getString("FILE_TYPE"),
					rs.getDouble("FILE_SIZE"), rs.getString("FILE_PATH"), rs.getDate("FILE_LASTMODEFY"),
					rs.getInt("ACTIVE_FLAG"), rs.getString("CREATE_BY"), rs.getDate("CREATE_DATE"),
					rs.getString("UPDATE_BY"), rs.getDate("UPDATE_DATE"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public FileMessage findOneById(Long rowId) {
		FileMessage result = new FileMessage();
		result.setRowId(rowId);
		String sql = "SELECT * FROM TB_FILE WHERE ACTIVE_FLAG=1 AND ROW_ID =?";
		ResultSet findAllSet = JDBCUtil.executeQuery(sql,rowId);
		try {
			while (findAllSet.next()) {
				result = getFileMessageFormSet(findAllSet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
