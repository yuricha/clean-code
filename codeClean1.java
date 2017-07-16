// El nombre de una variable : porque existe, que hace y como se usa

int d; //tiempo transcurrido en dias

int elapsedTimeInDays;
int daysSinceCreations;
int daysSinceModifications;

// Elecciòn revelen intenciones

public List<int[ ]> getThem(){
	List<int[ ]> listl = new ArrayList<>();
	for(int []x: theList){
		if(x[0]==5){
			listl.add(x);
		}
	}
	return listl;
}
// què contiene theList ?
//que signifca el subindice
// importancia del valor 5
// como se usa el return

public List<int[ ]> getFlaggedCells(){
	List<int[ ]> flaggedCells = new ArrayList<>();
	for(int [] cell: gameBoard){
		if(cell[STATUS_VALUE]==FLAGGED){
			flaggedCells.add(cell);
		}
	}
	return flaggedCells;
}
//asignar nombres
// clases metodos

public List<int[ ]> getFlaggedCells(){
	List<Cell> flaggedCells = new ArrayList<>();
	for(Cell cells: gameBoard){
		if(cell.isFlagged()){
			flaggedCells.add(x);
		}
	}
	return flaggedCells;
}



//EVITAR DESINFORMACION
// constantes y numeros
int a=1;
if(o==1)
	a=Ol;
else
	l= 01;


