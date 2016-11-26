package ar.edu.unlam.pb2.tragamonedas;

public class Tragamonedas {
	
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	private	Integer result1;
	private Integer result2;
	private Integer result3;
	private Boolean gameover;
	
	public Tragamonedas(Tambor tambor1, Tambor tambor2, Tambor tambor3){
		this.tambor1 = tambor1;
		this.tambor2 = tambor2;
		this.tambor3 = tambor3;
	}
	
	public void girarTambores(){
		this.result1 = this.tambor1.girarTambor();
		this.result2 = this.tambor2.girarTambor();
		this.result3 = this.tambor3.girarTambor();
	}
	
	public Integer getResultado1(){
		return this.result1;
	}
	
	public Integer getResultado2(){
		return this.result2;
	}
	
	public Integer getResultado3(){
		return this.result3;
	}
	
	public Boolean finJuego(){
		if(result1 == result2 && result2 == result3){
			gameover = false;
		}else{
			gameover = true;
		}
		return gameover; 
	}

}
