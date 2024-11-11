package com.amsproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amsproject.dto.AssetUtilizationDto;
import com.amsproject.model.AssetUtilization;
import com.amsproject.repositary.AssetUtilizationRepositoryService;

@Service
public class AssetUtilizationImpl implements AssetUtilizationService {
	@Autowired
	private AssetUtilizationRepositoryService assetUtilizationRepositoryService;

	@Override
	public AssetUtilization saveAssetUtilizationInfo(AssetUtilizationDto assetUtilizationDto) {
	    AssetUtilization asset=new AssetUtilization();
	    asset.setId(assetUtilizationDto.getId());
	    asset.setAssets(assetUtilizationDto.getAssets());
	    asset.setAssetsModel(assetUtilizationDto.getAssetsModel());
	    asset.setIssued(assetUtilizationDto.getIssued());
	    asset.setIssuedDate(assetUtilizationDto.getIssuedDate());
	    asset.setNotIssued(assetUtilizationDto.getNotIssued());
	    asset.setPurchasedDate(assetUtilizationDto.getPurchasedDate());
	    asset.setReturned(assetUtilizationDto.getReturned());
	    asset.setReturnedDate(assetUtilizationDto.getReturnedDate());
		return assetUtilizationRepositoryService.save(asset);
	}

	@Override
	public List<AssetUtilization> getAllAsset() {
		// TODO Auto-generated method stub
		return assetUtilizationRepositoryService.findAll();
	}


	


}
	
