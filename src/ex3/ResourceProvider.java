package ex3;

public class ResourceProvider {
	public ResourceProvider() {
		System.out.println("Provider constructor");
	}
	
	private static ResourceProvider provider1;
	
	public static ResourceProvider getProvider() {
		System.out.println("Provider Singleton");
		
		if(provider1 == null)
			provider1 = new ResourceProvider();
		
		return provider1;
	}
}
