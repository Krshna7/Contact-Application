package com.easetrack.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.easetrack.dao.ApplicationDao;
import com.easetrack.entity.Information;
import com.easetrack.entity.Items;
import com.easetrack.exception.EazetrackException;
import com.easetrack.utils.Constant;
import com.easetrack.utils.Response;


public class WebserviceImpl {
	
	
public String createInformation(String firstname, String lastname,
		String email, String phonenumber) {
	Response res = new Response();
	ApplicationDao appDao=new ApplicationDao();
	try {
		
		
			String output = appDao.createInformation(firstname,lastname,
					 email,  phonenumber);
	

		res.setData(output);
	} catch (EazetrackException ex) {
		res.setStatusCode(ex.getErrorCode());
		res.setError(ex);
	} catch (Exception ex) {
		res.setStatusCode(Constant.UNKNOWN_ERROR);
		res.setError(new EazetrackException(Constant.UNKNOWN_ERROR,
				Constant.UNKNOWN_ERROR_MESSAGE));
	}

	return res.writeResponse();
}

public String updateInformation(String firstname, String lastname,
		String email, String phonenumber, String idSel) {
	Response res = new Response();
	ApplicationDao appDao=new ApplicationDao();
	try {
		
		
		String output = appDao.updateInformation( firstname,  lastname,
				 email,  phonenumber,  idSel);
	

		res.setData(output);
	} catch (EazetrackException ex) {
		res.setStatusCode(ex.getErrorCode());
		res.setError(ex);
	} catch (Exception ex) {
		res.setStatusCode(Constant.UNKNOWN_ERROR);
		res.setError(new EazetrackException(Constant.UNKNOWN_ERROR,
				Constant.UNKNOWN_ERROR_MESSAGE));
	}

	return res.writeResponse();
}

public String updateInformationStatus(String idSel) {

	Response res = new Response();
	ApplicationDao appDao=new ApplicationDao();
	try {
		
		
		String output = appDao.updateInformationStatus(idSel);
	

		res.setData(output);
	} catch (EazetrackException ex) {
		res.setStatusCode(ex.getErrorCode());
		res.setError(ex);
	} catch (Exception ex) {
		res.setStatusCode(Constant.UNKNOWN_ERROR);
		res.setError(new EazetrackException(Constant.UNKNOWN_ERROR,
				Constant.UNKNOWN_ERROR_MESSAGE));
	}

	return res.writeResponse();

}
public String updateStatus(String idSel) {

	Response res = new Response();
	ApplicationDao appDao=new ApplicationDao();
	try {
		
		
		String output = appDao.updateStatus(idSel);
	

		res.setData(output);
	} catch (EazetrackException ex) {
		res.setStatusCode(ex.getErrorCode());
		res.setError(ex);
	} catch (Exception ex) {
		res.setStatusCode(Constant.UNKNOWN_ERROR);
		res.setError(new EazetrackException(Constant.UNKNOWN_ERROR,
				Constant.UNKNOWN_ERROR_MESSAGE));
	}

	return res.writeResponse();
}

public String DeleteInformation(String idSel) {

	Response res = new Response();
	ApplicationDao appDao=new ApplicationDao();
	try {
		
		
		String output = appDao.DeleteInformation(idSel);
	

		res.setData(output);
	} catch (EazetrackException ex) {
		res.setStatusCode(ex.getErrorCode());
		res.setError(ex);
	} catch (Exception ex) {
		res.setStatusCode(Constant.UNKNOWN_ERROR);
		res.setError(new EazetrackException(Constant.UNKNOWN_ERROR,
				Constant.UNKNOWN_ERROR_MESSAGE));
	}

	return res.writeResponse();

}
public String getInformationDetails() {

	
	Response res = new Response();
	ApplicationDao appDao=new ApplicationDao();
	try {
		
		
		List<Information> output = appDao.getInformationDetails();
	

		res.setData(output);
	} catch (EazetrackException ex) {
		res.setStatusCode(ex.getErrorCode());
		res.setError(ex);
	} catch (Exception ex) {
		res.setStatusCode(Constant.UNKNOWN_ERROR);
		res.setError(new EazetrackException(Constant.UNKNOWN_ERROR,
				Constant.UNKNOWN_ERROR_MESSAGE));
	}

	return res.writeResponse();

}
public String getActiveInformationDetails() {

	
	Response res = new Response();
	ApplicationDao appDao=new ApplicationDao();
	try {
		
		
		List<Information> output = appDao.getActiveInformationDetails();
	

		res.setData(output);
	} catch (EazetrackException ex) {
		res.setStatusCode(ex.getErrorCode());
		res.setError(ex);
	} catch (Exception ex) {
		res.setStatusCode(Constant.UNKNOWN_ERROR);
		res.setError(new EazetrackException(Constant.UNKNOWN_ERROR,
				Constant.UNKNOWN_ERROR_MESSAGE));
	}

	return res.writeResponse();

}
public String getInActiveInformationDetails() {

	
	Response res = new Response();
	ApplicationDao appDao=new ApplicationDao();
	try {
		
		
		List<Information> output = appDao.getInActiveInformationDetails();
	

		res.setData(output);
	} catch (EazetrackException ex) {
		res.setStatusCode(ex.getErrorCode());
		res.setError(ex);
	} catch (Exception ex) {
		res.setStatusCode(Constant.UNKNOWN_ERROR);
		res.setError(new EazetrackException(Constant.UNKNOWN_ERROR,
				Constant.UNKNOWN_ERROR_MESSAGE));
	}

	return res.writeResponse();
}
}