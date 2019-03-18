/* To calculate cost of constructions for for various standards and specifications 
 * STD-stands for standard type
 * ASTD-stands for above standard type
 * HSTD-stands for High standard type
 * author-K.HariHaraChaitanya project-Construction cost
 */
public class Constructioncost {
	public static final int COSTSFT_STD=1200;
	public static final int COSTSFT_ABOVESTD=1500;
	public static final int COSTSFT_HIGHSTD=1800;
	public static final int COSTSFT_HIGHSTD_AUTOMATED=2500;
	
	// method for calculating cost
	int totalConstructionCost(String material,int totalArea,boolean automated) {
		 if(material.equals("STD")) return totalArea*COSTSFT_STD;
		 if (material.equals("ASTD")) return totalArea*COSTSFT_ABOVESTD;
		 if(material.equals("HSTD") && !automated) return totalArea*COSTSFT_HIGHSTD;
		 if(material.equals("HSTD") && automated) return totalArea*COSTSFT_HIGHSTD_AUTOMATED;
		 return -1;
	}
}
