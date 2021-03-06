package com.tasolution.tasquare.model.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class UserInfo {

	@Id
	@Column(name = "user_id")
	private String userId;

	@Column(name = "password")
	private String password;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "mail_address")
	private String mailAddress;

	@Column(name = "regist_date", updatable = false)
	private Timestamp registDate;

	@Column(name = "update_date")
	private Timestamp updateDate;

	@OneToMany
    private List<Member> member;
	
	@OneToMany
	private List<Ticket> assignedTicket;

	@OneToMany
	private List<Ticket> createTicket;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public Timestamp getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Timestamp registDate) {
		this.registDate = registDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public List<Member> getMember() {
		return member;
	}

	public void setMember(List<Member> member) {
		this.member = member;
	}

	public List<Ticket> getAssignedTicket() {
		return assignedTicket;
	}

	public void setAssignedTicket(List<Ticket> assignedTicket) {
		this.assignedTicket = assignedTicket;
	}

	public List<Ticket> getCreateTicket() {
		return createTicket;
	}

	public void setCreateTicket(List<Ticket> createTicket) {
		this.createTicket = createTicket;
	}
}
