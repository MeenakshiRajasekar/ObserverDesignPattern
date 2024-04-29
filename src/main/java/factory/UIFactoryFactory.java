package factory;

public class UIFactoryFactory {
	
	public static UIFactory getPlatformForUIFactory(SupportingPlatforms supportingPlatforms) {
		
		if(supportingPlatforms == SupportingPlatforms.Android) {
			return new AndroidUIFactory();
		}
		
		if(supportingPlatforms == SupportingPlatforms.IOS) {
			return new IOSFactory();
		}
		
		return null;
		
	}

}
