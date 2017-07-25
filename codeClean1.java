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


// UTILIZAR NOMBRES QUE SE PUEDA PRONUNCIAR

class DtaRcrd02{
	private Date genymdhms;
	private Date modymdhms;
	...
}
class Customer{
	private Date generationTimeStamp;
	private Date modificationsTimeStamp;
	...
}


//PREFIJOS DE MIEMBROS
public class Part {
	private String  m_dsc
	void setNanme(String name){
	m_dsc = name;
	}

}

public class Part {
	private String  description	
	void setNanme(String description){
	description = description;
	}
}

//INTERFACES E IMPLMENTACIONES

class interface shapeFactory

class shapeFactoryImp implments shapeFactory


//************************************************************************************************************

// MULTI
(function(){

    var firstName = 'John',
        lastName = 'Doe',
        fullName = firstName + ' ' + lastName;
        
    // The rest of the function body
}());


// use strict
(function(){

    name = 'John';
}());

(function(){

    'use strict';
    name = 'John';
	
}());
