   //amino acid sort
 import java.util.Arrays;
public class Sort
{
	public static void main(String args[])
	{
		String[] aminoacid = {"Alanine","Glycine","Tryptophan","Lysine","Proline",
		"Isoleucine","Asparagine","Phenylalanine","Leucine","Arginine","Cysteine",
		"Valine","Methionine","Asparagine","Histidine","Glutamine","Serine",
		"Glutamic acid","Tyrosine","Threonine"};
		Arrays.sort(aminoacid); 
		System.out.print("Alphabetical oder of amino acids : ");
		System.out.println( Arrays.toString(aminoacid) ); 
	}
}

