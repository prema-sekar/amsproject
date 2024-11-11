package com.amsproject.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="assetutilization")
public class AssetUtilization {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="assets")
	private String assets;
	@Column(name = "asset_model")
	private String assetsModel;
	@Column(name = "issued")
	private String issued;
	@Column(name = "issued_date")
	private Date issuedDate;
	@Column(name = "not_issued")
	private String notIssued;
	@Column(name = "purchased_date")
	private Date purchasedDate;
	@Column(name = "returned")
	private String returned;
	@Column(name = "returned_date")
	private Date returnedDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAssets() {
		return assets;
	}
	public void setAssets(String assets) {
		this.assets = assets;
	}
	public String getAssetsModel() {
		return assetsModel;
	}
	public void setAssetsModel(String assetsModel) {
		this.assetsModel = assetsModel;
	}
	public String getIssued() {
		return issued;
	}
	public void setIssued(String issued) {
		this.issued = issued;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public String getNotIssued() {
		return notIssued;
	}
	public void setNotIssued(String notIssued) {
		this.notIssued = notIssued;
	}
	public Date getPurchasedDate() {
		return purchasedDate;
	}
	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	public String getReturned() {
		return returned;
	}
	public void setReturned(String returned) {
		this.returned = returned;
	}
	public Date getReturnedDate() {
		return returnedDate;
	}
	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}
   
}
