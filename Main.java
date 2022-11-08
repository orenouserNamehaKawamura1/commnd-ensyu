public class Main{
	public static void main(String[] args){
		double height = 1.78;
		double weight = 80;
		double BMI = weight/(height*height);
		String bmi = String.format("%.2f",BMI);
		System.out.println(bmi);
	}
}
