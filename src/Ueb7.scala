object Ueb7 extends App {

  def eingabenAbrufen(frame: Int) = if (frame == 100) -1 else 1

  def spiellogikAusfuehren(frame: Int, eingabe: Int, spielzustand: Int) = {
    spielzustand + eingabe
  }

  def auseAnzeigen(spielzustand: Int) {
    println("Zustand " + spielzustand)
  }

  def mainloop(frame: Int = 0, spielzustand: Int = 0): Unit = {
    val eingabe = eingabenAbrufen(frame)
    val neuerSpielzustand = spiellogikAusfuehren(frame, eingabe, spielzustand)
    ausgabeAnzeigen(neuerSpielzustand)
    Thread.sleep(100)
    if (eingabe != -1)
	    mainloop(frame + 1, neuerSpielzustand)
  }
  
  mainloop()
}