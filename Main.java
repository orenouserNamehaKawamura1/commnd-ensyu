public class Main{
	public static void main(String[] args){
		double[] height = new double{1.78,1.75};
		double[] weight = new double{80,70};
		for(int i=0; i<2;i++){
		double BMI = weight[i]/(height[i]*height[i]);
		String bmi = String.format("%.2f",BMI);
		System.out.println(bmi);
	}
}
