package com.amsproject.service;

import java.util.List;

import com.amsproject.dto.AssetUtilizationDto;
import com.amsproject.model.AssetUtilization;

public interface AssetUtilizationService {

	public AssetUtilization saveAssetUtilizationInfo(AssetUtilizationDto assetUtilizationDto);

	public List<AssetUtilization> getAllAsset();

}
