package com.acorn2.FinalProject.lectureReview.dto;

import org.apache.ibatis.type.Alias;

import com.acorn2.FinalProject.common.dto.PagingDto;

import io.swagger.v3.oas.annotations.media.Schema;

@Alias("lectureReviewDto")
public class LectureReviewDto extends PagingDto{
	private int num;
	private String writer;
	private String content;
	private String target_id;
	private int ref_group;
	private int comment_group;
	private String deleted;
	private String regdate;
	private String profile;
	private int star;
    
    public LectureReviewDto() {}

	public LectureReviewDto(int num, String writer, String content, String target_id, int ref_group, int comment_group,
			String deleted, String regdate, String profile, int star) {
		super();
		this.num = num;
		this.writer = writer;
		this.content = content;
		this.target_id = target_id;
		this.ref_group = ref_group;
		this.comment_group = comment_group;
		this.deleted = deleted;
		this.regdate = regdate;
		this.profile = profile;
		this.star = star;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTarget_id() {
		return target_id;
	}

	public void setTarget_id(String target_id) {
		this.target_id = target_id;
	}

	public int getRef_group() {
		return ref_group;
	}

	public void setRef_group(int ref_group) {
		this.ref_group = ref_group;
	}

	public int getComment_group() {
		return comment_group;
	}

	public void setComment_group(int comment_group) {
		this.comment_group = comment_group;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}




    
}