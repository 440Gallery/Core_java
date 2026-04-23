class MobileR{
	public static void main(String[] args){
		Mobile mobile = new Apps(); 
		if(mobile instanceof Apps){
		Apps apps =(Apps)mobile;
		apps.GameApps();
		apps.EditingApps();
		}
	}
}