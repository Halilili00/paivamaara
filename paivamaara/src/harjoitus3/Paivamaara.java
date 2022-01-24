package harjoitus3;

import java.util.StringTokenizer;

public class Paivamaara {
	private int paiva,kuukausi,vuosi;
	
	@Override
	public String toString() {
		return "P‰iv‰m‰‰r‰: " + paiva + "." + kuukausi + "." + vuosi + "";
	}
	public int getPaiva() {
		return paiva;
	}
	public void setPaiva(int paiva) {
		this.paiva = paiva;
	}
	public int getKuukausi() {
		return kuukausi;
	}
	public void setKuukausi(int kuukausi) {
		this.kuukausi = kuukausi;
	}
	public int getVuosi() {
		return vuosi;
	}
	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}
	public Paivamaara(String paivays) {
		StringTokenizer st = new StringTokenizer(paivays,".");
		setPaiva(Integer.parseInt(st.nextToken()));
		setKuukausi(Integer.parseInt(st.nextToken()));
		setVuosi(Integer.parseInt(st.nextToken()));
	}
	public Paivamaara() {
		paiva=getPaiva();
		kuukausi=getKuukausi();
		vuosi=getVuosi();	
	}
	public boolean onSama (Paivamaara toinen) {
		if(toinen.paiva== this.paiva && toinen.kuukausi==this.kuukausi && toinen.vuosi==this.vuosi)
			return true;
		else
			return false;
	}

}
