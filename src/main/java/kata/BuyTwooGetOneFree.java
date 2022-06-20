package kata;

public interface BuyTwooGetOneFree extends PackagePricing {
	
	public final String  libelle ="BuyTwooGetOneFree";

	default public String getPricingLibelle() {
		return libelle;
	}
}
