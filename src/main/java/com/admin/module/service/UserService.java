package com.admin.module.service;

import java.util.List;


import com.admin.module.dto.PostUserDTO;
import com.admin.module.dto.UserDTO;

public interface UserService {

	List<UserDTO> retrieveUsers();
	List<UserDTO> retrieveNMUsers(); 
	List<UserDTO> retrieveAgentUsers();
	List<UserDTO> retrieveAdminUsers();
	/*
	 * List<NMUserDTO> retrieveNMUsers(String userType); List<AgentUserDTO>
	 * retrieveAgentUsers(String userType); List<AdminUserDTO>
	 * retrieveAdminUsers(String userType);
	 */
	UserDTO retrieveUser(int userId);

	UserDTO createUser(PostUserDTO newUserDTO, int userLocation);
	UserDTO createNMUser(PostUserDTO newUserDTO, int userLocation);

	void deleteUser(int userId);
	void editUser(int userId, int locationId, PostUserDTO newUserDTO);
	

	

}
