package com.easetrack.dao;

import java.util.HashMap;
import java.util.List;

import com.easetrack.DB.Session;
import com.easetrack.DB.SessionBuilder;
import com.easetrack.entity.Information;
import com.easetrack.entity.Items;
import com.easetrack.exception.EazetrackException;
import com.easetrack.utils.Constant;
import com.easetrack.utils.Response;

public class ApplicationDao {

	

	public String createInformation(String firstname, String lastname,
			String email, String phonenumber) {


		Session session = null;
		String output = null;
		HashMap<String, Object> paramsMap = new HashMap<String, Object>();
		List<Information> infoList = null;
		try {
			session = SessionBuilder.getNewSession();
			
			String hql = " select new Information("
					+ Information.getAllColumns("u")
					+ ") from Information u  where (u.email='"+email+"' or  u.phonenumber='"+phonenumber+"')  ";

			infoList = (List<Information>) session.execute(hql,paramsMap);

			int len = infoList.size();

			if (len > 0) {
				output = "Already Exists";
			}else{
				Information info = new Information();
				info.setFirstname(firstname);
				info.setLastname(lastname);
				info.setEmail(email);
				info.setPhonenumber(phonenumber);
				info.setStatus("Active");
				session.saveTransaction(info);
				
				session.commitTransaction();
				output = "Succesfully Created";
			}
			

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return output;
	
	}
	
	public String DeleteInformation(String idsel) {

		Session session = null;
		String output = null;
		HashMap<String, Object> paramsMap = new HashMap<String, Object>();
		try {

			session = SessionBuilder.getNewSession();
		String hql = "delete from Information t where t.id = '" + idsel + "'";
		int result = session.executeHql(hql, paramsMap);
		session.commitTransaction();
		if(result==1){
			output="Deleted Successfully";
		}else{
			output="Deletion Failed";
		}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return output;
	}
	
	
	public String updateInformation(String firstname, String lastname,
			String email, String phonenumber,String idSel) {

		Session session = null;
		String output = null;
		List<Information> infoList = null;
		HashMap<String, Object> paramsMap = new HashMap<String, Object>();
		try {
			
			
			session = SessionBuilder.getNewSession();
			String hql = " select new Information("
					+ Information.getAllColumns("u")
					+ ") from Information u  where (u.email='"+email+"' or  u.phonenumber='"+phonenumber+"')  and u.id!='"+idSel+"' ";

			infoList = (List<Information>) session.execute(hql,paramsMap);

			int len = infoList.size();

			if (len > 0) {
				output = "Already Exists";
			}else{
		String hql1 = "update Information t set t.firstname = '"+firstname+"',t.lastname='"+lastname+"',t.email='"+email+"',t.phonenumber='"+phonenumber+"' where t.id = '"+idSel+"'";
		int result = session.executeHql(hql1, paramsMap);
		session.commitTransaction();
		if(result==1){
			output="Update Successfully";
		}else{
			output="Update Failed";
		}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return output;
	}
	
	public String updateInformationStatus(String idSel) {

		Session session = null;
		String output = null;
		HashMap<String, Object> paramsMap = new HashMap<String, Object>();
		try {
			
			
			session = SessionBuilder.getNewSession();
		String hql = "update Information t set t.status = 'InActive' where t.id = '"+idSel+"'";
		int result = session.executeHql(hql, paramsMap);
		session.commitTransaction();
		if(result==1){
			output="InActivated Successfully";
		}else{
			output="InActivation Failed";
		}
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return output;
	}

	public String updateStatus(String idSel) {

		Session session = null;
		String output = null;
		HashMap<String, Object> paramsMap = new HashMap<String, Object>();
		try {
			
			
			session = SessionBuilder.getNewSession();
		String hql = "update Information t set t.status = 'Active' where t.id = '"+idSel+"'";
		int result = session.executeHql(hql, paramsMap);
		session.commitTransaction();
		if(result==1){
			output="Activated Successfully";
		}else{
			output="Activation Failed";
		}
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return output;
	}
	
	@SuppressWarnings("unchecked")
	public List<Information> getInformationDetails() {

		Session session = null;

		List<Information> listUser = null;

		try {

			session = SessionBuilder.getNewSession();

			String hql = "select new Information("
					+ Information.getAllColumns("app")
					+ ") from Information app ";
			listUser = (List<Information>) session.execute(hql);

		} catch (Exception ex) {
			ex.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return listUser;

	}
	@SuppressWarnings("unchecked")
	public List<Information> getActiveInformationDetails() {

		Session session = null;

		List<Information> listUser = null;

		try {

			session = SessionBuilder.getNewSession();

			String hql = "select new Information("
					+ Information.getAllColumns("app")
					+ ") from Information app where app.status='Active' ";
			listUser = (List<Information>) session.execute(hql);

		} catch (Exception ex) {
			ex.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return listUser;

	}
	@SuppressWarnings("unchecked")
	public List<Information> getInActiveInformationDetails() {

		Session session = null;

		List<Information> listUser = null;

		try {

			session = SessionBuilder.getNewSession();

			String hql = "select new Information("
					+ Information.getAllColumns("app")
					+ ") from Information app where app.status='InActive' ";
			listUser = (List<Information>) session.execute(hql);

		} catch (Exception ex) {
			ex.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return listUser;

	}


}
