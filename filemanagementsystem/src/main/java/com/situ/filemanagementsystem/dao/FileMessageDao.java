package com.situ.filemanagementsystem.dao;


import java.sql.ResultSet;
import java.util.List;

import com.situ.filemanagementsystem.pojo.FileMessage;

public interface FileMessageDao {
	boolean fileUploadOne(FileMessage fileMessage);

	List<FileMessage> findAll();
	FileMessage getFileMessageFormSet(ResultSet rs);

	FileMessage findOneById(Long rowId);
}
