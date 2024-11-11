package com.amsproject.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amsproject.model.AssetUtilization;
@Repository
public interface AssetUtilizationRepositoryService extends JpaRepository<AssetUtilization, Long> {

}
