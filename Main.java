import java.util.Scanner;

class Main{
	public static void main(String args[]){
		
		Scanner t = new Scanner(System.in);
		
		Data padrao = new Data();
		padrao.setYear(2015);
		padrao.setMonth(7);
		padrao.setDay(1);
		
		Data datas[] = new Data[10];
		
		for(int i = 0; i < datas.length; i++){
			datas[i] = new Data();
			
			System.out.println("Digite o Ano:");
			datas[i].setYear(t.nextInt());
			
			System.out.println("Digite o Mes:");
			datas[i].setMonth(t.nextInt());
			
			System.out.println("Digite o Dia:");
			datas[i].setDay(t.nextInt());			
		}
		
		for(int j = 0; j < datas.length; j++){
			
		}
		
	}
}
