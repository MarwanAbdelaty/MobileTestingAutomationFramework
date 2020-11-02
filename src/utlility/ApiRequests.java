package utlility;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ApiRequests {
	
	private  String GetClinicSpecialties = 
			"https://awsbooking.andalusiagroup.net/OnlineBookingService/api/Speciality/GetClinicSpecialtiesData?CountryID=1&isArabic=false";

	public void Get_ClinicSpecialties() throws UnirestException {
		
		HttpResponse<JsonNode> jsonresponse =
				Unirest.get(GetClinicSpecialties).asJson();
		System.out.println("Status Code :"+ jsonresponse.getStatus());
		System.out.println("Status Message :"+ jsonresponse.getStatusText());
		System.out.println("-------------------------");
		System.out.println("Response Body :"+ jsonresponse.getBody());
		
	}
	
	public static void main(String[] args) throws UnirestException {
		// TODO Auto-generated method stub
		ApiRequests apiresquests = new ApiRequests();
		apiresquests.Get_ClinicSpecialties();
	}
	
}
