package Employee_Class_Practice;

public class Employee {
    private String isim;
    private double maas;
    private int calisma_saat, ise_alim_yili;

    Employee(int ise_alim_yili,int calisma_saat,double maas,String isim){
        this.isim = isim;
        this.maas = maas;
        this.calisma_saat = calisma_saat;
        this.ise_alim_yili = ise_alim_yili;
    }

    public double vergi(){
        if(this.maas >= 10000){
            return this.maas * 0.03;
        }
        else {
            return 0.0;
        }
    }

    public double bonus(){
        int ekstrasaat = this.calisma_saat - 40;
        if (ekstrasaat > 0)
        {return 30 * ekstrasaat;}
        return  0.0;
    }

    public double maas_artisi(){
        int yil = 2026 - this.ise_alim_yili;
        if(yil<10){
            return this.maas * 0.05;
        } else if (yil >=10 && yil < 20 ) {
            return this.maas * 0.10;
        } else {
            return this.maas * 0.15;
        }

    }
    public String toString() {
        double netMaas = this.maas - this.vergi() + this.bonus();
        double toplamMaas = this.maas + this.maas_artisi();


        return "Adı : " + this.isim + "\n" +
                "Maaşı : " + this.maas + "\n" +
                "Çalışma Saati : " + this.calisma_saat + "\n" +
                "Başlangıç Yılı : " + this.ise_alim_yili + "\n" +
                "Vergi : " + this.vergi() + "\n" +
                "Bonus : " + this.bonus() + "\n" +
                "Maaş Artışı : " + this.maas_artisi() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + netMaas + "\n" +
                "Toplam Maaş : " + toplamMaas;
    }

}


