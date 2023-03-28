
public class Employee {
	String name;
	double salary;
	double workHours;
	int hireYear;
	
	Employee(String name,double salary,double workHours,int hireYear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	public double tax() {
		double tax;
		if (this.salary<=1000) {
			System.out.println("Vergi kesintisi yapılmamıştır.");
			return 0;
		}else {
			tax=this.salary*0.03;
			System.out.println("Vergi kesintisi : "+tax);
			return tax;
		}
	}
	public double bonus() {
		double extraHours;
		if (this.workHours>40) {
			extraHours=this.workHours-40;
			extraHours*=30;
			return extraHours;
		}
		else {
			System.out.println("Ekstra bir ücret kazanamadınız : ");
			return 0;
		}
	}
	public double raiseSalary() {//2021 olarak alıyorum şimdiki yılı.
		int workYear=2021-this.hireYear;;
		double riseSalary=1.0;
		if (workYear<=9) {
			riseSalary=this.salary*0.05;
			System.out.println("Maaş zammınız : "+riseSalary);
			return riseSalary;
		}
		else if (workYear>9&&workYear<20) {
			riseSalary=this.salary*0.1;
			System.out.println("Maaş zammınız : "+riseSalary);
			return riseSalary;
		}
		else {
			riseSalary=this.salary*0.15;
			System.out.println("Maaş zammınız : "+riseSalary);
			return riseSalary;
		}
	}
	public void taxAndBonus(){
		double taxAndBonus=this.salary-this.tax()+this.bonus();
		System.out.println("Vergi ve maaşlarla birlikte maaş : "+taxAndBonus);
		
	}
	public void toplamMaas() {
		double toplamMaas=this.raiseSalary()+this.salary;
		System.out.println("Toplam maaş : "+toplamMaas);
	}
	public void GetSalary(){
		System.out.println("Çalışan İsim Soyisim : "+this.name);
		System.out.println("Çalışan maaşı : "+this.salary);
		System.out.println("Haftalık çalışma saati : "+this.workHours);
		System.out.println("İşe başlangıç yılı : "+this.hireYear);
	}
}
