public class Amino_acid
{
    public static void main(String[] args) 
    {

        String amino_acids[]={
                        "alanine", "cysteine", "aspartic acid", "glutamic acid", "phenylalanine",
                        "glycine", "histidine", "isoleucine", "lysine", "leucine",
                        "methionine", "asparagine", "proline", "glutamine", "arginine", 
                        "serine", "threonine", "valine", "tryptophan", "tyrosine", 
                    };
        double[] mw = {
            89.1, 121.2, 133.1, 147.1, 	165.2, 	75.1, 	155.2, 	131.2, 	146.2, 	131.2,
            149.2, 132.1, 115.1,  146.2, 	174.2, 	105.1, 	119.1, 	117.1, 	204.2, 	181.2
        };
        
        for(int i = 0; i < 20; i++)
        {
            System.out.println("The molecular weight of "+amino_acids[i] + " is : " + mw[i]+" Da.");

