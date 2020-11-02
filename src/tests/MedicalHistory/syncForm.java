package tests.MedicalHistory;

import org.testng.annotations.Test;

import pages.MedicalHistory.SyncForm;
import utlility.BaseSetup;

public class syncForm extends BaseSetup{
	
	 @Test
	 public void OpenSyncForm() throws InterruptedException {
		
		SyncForm sf = new SyncForm(androidDriver);
	//	sf.ClickonFloatingButton();
		sf.ClickonConnectWithHospitals();
		sf.ClickonSelectHospital();
		sf.SelectHospitalName(1);
		sf.GetText();
		sf.insertFileNumber("5120125AAC");
		//sf.Gettxt_FileNumberInThisHospital();
		sf.insertMobileNumber("0102230887");
		sf.insertPassportID("PS100200");
		sf.ClickonSaveIcon();
		sf.Gettxt_MessageText();
		sf.ClickonCancelCall();
		sf.ClickonCancelIcon();
	 }

}
