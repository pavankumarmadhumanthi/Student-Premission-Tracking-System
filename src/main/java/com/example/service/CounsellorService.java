
package com.example.service;

import java.util.List;

import com.example.entity.Counsellor_Info;

public interface CounsellorService {
	public String insertCounsellor(Counsellor_Info counsellor);
	public Counsellor_Info findCounsellor(Integer counsellorid);
	public List<Counsellor_Info> findAllCounsellor();
	public String grantPermission();
	public void deleteCounsellor(Integer counsellorid);
	public String verifyLogin();
	

}
