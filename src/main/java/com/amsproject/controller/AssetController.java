package com.amsproject.controller;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amsproject.dto.AssetUtilizationDto;
import com.amsproject.model.AssetUtilization;
import com.amsproject.service.AssetUtilizationService;

@RestController
@RequestMapping("assetutilization")
public class AssetController {
	@Autowired
	private AssetUtilizationService assetUtilizationService;
	@PostMapping("/saveasset")
	public Map<String, Object> saveassetutilization(@RequestBody AssetUtilizationDto assetUtilizationDto) {
		AssetUtilization assetUtilization = assetUtilizationService.saveAssetUtilizationInfo(assetUtilizationDto);
		Map<String, Object> responsive = new HashMap<>();
		if (assetUtilization != null) {
			responsive.put("Status", HttpStatus.OK);
			responsive.put("message", "sucess");
			responsive.put("timestamp",new Date());
			return responsive;
		}
		responsive.put("Status", HttpStatus.BAD_REQUEST);
		responsive.put("message", "failed");
		responsive.put("timestamp",new Date());

		return responsive;

	}
	@GetMapping("/GetAsset")
	public List<AssetUtilization>getasset(){
		return assetUtilizationService.getAllAsset();
	}
}

        