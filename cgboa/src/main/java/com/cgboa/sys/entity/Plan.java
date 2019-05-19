package com.cgboa.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class Plan implements Serializable{

	private static final long serialVersionUID = -5489302834204409214L;
	private Integer planId;
	private Date createTime;
	private Date endTime;
	private String label;
	private String planComment;
	private String planContent;
	private String planSummary;
	private Date startTime;
	private Integer statusId;
	private String title;
	private Integer typeId;
	private Integer planuserId;
	private Integer attachId;
	
	
	
	public Plan(Integer planId, Date createTime, Date endTime, String label, String planComment, String planContent,
			String planSummary, Date startTime, Integer statusId, String title, Integer typeId, Integer planuserId,
			Integer attachId) {
		super();
		this.planId = planId;
		this.createTime = createTime;
		this.endTime = endTime;
		this.label = label;
		this.planComment = planComment;
		this.planContent = planContent;
		this.planSummary = planSummary;
		this.startTime = startTime;
		this.statusId = statusId;
		this.title = title;
		this.typeId = typeId;
		this.planuserId = planuserId;
		this.attachId = attachId;
	}
	
	
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getPlanComment() {
		return planComment;
	}
	public void setPlanComment(String planComment) {
		this.planComment = planComment;
	}
	public String getPlanContent() {
		return planContent;
	}
	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}
	public String getPlanSummary() {
		return planSummary;
	}
	public void setPlanSummary(String planSummary) {
		this.planSummary = planSummary;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Integer getPlanuserId() {
		return planuserId;
	}
	public void setPlanuserId(Integer planuserId) {
		this.planuserId = planuserId;
	}
	public Integer getAttachId() {
		return attachId;
	}
	public void setAttachId(Integer attachId) {
		this.attachId = attachId;
	}
	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", createTime=" + createTime + ", endTime=" + endTime + ", label=" + label
				+ ", planComment=" + planComment + ", planContent=" + planContent + ", planSummary=" + planSummary
				+ ", startTime=" + startTime + ", statusId=" + statusId + ", title=" + title + ", typeId=" + typeId
				+ ", planuserId=" + planuserId + ", attachId=" + attachId + "]";
	}
	
	
	
}
