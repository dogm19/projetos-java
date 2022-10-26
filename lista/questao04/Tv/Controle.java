package Tv;

public class Controle {
  
	  public void aumentarVolume(Televisao tv){
	    tv.setVolume(tv.getVolume() + 1);
	  }
	
	  public void diminuirVolume(Televisao tv){
	    tv.setVolume(tv.getVolume() - 1);
	  }
	
	  public void aumentarCanal(Televisao tv){
	    tv.setCanal(tv.getCanal() + 1);
	  }
	
	  public void diminuirCanal(Televisao tv){
	    tv.setCanal(tv.getCanal() - 1);
	  }
	
	  public void escolherCanal(Televisao tv){
	    tv.setCanal(tv.getCanal());
	  }
	
	  public void visualizar(Televisao tv){
	    System.out.println("Canal: " + tv.getCanal());
	    System.out.println("Volume: " + tv.getVolume());
	  }
}
