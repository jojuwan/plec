package com.acorn2.plec.api.lecture.Service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.acorn2.plec.api.lecture.dto.LectureDto;
import com.acorn2.plec.api.lecture.dto.req.LectureCreateReqDto;
import com.acorn2.plec.api.lecture.dto.req.LectureReadReqDto;
import com.acorn2.plec.api.lecture.dto.req.LectureUpdateReqDto;
import com.acorn2.plec.api.lecture.dto.res.LectureReadListResDto;


public interface LectureService {
	
	LectureReadListResDto LectureList(LectureReadReqDto lectureReadReqDto);
	
	LectureDto LectureOne(int lecNum);
	
	void LectureInsert(LectureCreateReqDto lectureCreateReqDto,MultipartFile file, HttpServletRequest request);
	
	void LectureDelete(int lecNum);

	void LectureUpdate(LectureUpdateReqDto lectureUpdateReqDto, MultipartFile file, HttpServletRequest request);

	void batchLectureDelete();
}