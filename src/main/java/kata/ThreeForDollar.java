package kata;

public interface ThreeForDollar extends PackagePricing {
	
	public  String  libelle ="ThreeForDollar";
	
	default public String getPricingLibelle() {
		return libelle;
	}

}
