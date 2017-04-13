package com.easetrack.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Webservice {
	private WebserviceImpl impl = new WebserviceImpl();

	
	// new methods
	
	
	@GET
	@Path("/createInformation")
	@Produces(MediaType.APPLICATION_JSON)
	public String createInformation(@QueryParam("firstname") String firstname,
			@QueryParam("lastname") String lastname,@QueryParam("email") String email,@QueryParam("phonenumber") String phonenumber) {

		return impl.createInformation(firstname, lastname,email,phonenumber);
	}
	
	@GET
	@Path("/updateInformation")
	@Produces(MediaType.APPLICATION_JSON)
	public String updateInformation(@QueryParam("firstname") String firstname,@QueryParam("lastname") String lastname,@QueryParam("email") String email,@QueryParam("phonenumber") String phonenumber,@QueryParam("idSel") String idSel) {

		return impl.updateInformation( firstname,  lastname,
				 email,  phonenumber, idSel);
	}
	

	@GET
	@Path("/updateInformationStatus")
	@Produces(MediaType.APPLICATION_JSON)
	public String updateInformationStatus(@QueryParam("idSel") String idSel) {

		return impl.updateInformationStatus(idSel);
	}
		@GET
		@Path("/updateStatus")
		@Produces(MediaType.APPLICATION_JSON)
		public String updateStatus(@QueryParam("idSel") String idSel) {

			return impl.updateStatus(idSel);
	}
	@GET
	@Path("/DeleteInformation")
	@Produces(MediaType.APPLICATION_JSON)
	public String DeleteInformation(@QueryParam("idSel") String idSel) {

		return impl.DeleteInformation(idSel);
	}
	
	@GET
	@Path("/getInformationDetails")
	@Produces(MediaType.APPLICATION_JSON)
	public String getInformationDetails() {

		return impl.getInformationDetails();
	}
	@GET
	@Path("/getActiveInformationDetails")
	@Produces(MediaType.APPLICATION_JSON)
	public String getActiveInformationDetails() {

		return impl.getActiveInformationDetails();
	}
	@GET
	@Path("/getInActiveInformationDetails")
	@Produces(MediaType.APPLICATION_JSON)
	public String getInActiveInformationDetails() {

		return impl.getInActiveInformationDetails();
	}
	//  ITEM API STARTS FROMHERE
	
	}
