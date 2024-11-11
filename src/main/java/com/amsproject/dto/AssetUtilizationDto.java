package com.amsproject.dto;

import java.util.Date;

public class AssetUtilizationDto {
   private long id;
   private String assets;
   private String assetsModel;
   private String issued;
   private Date issuedDate;
   private String notIssued;
   private Date purchasedDate;
   private String returned;
   private Date returnedDate;
public AssetUtilizationDto() {
	super();
	// TODO Auto-generated constructor stub
}
public AssetUtilizationDto(long id, String assets, String assetsModel, String issued, Date issuedDate, String notIssued,
		Date purchasedDate, String returned, Date returnedDate) {
	super();
	this.id = id;
	this.assets = assets;
	this.assetsModel = assetsModel;
	this.issued = issued;
	this.issuedDate = issuedDate;
	this.notIssued = notIssued;
	this.purchasedDate = purchasedDate;
	this.returned = returned;
	this.returnedDate = returnedDate;
}
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
