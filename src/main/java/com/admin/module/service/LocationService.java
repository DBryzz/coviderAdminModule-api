package com.admin.module.service;

import java.util.List;

import com.admin.module.dto.LocationDTO;
import com.admin.module.dto.PostLocationDTO;

public interface LocationService {

	List<LocationDTO> retrieveLocations();
	LocationDTO retrieveLocation(int locationId);
	LocationDTO createLocation(PostLocationDTO locationDTO);
	void deleteLocation(int locationId);
	void editLocation(int locationId,  PostLocationDTO newlocationDTO);
	
	
	

}
