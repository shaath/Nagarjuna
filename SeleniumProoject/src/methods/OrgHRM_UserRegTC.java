package methods;

import java.io.IOException;

public class OrgHRM_UserRegTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		OrgMaster om = new OrgMaster();
		
		String res = om.orgLaunch(om.url);
		System.out.println("Application Launch "+res);
		
		res = om.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = om.orgUserReg("Nagarjuna K", "AANagrjunaK", "AANagrjunaK@1234567890", "AANagrjunaK@1234567890");
		System.out.println("User registration "+res);
		
		res = om.orgLogout();
		System.out.println("Application Logout "+res);
		
		om.orgClose();
		System.out.println("Application Closed Successfully");

	}

}
