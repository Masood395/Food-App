package com.tap.userdetailsdao;

import java.util.List;

import com.tap.userdetails.UserDetails;

public interface UserDetailsDAO {

	void save(UserDetails userDetails);
    UserDetails findById(int id);
    List<UserDetails> findAll();
    void update(UserDetails userDetails);
    void delete(int id);
	
}
