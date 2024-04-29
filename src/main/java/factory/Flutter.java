package factory;

public class Flutter {
	
	private SupportingPlatforms supportingPlatforms;
	public Flutter(SupportingPlatforms supportingPlatforms) {
		this.supportingPlatforms = supportingPlatforms;
	}
	
	public void setTheme() {
		System.out.println("Flutter theme");
	}
	
	public void setRefreshRate() {
		System.out.println("Flutter refresh rate");
	}
	
	public UIFactory createUIFactory() {
		return UIFactoryFactory.getPlatformForUIFactory(supportingPlatforms);
	}

}
