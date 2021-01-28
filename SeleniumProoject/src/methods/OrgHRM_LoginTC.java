package methods;

import java.io.IOException;

public class OrgHRM_LoginTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		OrgMaster om = new OrgMaster();
		
		String res = om.orgLaunch(om.url);
		System.out.println("Application Launch "+res);
		
		res = om.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = om.orgLogout();
		System.out.println("Application Logout "+res);
		
		om.orgClose();
		System.out.println("Application Closed Successfully");
		 
	}

}